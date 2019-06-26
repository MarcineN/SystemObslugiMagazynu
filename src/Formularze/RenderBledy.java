/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularze;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Marcin
 */
public class RenderBledy extends JButton implements TableCellRenderer {

    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasValue, int row, int column) {
       
        
            JButton b = new JButton("");
            b.setSize(10,10);
           
            return b;
        
    }

}

class MojEditor implements TableCellEditor {

    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {

        JButton b = new JButton("Przycisk");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "Reaguje", "", JOptionPane.CLOSED_OPTION);
            }
        });
        return b;

    }

    public void removeCellEditorListener(CellEditorListener cl) {
    }

    public void addCellEditorListener(CellEditorListener cl) {
    }

    public boolean shouldSelectCell(EventObject ev) {
        return true;
    }

    public boolean isCellEditable(EventObject ev) {
        return true;
    }

    public Object getCellEditorValue() {
        return null;
    }

    public boolean stopCellEditing() {
        return true;
    }

    public void cancelCellEditing() {
    }
}
