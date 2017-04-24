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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.ScrollPaneConstants;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rober_000
 */
public class NotificationUI extends JFrame{
    
    private JPanel titlePanel;
    private JLabel title;
    private JPanel scrollPanel;
    private JScrollPane notifications;
    private JList panelList;
    private JPanel buttonsPanel;
    private JButton mainMenuButton;
    private JButton addNotificationButton;
    private JButton editNotificationButton;
    private JButton deleteNotificationButton;
    private NotificationController n_control = null;
    private NotificationList list;
    private JTable table;
    
    
    public NotificationUI(NotificationController newn_control)
    {
        n_control = newn_control;
        createUI();
        setBounds(0, 0, 650, 600);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    public void createDateTime(){
        int day;
        
    }
    
    public void createUI()
    {
        
        JPanel titlePanel = new JPanel();
        JLabel title = new JLabel("Notification Menu");
        title.setFont(new Font("Arial", Font.PLAIN,60));
        
        titlePanel.add(title);
        
        
        JPanel scrollPanel = new JPanel();
        
        table = new JTable(this.n_control.getNotificationListModel());
            table.getColumnModel().getColumn(0).setPreferredWidth(20);
            table.getColumnModel().getColumn(1).setPreferredWidth(20);
            table.getColumnModel().getColumn(2).setPreferredWidth(20);
            table.getColumnModel().getColumn(3).setPreferredWidth(20); 
            table.getColumnModel().getColumn(4).setPreferredWidth(20); 
            table.getColumnModel().getColumn(5).setPreferredWidth(20);
            table.getColumnModel().getColumn(6).setPreferredWidth(20);
            table.getColumnModel().getColumn(7).setPreferredWidth(20);
            
    TableRowSorter<TableModel> sorter = new TableRowSorter<>(this.n_control.getNotificationListModel());
    table.setRowSorter(sorter);
    ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
    int columnIndexForDate = 1;
    sortKeys.add(new RowSorter.SortKey(columnIndexForDate, SortOrder.ASCENDING));
    int columnIndexForTime = 2;
    sortKeys.add(new RowSorter.SortKey(columnIndexForTime, SortOrder.ASCENDING));
    sorter.setSortKeys(sortKeys);
    sorter.sort();
    final JTextField filterText = new JTextField("Search Contacts");
    scrollPanel.add(filterText, BorderLayout.SOUTH);
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
    scrollPanel.add(filterButton, BorderLayout.SOUTH);
            
            
        JScrollPane notifications = new JScrollPane(table);
        notifications.setPreferredSize(new Dimension(500, 400));
        notifications.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        table.setFillsViewportHeight(true);
        
        JPanel buttonsPanel = new JPanel();
        JPanel navPanel = new JPanel();
        
        JButton mainMenuButton = new JButton("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    mainMenuButtonActionPerformed(evt);
                }
            });
        
        JButton addNotificationButton = new JButton("Add Notifiaction");
        addNotificationButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    addNotificationButtonActionPerformed(evt);
                }
            });
        
        
        JButton editNotificationButton = new JButton("Edit Notifiaction");
        editNotificationButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    editNotificationButtonActionPerformed(evt);
                }
            });
        
        JButton deleteNotificationButton = new JButton("Delete Notification");
        deleteNotificationButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    deleteNotificationButtonActionPerformed(evt);
                }
            });
        JButton taskButton = new JButton("Task");
        taskButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    taskButtonActionPerformed(evt);
                }
            });
        JButton contactButton = new JButton("Contact");
        contactButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    contactButtonActionPerformed(evt);
                }
            });
        
        scrollPanel.add(notifications);
        
        buttonsPanel.setLayout(new GridLayout(3,1));
        navPanel.setLayout(new GridLayout(1,3));
        navPanel.add(mainMenuButton);
        navPanel.add(contactButton);
        navPanel.add(taskButton);
        buttonsPanel.add(addNotificationButton);
        buttonsPanel.add(editNotificationButton);
        buttonsPanel.add(deleteNotificationButton);
        
        add(titlePanel, BorderLayout.NORTH);
        add(scrollPanel, BorderLayout.CENTER);
        add(navPanel, BorderLayout.SOUTH);
        add(buttonsPanel, BorderLayout.EAST);
        
    }
    
    
    private void addNotificationButtonActionPerformed(java.awt.event.ActionEvent evt){
        NotificationUI.this.n_control.getBlankAddNotificationUI();
        System.out.println("worked");
    }
    
    private void editNotificationButtonActionPerformed(java.awt.event.ActionEvent evt){
        if(table.getSelectedRow() == -1){
        NotificationUI.this.n_control.keepNotificationUI();
        JOptionPane.showMessageDialog(null, "Please select a Notification!");
        }
        else{
        int selectedTableRow = table.getSelectedRow();
        int selectedModelRow = table.convertRowIndexToModel(selectedTableRow);
        NotificationUI.this.n_control.getAddNotificationUI(selectedModelRow);
        }
    }
    
    private void deleteNotificationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(table.getSelectedRow() == -1){
            
           NotificationUI.this.n_control.keepNotificationUI();
           JOptionPane.showMessageDialog(null, "Please select a Notification!");        
        }
        else{
    int selectedTableRow = table.getSelectedRow();
    int selectedModelRow = table.convertRowIndexToModel(selectedTableRow);
    NotificationUI.this.n_control.getNotificationList().getTheNotificationList().remove(selectedModelRow);
    this.n_control.getNotificationListModel().fireTableDataChanged();
    System.out.print("deleted");
        }
}
    
    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt){
        n_control.requestNavigationCntl();
    }
    private void contactButtonActionPerformed(java.awt.event.ActionEvent evt){
        this.setVisible(false);
        NotificationUI.this.n_control.requestContactCntl();
    }
    private void taskButtonActionPerformed(java.awt.event.ActionEvent evt){
        this.setVisible(false);
        NotificationUI.this.n_control.requestTaskCntl();
        System.out.println("worked");
    }
    
}
