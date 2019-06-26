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
 * @author Admin
 */
public class ListaDokumentow {

    private int ID;
    private String typ;
    private String typ_pelna;
    private String numer;
    private String data_wyst;
    private int id_PZ;
    private int id_WWPW;
    private int id_o;
    private int usuniety;
    private ListaDostawcow nadawca;
    private ListaDostawcow odbiorca;

    private static Connection con;

    public ListaDokumentow(int ID, String typ, String numer, String data_wyst) {
        this.ID = ID;
        this.typ = typ;
        this.numer = numer;
        this.data_wyst = data_wyst;
    }

    public ListaDokumentow(Connection con, int ID) {
        this.con = con;
        this.ID = ID;
        pobierzDane();
    }

    public void pobierzDane() {
        try {
            PreparedStatement pobierz;
            ResultSet wynik;

            String query = "SELECT typy_dokumentow.nazwa, typy_dokumentow.nazwa_pelna, numer,data_wydania,id_PZ,id_WWPW, id_o FROM dokumenty  NATURAL JOIN typy_dokumentow WHERE id_do='" + ID + "' AND usuniety=0";
            pobierz = con.prepareStatement(query);
            wynik = pobierz.executeQuery();
            wynik.next();
            this.typ = wynik.getString(1);
            this.typ_pelna = wynik.getString(2);
            this.numer = wynik.getString(3);
            this.data_wyst = wynik.getString(4);
            this.id_PZ = wynik.getInt(5);
            this.id_WWPW = wynik.getInt(6);
            this.id_o = wynik.getInt(7);
            if (typ.equals("PW") || typ.equals("WW")) {
                nadawca = new ListaDostawcow(con, id_WWPW, 2);
                nadawca.pobierzDane(2);

            } else {
                nadawca = new ListaDostawcow(con, id_PZ, 1);
                nadawca.pobierzDane(1);
            }

            odbiorca = new ListaDostawcow(con, id_o, 2);
            odbiorca.pobierzDane(2);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public int getID() {
        return ID;
    }

    public String getTyp() {
        return typ;
    }

    public String getTyp_pelna() {
        return typ_pelna;
    }

    public String getNumer() {
        return numer;
    }

    public String getData_wyst() {
        return data_wyst;
    }

    public int getId_PZ() {
        return id_PZ;
    }

    public int getId_WWPW() {
        return id_WWPW;
    }

    public int getId_o() {
        return id_o;
    }

    public int getUsuniety() {
        return usuniety;
    }

    public ListaDostawcow getNadawca() {
        return nadawca;
    }

    public ListaDostawcow getOdbiorca() {
        return odbiorca;
    }

    

}
