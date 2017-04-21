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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

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
        setBounds(0, 0, 600, 500);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        JScrollPane notifications = new JScrollPane(table);
        notifications.setPreferredSize(new Dimension(450, 300));
        notifications.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        table.setFillsViewportHeight(true);
        
        JPanel buttonsPanel = new JPanel();
        
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
        
        scrollPanel.add(notifications);
        
        buttonsPanel.setLayout(new GridLayout(1,1));
        buttonsPanel.add(mainMenuButton);
        buttonsPanel.add(addNotificationButton);
        buttonsPanel.add(editNotificationButton);
        buttonsPanel.add(deleteNotificationButton);
        
        add(titlePanel, BorderLayout.NORTH);
        add(scrollPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
        
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
    int selectedTableRow = table.getSelectedRow();
    int selectedModelRow = table.convertRowIndexToModel(selectedTableRow);
    NotificationUI.this.n_control.getNotificationList().getTheNotificationList().remove(selectedModelRow);
    this.n_control.getNotificationListModel().fireTableDataChanged();
    System.out.print("deleted");
}
    
    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt){
        n_control.requestNavigationCntl();
    }
    
    
}
