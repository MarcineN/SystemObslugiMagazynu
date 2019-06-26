/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularze;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.util.List;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Marcin
 */
public class MultiLineTable extends JTextArea implements TableCellRenderer {

    public MultiLineTable() {
        setLineWrap(true);
        setWrapStyleWord(true);
        setBorder(BorderFactory.createEmptyBorder());
        
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object obj, boolean isSelected, boolean hasFocus, int row, int column) {
        setText(obj.toString());//or something in value, like value.getNote()..
        if (isSelected) {
            //setForeground(table.getSelectionForeground());
            //setBackground(table.getSelectionBackground());
        } else {
            setForeground(table.getForeground());
            setBackground(table.getBackground());
        }
        setSize(table.getColumnModel().getColumn(column).getWidth(),
                getPreferredSize().height);
        if (table.getRowHeight(row) != getPreferredSize().height) {
            table.setRowHeight(row, getPreferredSize().height);
        }
        return this;
    }
}




