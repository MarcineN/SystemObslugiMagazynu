/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularze;

import java.sql.Connection;

/**
 *
 * @author Marcin
 */
public class ListaBledow {
    
    private int id_b;
    private String login_u;
    private String tytul;
    private String data;
    private String opis;
    private String status; // 1 - rozpatrzony 2 - nierozpatrzony 3 - neutralny 4 - priorytet
    
    private static Connection con;

    public ListaBledow(Connection con,int id_b, String login_u, String tytul, String data, String opis, String status) {
        this.con = con;
        this.id_b = id_b;
        this.login_u = login_u;
        this.tytul = tytul;
        this.data = data;
        this.opis = opis;
        this.status = status;
    }

    public int getId_b() {
        return id_b;
    }

    public String getLogin_u() {
        return login_u;
    }

    public String getTytul() {
        return tytul;
    }

    public String getData() {
        return data;
    }

    public String getOpis() {
        return opis;
    }
    
    public String getStatus(){
        return status;
    }
    
}
