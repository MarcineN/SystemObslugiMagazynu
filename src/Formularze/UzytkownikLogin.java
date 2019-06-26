/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularze;


/**
 *
 * @author Marcin
 */

public class UzytkownikLogin {

    private static String login;
    private static String zaszyfrowanehaslo;

    public UzytkownikLogin(String login_, String haslo_) {
        login = login_;
        zaszyfrujHaslo(haslo_);
    }
    public UzytkownikLogin(String haslo_){
        zaszyfrujHaslo(haslo_);
    }

    public static void zaszyfrujHaslo(String haslo) {
        zaszyfrowanehaslo = SzyfrowanieMd5.zaszyfruj(haslo);
    }

    public static String getZaszyfrHaslo() {
        return zaszyfrowanehaslo;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        UzytkownikLogin.login = login;
    }

}
