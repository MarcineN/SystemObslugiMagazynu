/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularze;

import java.sql.Connection;

/**
 *
 * @author Admin
 */
public class ListaUzytkownikow {

    private int ID;
    private String login;
    private String imie;
    private String nazwisko;
    private String data_rejestracji;
    private String typ_konta;
    private int zablokowany;

    private Connection con;

    public ListaUzytkownikow(Connection con, int ID, String login, String imie, String nazwisko, String data_rejestracji, String typ_konta, int zablokowany) {
        this.con = con;
        this.ID = ID;
        this.login = login;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_rejestracji = data_rejestracji;
        this.typ_konta = typ_konta;
        this.zablokowany = zablokowany;
    }

    public int getID() {
        return ID;
    }

    public String getLogin() {
        return login;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getData_rejestracji() {
        return data_rejestracji;
    }

    public String getTyp_konta() {
        return typ_konta;
    }

    public int getZablokowany() {
        return zablokowany;
    }

}
