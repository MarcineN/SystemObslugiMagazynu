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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcin
 */
public class ListaProduktow {

    private int id;  
    private int sektor;
    private double ilosc;
    private double cena;
    private String nazwa;
    private String nazwa_skr;
    private String jdm;
    private String typ;
    private String dostawca;
    private String magazyn;
    private String data_dostawy;
    private String data_wydania;
    private double wartosc;
    private static Connection con;

    public ListaProduktow(Connection con, int id, double ilosc, int sektor, double cena, String nazwa, String nazwa_skr, String jdm, String typ, String dostawca, String magazyn, String data_dostawy, String data_wydania) {

        this.con = con;
        this.id = id;
        this.ilosc = ilosc;
        this.sektor = sektor;
        this.cena = cena;
        this.nazwa = nazwa;
        this.nazwa_skr = nazwa_skr;
        this.jdm = jdm;
        this.typ = typ;
        this.dostawca = dostawca;
        this.magazyn = magazyn;
        this.data_dostawy = data_dostawy;
        this.data_wydania = data_wydania;
    }
    
    public ListaProduktow(Connection con, int id){
        this.con=con;
        this.id=id;
        pobierzDane();
    }

    public void pobierzDane(){
        try {
            PreparedStatement pobierz;
            ResultSet wynik;
            
            String query="SELECT nazwa,nazwa_skr,jdm,ilosc,SUM(ilosc*cena) AS wartosc FROM produkty WHERE id_p='"+id+"'";
            
            pobierz = con.prepareStatement(query);
            wynik = pobierz.executeQuery();
            wynik.next();
            
            this.nazwa=wynik.getString(1);
            this.nazwa_skr=wynik.getString(2);
            this.jdm=wynik.getString(3);
            this.ilosc=wynik.getDouble(4);
            this.wartosc=wynik.getDouble(5);
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }

    public int getId() {
        return id;
    }

    public double getWartosc() {
        return wartosc;
    }

    public double getIlosc() {
        return ilosc;
    }

    public int getSektor() {
        return sektor;
    }

    public double getCena() {
        return cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getNazwa_skr() {
        return nazwa_skr;
    }

    public String getJdm() {
        return jdm;
    }

    public String getTyp() {
        return typ;
    }

    public String getDostawca() {
        return dostawca;
    }

    public String getMagazyn() {
        return magazyn;
    }

    public String getData_dostawy() {
        return data_dostawy;
    }

    public String getData_wydania() {
        return data_wydania;
    }

}
