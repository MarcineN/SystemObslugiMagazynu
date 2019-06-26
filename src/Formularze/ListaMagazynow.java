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
public class ListaMagazynow {


    
    private int id;
    private String nazwa;
    private String ulica;
    private String miasto;
    private String kod_poczt;
    private int sektory;
    private String wojewodztwo;
    private int zablokowany;
    private int usuniety;
    
    private static Connection con;

    public ListaMagazynow(Connection con,int id, String nazwa, String ulica, String miasto, String kod_poczt, int sektory, String wojewodztwo, int zablokowany, int usuniety) {
        
        this.con = con;
        this.id = id;
        this.nazwa = nazwa;
        this.ulica = ulica;
        this.miasto = miasto;
        this.kod_poczt = kod_poczt;
        this.sektory = sektory;
        this.wojewodztwo = wojewodztwo;
        this.zablokowany = zablokowany;
        this.usuniety = usuniety;
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

    public String getKod_poczt() {
        return kod_poczt;
    }

    public int getSektory() {
        return sektory;
    }

    public String getWojewodztwo() {
        return wojewodztwo;
    }
    
     public int getZablokowany() {
        return zablokowany;
    }
     
      public int getUsuniety() {
        return usuniety;
    }
    
    
    
    
}
