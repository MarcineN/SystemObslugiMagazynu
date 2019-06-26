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
public class ListaDostawcow {

    private int id;
    private String nazwa;
    private String ulica;
    private String miasto;
    private String kod_poczt;
    private String wojewodztwo;
    private String nip;
    private int ilosc_prod;
    private int zablokowany;

    private static Connection con;

    public ListaDostawcow(Connection con, int id, String nazwa, String ulica, String miasto, String kod_poczt, String wojewodztwo, String nip, int ilosc_prod, int zablokowany) {

        this.con = con;
        this.id = id;
        this.nazwa = nazwa;
        this.ulica = ulica;
        this.miasto = miasto;
        this.kod_poczt = kod_poczt;
        this.wojewodztwo = wojewodztwo;
        this.nip = nip;
        this.ilosc_prod = ilosc_prod;
        this.zablokowany = zablokowany;

    }

    public ListaDostawcow(Connection con, int id, int wer) {
        this.con = con;
        this.id = id;
        pobierzDane(wer);
    }

    public void pobierzDane(int wer) { // 1 dla dostawcy zewnetrznego 2 dla dostawcy wewnetrznego(magazyny)

        PreparedStatement pobierz;
        ResultSet wynik;
        String query = "SELECT nazwa,ulica,miasto,kod_pocztowy,wojewodztwa.wojewodztwo FROM dostawcy NATURAL JOIN wojewodztwa WHERE id_d='" + id + "'";
        String query2 = "SELECT nazwa,ulica,miasto,kod_pocztowy,wojewodztwa.wojewodztwo FROM magazyny NATURAL JOIN wojewodztwa WHERE id_m='" + id + "'";

        try {
            if (wer == 1) {
                pobierz = con.prepareStatement(query);
            } else {
                pobierz = con.prepareStatement(query2);
            }
            wynik = pobierz.executeQuery();
            wynik.next();
            this.nazwa = wynik.getString(1);
            this.ulica = wynik.getString(2);
            this.miasto = wynik.getString(3);
            this.kod_poczt = wynik.getString(4);
            this.wojewodztwo = wynik.getString(5);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getUlica() {
        return ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getWojewodztwo() {
        return wojewodztwo;
    }

    public String getNip() {
        return nip;
    }

    public int getIlosc_prod() {
        return ilosc_prod;
    }

    public String getKod_poczt() {
        return kod_poczt;
    }

    public int getZablokowany() {
        return zablokowany;
    }

}
