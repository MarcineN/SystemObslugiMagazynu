/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularze;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Marcin
 */
public class Uzytkownik {

    private  int id;
    private  String login;
    private  String hashHaslo;
    private  String imie;
    private  String nazwisko;
    private  String data_rej;
    private  String typ_konta;
    private  String czas_logowania;
    private  int zablokowany;
    private  Connection con;

    public Uzytkownik(int id, Connection con) {
        this.id = id;
        this.con = con;
        uzupelnijDane();
        zaloguj();
    }

    public  void uzupelnijDane() {
        PreparedStatement pobierzDane;
        ResultSet wynikDane;

        String query = "SELECT login,imie,nazwisko,haslo,data_rejestracji,typ_konta,zablokowany FROM uzytkownicy WHERE id_u='" + id + "'";
        try {
            
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date data = new Date();
        
            pobierzDane = con.prepareStatement(query);
            wynikDane = pobierzDane.executeQuery(query);
            wynikDane.next();
            login = wynikDane.getString(1);
            imie = wynikDane.getString(2);
            nazwisko = wynikDane.getString(3);
            hashHaslo = wynikDane.getString(4);
            data_rej = wynikDane.getString(5);
            typ_konta = wynikDane.getString(6);
            zablokowany = wynikDane.getInt(7);
            czas_logowania = df.format(data);           
            //System.out.println(login + " " + imie + " " + nazwisko + " " + hashHaslo  + " " + data_rej + " " + typ_konta + " " + czas_logowania + " " + zablokowany);
        } catch (SQLException ex) {
            System.out.println(ex);
        }      
    }
    public void zaloguj(){
        try {
            PreparedStatement zaloguj;
            String query ="UPDATE uzytkownicy SET aktywny=1 WHERE id_u='"+id+"'";
            zaloguj = con.prepareStatement(query);
            zaloguj.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public void wyloguj(){
        try {
            PreparedStatement zaloguj;
            String query ="UPDATE uzytkownicy SET aktywny=0 WHERE id_u='"+id+"'";
            zaloguj = con.prepareStatement(query);
            zaloguj.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getHashHaslo() {
        return hashHaslo;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getData_rej() {
        return data_rej;
    }

    public String getTyp_konta() {
        return typ_konta;
    }
    
    public int getZablokowany(){
        return zablokowany;
    }
    
    public String getCzasLogowania(){
        return czas_logowania;
    }
}
