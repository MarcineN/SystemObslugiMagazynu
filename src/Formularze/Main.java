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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperCompileManager;
//import net.sf.jasperreports.engine.JasperExportManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Marcin
 */
public class Main {

    /* Set the Nimbus look and feel */
    public static void main(String[] args) throws SQLException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Polaczenie z baza i wywolanie formularze */
        Connection conn = PolaczenieBaza.getCon();
        FormLogowanie FL = new FormLogowanie(conn);
        FL.setPolaczenie(PolaczenieBaza.getPolaczenie());
        FL.setBazaTekst();
        FL.setVisible(true);

        System.out.println(SzyfrowanieMd5.zaszyfruj(""));
        
        PreparedStatement t1, t2;
        ResultSet tt2;
        
       
    }
}
