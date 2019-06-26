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
public class KonfiguracjaSystemu {

    private static String nazwa;
    private static String nazwa_skrot;
    private static String nazwa_firmy;
    private static String strona_www;
    private static int status; // true/false
    private static int ogloszenie; // true/false
    private static String ogloszenie_tekst;
    private static String wiadomosc_powitalna;
    private static String wersja;

    private static Connection con;

    public KonfiguracjaSystemu(Connection con) {
        this.con = con;
        uzupelnijDane();
    }

    public static void uzupelnijDane() {
        try {
            PreparedStatement pobierzDane;
            ResultSet wynikDane;
            String query = "SELECT nazwa_systemu,nazwa_skrot,nazwa_firmy,status,ogloszenie,ogloszenie_tekst,wersja,strona_www,wiadomosc_powitalna FROM ustawienia";

            pobierzDane = con.prepareStatement(query);
            wynikDane = pobierzDane.executeQuery();
            wynikDane.next();
            nazwa = wynikDane.getString(1);
            nazwa_skrot = wynikDane.getString(2);
            nazwa_firmy = wynikDane.getString(3);
            status = wynikDane.getInt(4);
            ogloszenie = wynikDane.getInt(5);
            ogloszenie_tekst = wynikDane.getString(6);
            wersja = wynikDane.getString(7);
            strona_www = wynikDane.getString(8);
            wiadomosc_powitalna = wynikDane.getString(9);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void aktualizujDane() {
        try {
            PreparedStatement aktualizujDane;
            String query = "UPDATE ustawienia SET nazwa_systemu=?, nazwa_skrot=?,nazwa_firmy=?,status=?,ogloszenie=?,ogloszenie_tekst=?,wersja=?, strona_www=?, wiadomosc_powitalna=? WHERE 1";
            aktualizujDane = con.prepareStatement(query);
            aktualizujDane.setString(1, nazwa);
            aktualizujDane.setString(2, nazwa_skrot);
            aktualizujDane.setString(3, nazwa_firmy);
            aktualizujDane.setInt(4, status);
            aktualizujDane.setInt(5, ogloszenie);
            aktualizujDane.setString(6, ogloszenie_tekst);
            aktualizujDane.setString(7, wersja);
            aktualizujDane.setString(8,strona_www);
            aktualizujDane.setString(9,wiadomosc_powitalna);
            aktualizujDane.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static String getNazwa() {
        return nazwa;
    }

    public static String getNazwa_skrot() {
        return nazwa_skrot;
    }

    public static String getNazwa_firmy() {
        return nazwa_firmy;
    }

    public static int getStatus() {
        return status;
    }

    public static int getOgloszenie() {
        return ogloszenie;
    }

    public static String getOgloszenie_tekst() {
        return ogloszenie_tekst;
    }

    public static String getWersja() {
        return wersja;
    }

    public static String getStronaWWW(){
        return strona_www;
        
    }

    public static String getWiadomosc_powitalna() {
        return wiadomosc_powitalna;
    }

    public void setWiadomosc_powitalna(String wiadomosc_powitalna) {
        KonfiguracjaSystemu.wiadomosc_powitalna = wiadomosc_powitalna;
    }
    
    public static void setNazwa(String nazwa) {
        KonfiguracjaSystemu.nazwa = nazwa;
    }

    public static void setNazwa_skrot(String nazwa_skrot) {
        KonfiguracjaSystemu.nazwa_skrot = nazwa_skrot;
    }

    public static void setNazwa_firmy(String nazwa_firmy) {
        KonfiguracjaSystemu.nazwa_firmy = nazwa_firmy;
    }

    public static void setStatus(int status) {
        KonfiguracjaSystemu.status = status;
    }

    public static void setOgloszenie(int ogloszenie) {
        KonfiguracjaSystemu.ogloszenie = ogloszenie;
    }

    public static void setOgloszenie_tekst(String ogloszenie_tekst) {
        KonfiguracjaSystemu.ogloszenie_tekst = ogloszenie_tekst;
    }

    public static void setWersja(String wersja) {
        KonfiguracjaSystemu.wersja = wersja;
    }

    public static void setStronaWWW(String strona_www){
        KonfiguracjaSystemu.strona_www = strona_www;
    }
}
