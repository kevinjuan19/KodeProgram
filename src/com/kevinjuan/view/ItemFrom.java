/**
 * @author Kevin Juan(1972002)
 */
package com.kevinjuan.view;


import com.kevinjuan.entity.Category;
import com.kevinjuan.entity.Item;

import javax.imageio.metadata.IIOInvalidTreeException;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ItemFrom {
    private JPanel rootPanel;
    private JTable table1;
    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtPrice;
    private JComboBox cbCategory;
    private JButton saveButton;
    private JButton updateButton;
    private JButton resetButton;
    private JMenuItem addCategory;
    private JMenu File;
    private JMenuItem Exit;
    private JMenu Help;
    private JMenuItem About;
    private Item selectedItem;
    private int selectedIndex;

    public ItemFrom (){
        addCategory.setAccelerator(KeyStroke.getKeyStroke("control F1"));
        About.setAccelerator(KeyStroke.getKeyStroke("F1"));
        Exit.setAccelerator(KeyStroke.getKeyStroke("control shift Q"));

        List<Category> categories = new ArrayList<>();
        addCategory.addActionListener(e -> {
            String CName = JOptionPane.showInputDialog("Add Category name");
            int id;
            if(categories.isEmpty()){
                id = 0;
            }else  {
                id = categories.size()+1;
            }
            categories.add(new Category(id,CName));
            DefaultComboBoxModel<Category> categoryDefaultComboBoxModel =
                    new DefaultComboBoxModel<>(categories.toArray(new Category[0]));
            cbCategory.setModel(categoryDefaultComboBoxModel);
        });

        List<Item> items = new ArrayList<>();

        ItemTableModel itemTableModel = new ItemTableModel(items);
        table1.setModel(itemTableModel);

        saveButton.addActionListener(e -> {
            if(txtId.getText().isEmpty() || txtPrice.getText().isEmpty() || txtName.getText().isEmpty()|| categories.isEmpty()){
                JOptionPane.showMessageDialog(rootPanel,"Please fill in all field","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                    String tId = txtId.getText();
                    int Id = Integer.parseInt(tId);
                    String tPrice = txtPrice.getText();
                    int Price = Integer.parseInt(tPrice);
                    String Name = txtName.getText();
                    Item item = new Item();
                    item.setId(Id);
                    item.setPrice(Price);
                    item.setName(Name);
                    item.setCategory((Category) cbCategory.getSelectedItem());
                    items.add(item);
                    itemTableModel.fireTableDataChanged();
                    clearAndReset();
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(rootPanel,"Please Input 'ID' and 'PRICE' With number! ","Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        updateButton.addActionListener(e -> {
            String tId = txtId.getText();
            int Id = Integer.parseInt(tId);
            String tPrice = txtPrice.getText();
            int Price = Integer.parseInt(tPrice);
            String Name = txtName.getText();
            selectedItem.setId(Id);
            selectedItem.setPrice(Price);
            selectedItem.setName(Name);
            selectedItem.setCategory((Category) cbCategory.getSelectedItem());
            items.set(selectedIndex,selectedItem);
            itemTableModel.fireTableDataChanged();
            clearAndReset();
        });
        resetButton.addActionListener(e -> {
            clearAndReset();
        });
        table1.getSelectionModel().addListSelectionListener(e -> {
            if (!table1.getSelectionModel().isSelectionEmpty()){
                selectedIndex = table1.convertRowIndexToModel(table1.getSelectedRow());
                selectedItem = items.get(selectedIndex);
                if(selectedItem != null){
                    txtId.setText(String.valueOf(selectedItem.getId()));
                    txtName.setText(selectedItem.getName());
                    txtPrice.setText(String.valueOf(selectedItem.getPrice()));
                    cbCategory.setSelectedItem(selectedItem.getCategory());
                    saveButton.setEnabled(false);
                    updateButton.setEnabled(true);
                }
            }
        });
        Exit.addActionListener(e -> {
            System.exit(0);
        });
        About.addActionListener(e -> {
            JOptionPane.showMessageDialog(rootPanel,"Projek ini dibuat oleh Kevin Juan 1972002","About",JOptionPane.INFORMATION_MESSAGE);
        });
    }

    private void clearAndReset(){
        txtId.setText("");
        txtName.setText("");
        txtPrice.setText("");
        table1.clearSelection();
        saveButton.setEnabled(true);
        updateButton.setEnabled(false);
        selectedItem = null;
        selectedIndex = -1;
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("ItemFrom");
        frame.setContentPane(new ItemFrom().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(720,350);
        frame.setVisible(true);
        frame.setBackground(Color.CYAN);
    }
    private static class ItemTableModel extends AbstractTableModel{
        private final String[] COLOUMS = {"ID","NAME","PRICE", "CATEGORY"};
        private List<Item> items ;


        public ItemTableModel(List<Item> items) {
            this.items = items;
        }

        @Override
        public int getRowCount() {
            return items.size();
        }

        @Override
        public int getColumnCount() {
            return COLOUMS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> items.get(rowIndex).getId();
                case 1 -> items.get(rowIndex).getPrice();
                case 2 -> items.get(rowIndex).getName();
                case 3 -> items.get(rowIndex).getCategory().getName();
                default -> "-";
            };
        }

        @Override
        public String getColumnName(int column) {
            return COLOUMS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if(getValueAt(0,columnIndex)!= null){
                return getValueAt(0,columnIndex).getClass();
            }else{
                return Object.class;
            }
        }
    }
}
