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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcin
 */
public class FormDodajUzytkownika extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;

    private static Connection con;

    /**
     * Creates new form FormDodajUzytkownika
     */
    public FormDodajUzytkownika(Connection con) {
        initComponents();
        wypelnijTyp();
        this.con = con;
        this.setLocationRelativeTo(null);
    }

    public FormDodajUzytkownika() {
        initComponents();
        wypelnijTyp();
        this.con = con;
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
        gradientStopka = new keeptoo.KGradientPanel();
        textStopkaL = new javax.swing.JLabel();
        textStopkaP = new javax.swing.JLabel();
        gradientGlowny = new keeptoo.KGradientPanel();
        textLogin = new javax.swing.JLabel();
        poleLogin = new javax.swing.JTextField();
        textImie = new javax.swing.JLabel();
        poleImie = new javax.swing.JTextField();
        textNazwisko = new javax.swing.JLabel();
        textTypKonta = new javax.swing.JLabel();
        poleWyborTyp = new javax.swing.JComboBox<>();
        przyciskDodaj = new javax.swing.JButton();
        przyciskAnuluj = new javax.swing.JButton();
        textId = new javax.swing.JLabel();
        textId2 = new javax.swing.JLabel();
        textHaslo = new javax.swing.JLabel();
        poleHaslo = new javax.swing.JPasswordField();
        poleNazwisko = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
        textNaglowek.setText("DODAWANIE UŻYTKOWNIKA");

        javax.swing.GroupLayout gradientNaglowekLayout = new javax.swing.GroupLayout(gradientNaglowek);
        gradientNaglowek.setLayout(gradientNaglowekLayout);
        gradientNaglowekLayout.setHorizontalGroup(
            gradientNaglowekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientNaglowekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textNaglowek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        getContentPane().add(gradientNaglowek, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 50));

        gradientStopka.setkEndColor(new java.awt.Color(98, 98, 98));
        gradientStopka.setkGradientFocus(600);
        gradientStopka.setkStartColor(new java.awt.Color(41, 59, 76));

        textStopkaL.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        textStopkaL.setForeground(new java.awt.Color(255, 255, 255));
        textStopkaL.setText(" ver. 1.0.0");
        textStopkaL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textStopkaP.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        textStopkaP.setForeground(new java.awt.Color(255, 255, 255));
        textStopkaP.setText("Copyright © Projekt i kodowanie: Marcin Kos");
        textStopkaP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout gradientStopkaLayout = new javax.swing.GroupLayout(gradientStopka);
        gradientStopka.setLayout(gradientStopkaLayout);
        gradientStopkaLayout.setHorizontalGroup(
            gradientStopkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientStopkaLayout.createSequentialGroup()
                .addComponent(textStopkaL, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textStopkaP, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        gradientStopkaLayout.setVerticalGroup(
            gradientStopkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textStopkaL, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
            .addComponent(textStopkaP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(gradientStopka, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 460, 20));

        gradientGlowny.setkEndColor(new java.awt.Color(44, 62, 80));
        gradientGlowny.setkStartColor(new java.awt.Color(44, 62, 80));

        textLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textLogin.setForeground(new java.awt.Color(255, 255, 255));
        textLogin.setText("Login:");

        poleLogin.setBackground(new java.awt.Color(108, 122, 137));
        poleLogin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        poleLogin.setForeground(new java.awt.Color(255, 255, 255));
        poleLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));

        textImie.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textImie.setForeground(new java.awt.Color(255, 255, 255));
        textImie.setText("Imie:");

        poleImie.setBackground(new java.awt.Color(108, 122, 137));
        poleImie.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        poleImie.setForeground(new java.awt.Color(255, 255, 255));
        poleImie.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));

        textNazwisko.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textNazwisko.setForeground(new java.awt.Color(255, 255, 255));
        textNazwisko.setText("Nazwisko:");

        textTypKonta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textTypKonta.setForeground(new java.awt.Color(255, 255, 255));
        textTypKonta.setText("Typ konta:");

        poleWyborTyp.setBackground(new java.awt.Color(108, 122, 137));
        poleWyborTyp.setForeground(new java.awt.Color(108, 122, 137));

        przyciskDodaj.setBackground(new java.awt.Color(75, 119, 190));
        przyciskDodaj.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        przyciskDodaj.setForeground(new java.awt.Color(255, 255, 255));
        przyciskDodaj.setText("Dodaj");
        przyciskDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskDodajActionPerformed(evt);
            }
        });

        przyciskAnuluj.setBackground(new java.awt.Color(246, 71, 71));
        przyciskAnuluj.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        przyciskAnuluj.setForeground(new java.awt.Color(255, 255, 255));
        przyciskAnuluj.setText("Anuluj");
        przyciskAnuluj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                przyciskAnulujMouseClicked(evt);
            }
        });
        przyciskAnuluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskAnulujActionPerformed(evt);
            }
        });

        textId.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        textId.setForeground(new java.awt.Color(255, 255, 255));

        textId2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        textId2.setForeground(new java.awt.Color(255, 255, 255));

        textHaslo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textHaslo.setForeground(new java.awt.Color(255, 255, 255));
        textHaslo.setText("Hasło:");

        poleHaslo.setBackground(new java.awt.Color(108, 122, 137));
        poleHaslo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        poleHaslo.setForeground(new java.awt.Color(255, 255, 255));
        poleHaslo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));

        poleNazwisko.setBackground(new java.awt.Color(108, 122, 137));
        poleNazwisko.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        poleNazwisko.setForeground(new java.awt.Color(255, 255, 255));
        poleNazwisko.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));

        javax.swing.GroupLayout gradientGlownyLayout = new javax.swing.GroupLayout(gradientGlowny);
        gradientGlowny.setLayout(gradientGlownyLayout);
        gradientGlownyLayout.setHorizontalGroup(
            gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientGlownyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientGlownyLayout.createSequentialGroup()
                        .addComponent(textId2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientGlownyLayout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(gradientGlownyLayout.createSequentialGroup()
                                .addComponent(textTypKonta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(poleWyborTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientGlownyLayout.createSequentialGroup()
                                    .addComponent(textImie)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(poleImie, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(gradientGlownyLayout.createSequentialGroup()
                                    .addComponent(textLogin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(poleLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(gradientGlownyLayout.createSequentialGroup()
                                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textHaslo)
                                    .addComponent(textNazwisko))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(poleNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poleHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(98, 98, 98))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientGlownyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(przyciskDodaj)
                .addGap(18, 18, 18)
                .addComponent(przyciskAnuluj)
                .addGap(115, 115, 115))
        );
        gradientGlownyLayout.setVerticalGroup(
            gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientGlownyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textId)
                    .addComponent(textId2))
                .addGap(18, 18, 18)
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poleLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textImie)
                    .addComponent(poleImie, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNazwisko)
                    .addComponent(poleNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textHaslo)
                    .addComponent(poleHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTypKonta)
                    .addComponent(poleWyborTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(gradientGlownyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(przyciskDodaj)
                    .addComponent(przyciskAnuluj))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(gradientGlowny, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 460, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textWyjscieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textWyjscieMouseClicked
        this.dispose();

    }//GEN-LAST:event_textWyjscieMouseClicked

    private void textMinimalizujMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMinimalizujMouseClicked
        this.setState(FormDodajUzytkownika.ICONIFIED);
    }//GEN-LAST:event_textMinimalizujMouseClicked

    private void gradientNaglowekMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradientNaglowekMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_gradientNaglowekMouseDragged

    private void gradientNaglowekMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradientNaglowekMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_gradientNaglowekMousePressed

    private void przyciskDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskDodajActionPerformed
        WalidatorDanych WL = new WalidatorDanych();
        String bledy = "";

        String imie = poleImie.getText();
        String nazwisko = poleNazwisko.getText();
        String login = poleLogin.getText();
        String typ = poleWyborTyp.getSelectedItem().toString();
        int ID;

        WL.sprawdz("Imie", imie, 8, 45);
        WL.sprawdz("Nazwisko", nazwisko, 8, 45);
        WL.sprawdz("Login", login, 8, 45);
        bledy += WL.getZnalezioneBledy();

        if (!bledy.equals("")) {
            JOptionPane.showMessageDialog(this, bledy, "Błąd!", 2);
            WL.usunBledy();
        } else {
            Object[] opcje = {"Tak", "Nie"};
            int czy_napewno = JOptionPane.showOptionDialog(this, "Potwierdz dodanie użytkownika o danych: \nLogin: " + login + "\nImie: " + imie + "\nNazwisko: " + nazwisko + "\nTyp: " + typ, "Dodawanie uzytkownika", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcje, opcje[0]);
            if (czy_napewno == 0) {
                try {
                    con.setAutoCommit(false);
                    PreparedStatement dodajUzytk;
                    PreparedStatement pobierzID;
                    ResultSet wynikId;
                    DateFormat df = new SimpleDateFormat("yyy-MM-dd");
                    Date data = new Date();
                    String query = "INSERT INTO uzytkownicy (login,haslo,imie,nazwisko,data_rejestracji,typ_konta) VALUES (?,?,?,?,?,?)";
                    String query2 = "SELECT id_u FROM uzytkownicy WHERE login='" + login + "'";
                    String query3 = "INSERT INTO notatki (typ_notatki,id_u) VALUES (0,?)";
                    dodajUzytk = con.prepareStatement(query);
                    dodajUzytk.setString(1, login);
                    dodajUzytk.setString(2, SzyfrowanieMd5.zaszyfruj(poleHaslo.getText()));
                    dodajUzytk.setString(3, imie);
                    dodajUzytk.setString(4, nazwisko);
                    dodajUzytk.setString(5, df.format(data));
                    dodajUzytk.setString(6, typ);
                    dodajUzytk.executeUpdate();
                    pobierzID = con.prepareStatement(query2);
                    wynikId = pobierzID.executeQuery();
                    wynikId.next();
                    ID = wynikId.getInt(1);
                    dodajUzytk = con.prepareStatement(query3);
                    dodajUzytk.setInt(1, ID);
                    dodajUzytk.executeUpdate();                    
                    con.commit();
                    JOptionPane.showMessageDialog(this, "Użytkownik został dodany!", "Dodawanie użytkownika", 2);
                    this.dispose();
                    con.setAutoCommit(true);
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(this, ex, "Błąd!", 2);
                   this.dispose();
                }
            }
        }
    }//GEN-LAST:event_przyciskDodajActionPerformed

    private void przyciskAnulujMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_przyciskAnulujMouseClicked
        poleLogin.setText("");
        poleImie.setText("");
        poleNazwisko.setText("");
        poleHaslo.setText("");
        poleWyborTyp.setSelectedIndex(0);
    }//GEN-LAST:event_przyciskAnulujMouseClicked

    private void przyciskAnulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskAnulujActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_przyciskAnulujActionPerformed

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
            java.util.logging.Logger.getLogger(FormDodajUzytkownika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDodajUzytkownika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDodajUzytkownika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDodajUzytkownika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDodajUzytkownika().setVisible(true);
            }
        });
    }

    public void wypelnijTyp() {
        poleWyborTyp.addItem("Użytkownik");
        poleWyborTyp.addItem("Administrator");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel gradientGlowny;
    private keeptoo.KGradientPanel gradientNaglowek;
    private keeptoo.KGradientPanel gradientStopka;
    private javax.swing.JPasswordField poleHaslo;
    private javax.swing.JTextField poleImie;
    private javax.swing.JTextField poleLogin;
    private javax.swing.JTextField poleNazwisko;
    private javax.swing.JComboBox<String> poleWyborTyp;
    private javax.swing.JButton przyciskAnuluj;
    private javax.swing.JButton przyciskDodaj;
    private javax.swing.JLabel textHaslo;
    private javax.swing.JLabel textId;
    private javax.swing.JLabel textId2;
    private javax.swing.JLabel textImie;
    private javax.swing.JLabel textLogin;
    private javax.swing.JLabel textMinimalizuj;
    private javax.swing.JLabel textNaglowek;
    private javax.swing.JLabel textNazwisko;
    private javax.swing.JLabel textStopkaL;
    private javax.swing.JLabel textStopkaP;
    private javax.swing.JLabel textTypKonta;
    private javax.swing.JLabel textWyjscie;
    // End of variables declaration//GEN-END:variables
}
