/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Marcin
 */
public class PolaczenieBaza {
    
    private static Connection conn;
    static boolean polaczono; // zmienna okreslajaca czy polaczenie z baza sie udalo
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/som?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&characterEncoding=UTF-8", "root","");
            System.out.println("Polaczono!");
            polaczono=true;
        }
        catch(ClassNotFoundException  | SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public static Connection getCon(){
        return conn;
    }
    public static boolean getPolaczenie(){
        return polaczono;
    }

}
