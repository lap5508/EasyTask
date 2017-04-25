/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Kyle
 */
public class ContactUI extends JFrame{
    
    private ContactController c_control = null;
    private JLabel contactLabel;
    private JTextArea contactArea;
    private JScrollPane scrollPane;
    private final int AREA_ROWS = 10;
    private final int AREA_COLS = 50;
    private JPanel listPanel;
    private JPanel navigationPanel;
    private JPanel optionsPanel;
    private JButton menuButton;
    private JButton calendarButton;
    private JButton taskButton;
    private JButton notificationButton;
    private JButton addContact;
    private JButton helpButton;
    private JTable contactTable;
    private JScrollPane theScrollPane;
    
public ContactUI(ContactController newc_control){    
    
    c_control = newc_control;
    createLabelPanel();
    createListPanel();
    createNavigationPanel();
    createOptionsPanel();
    setBounds(0, 0, 750, 700);
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
}
public void createLabelPanel(){
    contactLabel = new JLabel("Contact List", JLabel.CENTER);
    contactLabel.setFont(new Font("Serif", Font.PLAIN, 48));
    add(contactLabel, BorderLayout.NORTH);
}
public void createListPanel(){
    JPanel listPanel = new JPanel();
    contactTable = new JTable(this.c_control.getContactTableModel());
            contactTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            contactTable.getColumnModel().getColumn(1).setPreferredWidth(25);
            contactTable.getColumnModel().getColumn(2).setPreferredWidth(25);
            contactTable.getColumnModel().getColumn(3).setPreferredWidth(25); 
            contactTable.getColumnModel().getColumn(4).setPreferredWidth(25);
            contactTable.getColumnModel().getColumn(5).setPreferredWidth(25);
            contactTable.getColumnModel().getColumn(6).setPreferredWidth(25);
            contactTable.getColumnModel().getColumn(7).setPreferredWidth(25);
    //contactTable.setAutoCreateRowSorter(true);
    TableRowSorter<TableModel> sorter = new TableRowSorter<>(this.c_control.getContactTableModel());
    contactTable.setRowSorter(sorter);
    ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
 
    int columnIndexToSort = 2;
    sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));
 
    sorter.setSortKeys(sortKeys);
    sorter.sort();
    final JTextField filterText = new JTextField("Search Contacts");
    listPanel.add(filterText, BorderLayout.SOUTH);
    JButton filterButton = new JButton("Filter");
    filterButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String text = filterText.getText();
        if (text.length() == 0) {
          sorter.setRowFilter(null);
        } else {
          sorter.setRowFilter(RowFilter.regexFilter(text));
        }
      }
    });
    listPanel.add(filterButton, BorderLayout.SOUTH);
    
    theScrollPane = new JScrollPane(contactTable);
            theScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            theScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            theScrollPane.setPreferredSize(new Dimension(500, 400));
            contactTable.setFillsViewportHeight(true);
    listPanel.add(theScrollPane);
    add(listPanel, BorderLayout.CENTER);
}
public void createNavigationPanel(){
    JPanel navPanel = new JPanel();
    JButton menuButton = new JButton("Menu");
    menuButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    menuButtonPerformed(evt);
                }
            });
    JButton calendarButton = new JButton("Calendar");
    calendarButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    calendarButtonPerformed(evt);
                }
            });
    JButton taskButton = new JButton("Task");
    taskButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    taskButtonPerformed(evt);
                }
            });
    JButton notificationButton = new JButton("Notification");
    notificationButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    notificationButtonPerformed(evt);
                }
            });
    navPanel.setLayout(new GridLayout(1, 3));
    navPanel.add(menuButton);
    //navPanel.add(calendarButton);
    navPanel.add(taskButton);
    navPanel.add(notificationButton);
    add(navPanel, BorderLayout.SOUTH);
}
public void createOptionsPanel(){
    JPanel optionsPanel = new JPanel();
    JButton addContact = new JButton("Add Contact");
    addContact.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    addContactButtonPerformed(evt);
                }
            });
    JButton editButton = new JButton("Edit Contact");
    editButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    editButtonPerformed(evt);
                }
            });
    JButton deleteContact = new JButton("Delete Contact");
    deleteContact.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    deleteButtonPerformed(evt);
                }
            });
    optionsPanel.setLayout(new GridLayout(3,1));
    optionsPanel.add(addContact);
    optionsPanel.add(editButton);
    optionsPanel.add(deleteContact);
    add(optionsPanel, BorderLayout.EAST);
}
private void addContactButtonPerformed(java.awt.event.ActionEvent evt) {
    ContactUI.this.c_control.getAddContactUIblank();
    System.out.print("work");
}
private void editButtonPerformed(java.awt.event.ActionEvent evt) {
    if(contactTable.getSelectedRow() == -1){
            
           ContactUI.this.c_control.keepContactUI();
           JOptionPane.showMessageDialog(null, "Please select a Contact!");        
        }
        else{
        int selectedTableRow = contactTable.getSelectedRow();
        int selectedModelRow = contactTable.convertRowIndexToModel(selectedTableRow);
        ContactUI.this.c_control.getAddContactUI(selectedModelRow);
        }
}
private void menuButtonPerformed(java.awt.event.ActionEvent evt) {
    this.setVisible(false);
    ContactUI.this.c_control.requestNavigationCntl();
    
}
private void taskButtonPerformed(java.awt.event.ActionEvent evt) {
    this.setVisible(false);
    ContactUI.this.c_control.requestTaskCntl();
}
private void notificationButtonPerformed(java.awt.event.ActionEvent evt) {
    this.setVisible(false);
    ContactUI.this.c_control.requestNotificationCntl();
}
private void calendarButtonPerformed(java.awt.event.ActionEvent evt) {
    this.setVisible(false);
    ContactUI.this.c_control.requestCalendarCntl();
}
private void deleteButtonPerformed(java.awt.event.ActionEvent evt) {
    if(contactTable.getSelectedRow() == -1){
            
           ContactUI.this.c_control.keepContactUI();
           JOptionPane.showMessageDialog(null, "Please select a Contact!");        
        }
        else{
    int selectedTableRow = contactTable.getSelectedRow();
    int selectedModelRow = contactTable.convertRowIndexToModel(selectedTableRow);
    ContactUI.this.c_control.getContactList().getTheContactList().remove(selectedModelRow);
    SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getContactList().getTheContactList().remove(selectedModelRow);
    SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
    this.c_control.getContactTableModel().fireTableDataChanged();
    System.out.print("happened");
    }
}
}
