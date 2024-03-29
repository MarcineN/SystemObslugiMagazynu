/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularze;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import FunkcjeObslugi.*;

/**
 *
 * @author Marcin
 */
public class FormLogowanie extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    boolean polaczenie; // zmienna okreslajaca czy polaczenie z baza sie udalo
    static Connection con;

    /**
     * Creates new form FormLogowanie
     */
    public FormLogowanie(Connection conn) {
        initComponents();
        setBazaTekst();
        setCon(conn);
        this.setLocationRelativeTo(null);

    }

    public FormLogowanie() {
        initComponents();
        setBazaTekst();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientNaglowek = new keeptoo.KGradientPanel();
        textWyjscie = new javax.swing.JLabel();
        textMinimalizuj = new javax.swing.JLabel();
        textNaglowek = new javax.swing.JLabel();
        gradientGlowny = new keeptoo.KGradientPanel();
        textUzytkownik = new javax.swing.JLabel();
        textHaslo = new javax.swing.JLabel();
        poleUzytkownik = new javax.swing.JTextField();
        poleHaslo = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        textOpis = new javax.swing.JLabel();
        przyciskZaloguj = new javax.swing.JButton();
        przyciskAnuluj = new javax.swing.JButton();
        textBaza = new javax.swing.JLabel();
        textBazaAutomat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradientNaglowek.setkEndColor(new java.awt.Color(65, 131, 215));
        gradientNaglowek.setkGradientFocus(600);
        gradientNaglowek.setkStartColor(new java.awt.Color(58, 83, 155));
        gradientNaglowek.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                gradientNaglowekMouseDragged(evt);
            }
        });
        gradientNaglowek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gradientNaglowekMousePressed(evt);
            }
        });

        textWyjscie.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        textWyjscie.setForeground(new java.awt.Color(255, 255, 255));
        textWyjscie.setText("X");
        textWyjscie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textWyjscie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textWyjscieMouseClicked(evt);
            }
        });

        textMinimalizuj.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        textMinimalizuj.setForeground(new java.awt.Color(255, 255, 255));
        textMinimalizuj.setText("-");
        textMinimalizuj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textMinimalizuj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textMinimalizujMouseClicked(evt);
            }
        });

        textNaglowek.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textNaglowek.setForeground(new java.awt.Color(255, 255, 255));
        textNaglowek.setText("PANEL LOGOWANIA");

        javax.swing.GroupLayout gradientNaglowekLayout = new javax.swing.GroupLayout(gradientNaglowek);
        gradientNaglowek.setLayout(gradientNaglowekLayout);
        gradientNaglowekLayout.setHorizontalGroup(
            gradientNaglowekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientNaglowekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textNaglowek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(textMinimalizuj, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textWyjscie)
                .addGap(21, 21, 21))
        );
        gradientNaglowekLayout.setVerticalGroup(
            gradientNaglowekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientNaglowekLayout.createSequentialGroup()
                .addGroup(gradientNaglowekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textWyjscie)
                    .addComponent(textMinimalizuj, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNaglowek))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(gradientNaglowek, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 50));

        gradientGlowny.setBackground(new java.awt.Color(44, 62, 80));
        gradientGlowny.setkEndColor(new java.awt.Color(44, 62, 80));
        gradientGlowny.setkStartColor(new java.awt.Color(44, 62, 80));
        gradientGlowny.setOpaque(false);

        textUzytkownik.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textUzytkownik.setForeground(new java.awt.Color(255, 255, 255));
        textUzytkownik.setText("Użytkownik:");

        textHaslo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textHaslo.setForeground(new java.awt.Color(255, 255, 255));
        textHaslo.setText("Hasło:");

        poleUzytkownik.setBackground(new java.awt.Color(108, 122, 137));
        poleUzytkownik.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        poleUzytkownik.setForeground(new java.awt.Color(255, 255, 255));
        poleUzytkownik.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));

        poleHaslo.setBackground(new java.awt.Color(108, 122, 137));
        poleHaslo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        poleHaslo.setForeground(new java.awt.Color(255, 255, 255));
        poleHaslo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));
        poleHaslo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                poleHasloKeyPressed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        textOpis.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        textOpis.setForeground(new java.awt.Color(255, 255, 255));
        textOpis.setText("<html> Witam w systemie zarządzania i kontrolowania zawartości magazynów. <br> Zaloguj się aby otrzymać pełen dostęp. <br> W razie jakichkolwiek problemów skontaktuj się z <b>administratorem</b>. </html>");

        przyciskZaloguj.setBackground(new java.awt.Color(75, 119, 190));
        przyciskZaloguj.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        przyciskZaloguj.setForeground(new java.awt.Color(255, 255, 255));
        przyciskZaloguj.setText("Zaloguj");
        przyciskZaloguj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        przyciskZaloguj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskZalogujActionPerformed(evt);
            }
        });

        przyciskAnuluj.setBackground(new java.awt.Color(246, 71, 71));
        przyciskAnuluj.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        przyciskAnuluj.setForeground(new java.awt.Color(255, 255, 255));
        przyciskAnuluj.setText("Anuluj");
        przyciskAnuluj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        przyciskAnuluj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                przyciskAnulujMouseClicked(evt);
            }
        });

        textBaza.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        textBaza.setForeground(new java.awt.Color(255, 255, 255));
        textBaza.setText("Baza danych:");

        textBazaAutomat.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        textBazaAutomat.setForeground(new java.awt.Color(255, 255, 255));
        textBazaAutomat.setText("Nieokreślono");

        javax.swing.GroupLayout gradientGlownyLayout = new javax.swing.GroupLayout(gradientGlowny);
        gradientGlowny.setLayout(gradientGlownyLayout);
        gradientGlownyLayout.setHorizontalGroup(
            gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientGlownyLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gradientGlownyLayout.createSequentialGroup()
                        .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textUzytkownik)
                            .addComponent(textHaslo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(poleUzytkownik)
                            .addComponent(poleHaslo, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                    .addComponent(przyciskZaloguj, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientGlownyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textOpis, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradientGlownyLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(przyciskAnuluj, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientGlownyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textBaza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textBazaAutomat)
                .addContainerGap())
        );
        gradientGlownyLayout.setVerticalGroup(
            gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientGlownyLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUzytkownik)
                    .addComponent(poleUzytkownik, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textHaslo)
                    .addComponent(poleHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(przyciskZaloguj, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(przyciskAnuluj, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(gradientGlownyLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textOpis, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBaza)
                    .addComponent(textBazaAutomat))
                .addContainerGap())
        );

        getContentPane().add(gradientGlowny, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 620, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textWyjscieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textWyjscieMouseClicked
        System.exit(0);
    }//GEN-LAST:event_textWyjscieMouseClicked

    private void textMinimalizujMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMinimalizujMouseClicked
        this.setState(FormLogowanie.ICONIFIED);
    }//GEN-LAST:event_textMinimalizujMouseClicked

    private void przyciskAnulujMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_przyciskAnulujMouseClicked
        poleUzytkownik.setText("");
        poleHaslo.setText("");
    }//GEN-LAST:event_przyciskAnulujMouseClicked

    private void gradientNaglowekMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradientNaglowekMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_gradientNaglowekMouseDragged

    private void gradientNaglowekMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradientNaglowekMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_gradientNaglowekMousePressed

    private void przyciskZalogujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskZalogujActionPerformed
        zaloguj();
    }//GEN-LAST:event_przyciskZalogujActionPerformed

    private void poleHasloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_poleHasloKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            zaloguj();
        }
    }//GEN-LAST:event_poleHasloKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLogowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogowanie().setVisible(true);
            }
        });

    }

    public void wyswietl() {
        new FormLogowanie().setVisible(true);
    }

    public void zaloguj() {

        UzytkownikLogin UL = new UzytkownikLogin(poleUzytkownik.getText(), poleHaslo.getText());
        KonfiguracjaSystemu KS = new KonfiguracjaSystemu(con);

        PreparedStatement pobierzHaslo;
        PreparedStatement pobierzTypIdUzytkownika;

        ResultSet wynikPobierzHaslo;
        ResultSet wynikPobierzTypUzytkownika;

        String query = "SELECT * FROM uzytkownicy WHERE login=? AND haslo=? AND zablokowany=0";
        String query2 = "SELECT typ_konta, id_u FROM uzytkownicy WHERE login='" + UL.getLogin() + "'";

        try {

            pobierzHaslo = con.prepareStatement(query);
            pobierzTypIdUzytkownika = con.prepareStatement(query2);
            String login = UL.getLogin();
            if (login.equals("")) {
                JOptionPane.showMessageDialog(this, "Login i haslo nie moga byc puste!", "Logowanie", 2);
            } else {
                pobierzHaslo.setString(1, login);
                pobierzHaslo.setString(2, UL.getZaszyfrHaslo());
                wynikPobierzHaslo = pobierzHaslo.executeQuery();
                wynikPobierzTypUzytkownika = pobierzTypIdUzytkownika.executeQuery();

                if (wynikPobierzHaslo.next()) {
                    FormGlowny FG = null;
                    if (wynikPobierzTypUzytkownika.next()) {
                        Uzytkownik U = new Uzytkownik(wynikPobierzTypUzytkownika.getInt(2), con);

                        if (KS.getStatus() == 0 && !U.getTyp_konta().equals("Administrator")) { // jestli system jest zamkniety a uzytkownik nie jest adminem
                            JOptionPane.showMessageDialog(this, "System zamknięty, logowanie niemozliwe!", "Logowanie", 2);
                            poleUzytkownik.setText("");
                            poleHaslo.setText("");
                        } else {
                            FG = new FormGlowny(con);
                            FG.setVisible(true);
                            FG.pokazPrzyciskAdmina(wynikPobierzTypUzytkownika.getString(1));
                            FG.setDaneUzytk(U);
                            FG.setKonfiguracja(KS);
                            FG.uzupelnijPanelStartowy();
                            FG.setNazwaUzytkownika(poleUzytkownik.getText());
                            this.dispose();
                        }
                    }                  
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Błędny login lub hasło!", "Logowanie", 2);
                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e, "Błąd!", 2);
        }

    }

    public void setCon(Connection conn) {
        con = conn;
    }

    public void setPolaczenie(boolean pol) {
        polaczenie = pol;
    }

    public void setBazaTekst() {
        if (polaczenie == true) {
            textBazaAutomat.setText("Połączono");
            textBazaAutomat.setForeground(new java.awt.Color(0, 230, 64));
        } else {
            textBazaAutomat.setText("Nie połączono");
            textBazaAutomat.setForeground(new java.awt.Color(242, 38, 19));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel gradientGlowny;
    private keeptoo.KGradientPanel gradientNaglowek;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField poleHaslo;
    private javax.swing.JTextField poleUzytkownik;
    private javax.swing.JButton przyciskAnuluj;
    private javax.swing.JButton przyciskZaloguj;
    private javax.swing.JLabel textBaza;
    private javax.swing.JLabel textBazaAutomat;
    private javax.swing.JLabel textHaslo;
    private javax.swing.JLabel textMinimalizuj;
    private javax.swing.JLabel textNaglowek;
    private javax.swing.JLabel textOpis;
    private javax.swing.JLabel textUzytkownik;
    private javax.swing.JLabel textWyjscie;
    // End of variables declaration//GEN-END:variables
}
