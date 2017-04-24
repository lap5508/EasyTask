/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
import javax.swing.Timer;
import javax.swing.WindowConstants;
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
    private int day;
    private int month;
    private int year;
    private int second;
    private int minute;
    private int hour;
    private JLabel date;
    private JLabel time;
    
    
    public NotificationUI(NotificationController newn_control)
    {
        n_control = newn_control;
        createUI();
        createDateTime();
        setBounds(0, 0, 750, 700);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    public void createDateTime(){
        JPanel dateTime = new JPanel();
        dateTime.setLayout(new GridLayout(3,1));
        GregorianCalendar currDate = new GregorianCalendar();
        day = currDate.get(Calendar.DAY_OF_MONTH);
        month = currDate.get(Calendar.MONTH);
        year = currDate.get(Calendar.YEAR);
        
        date = new JLabel("Current Date: " + (month+1) + "/" + day + "/" + year, JLabel.CENTER);
        time = new JLabel(currentTime(), JLabel.CENTER);
        date.setFont(new Font("Arial", Font.PLAIN,40));
        time.setFont(new Font("Arial", Font.PLAIN,40));
        JLabel title = new JLabel("Notification Menu", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.PLAIN,60));
        dateTime.add(title);
        dateTime.add(date);
        dateTime.add(time);
        add(dateTime, BorderLayout.NORTH);
        ActionListener secondCounter = new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                time.setText(currentTime());
                if(currentTime().equals("5:22:00 PM")){
                    popUp();
                    System.out.println("worked");
                } else {
                }
            }
        };
        Timer sec = new Timer(1000, secondCounter);
        sec.start();
    }
    public String currentTime() {
        Calendar calendar = Calendar.getInstance();
        GregorianCalendar currDate = new GregorianCalendar();
        int hours = currDate.get(Calendar.HOUR);
        int minutes = currDate.get(Calendar.MINUTE);
        int seconds = currDate.get(Calendar.SECOND);
        int TOD = calendar.get(Calendar.AM_PM);
        String currentTime = hours + ":" + checkTime(minutes) + ":"
                + checkTime(seconds) + " " + ampm(TOD);
        return currentTime;
    }

    public String checkTime(int t) {
        String timerSec;
        if (t < 10) {
            timerSec = ("0" + t);
        } else {
            timerSec = ("" + t);
        }
        return timerSec;
    }
    public String ampm(int TOD) {
        String amPm;
        if (TOD == 0)
            amPm = "AM";
        else
            amPm = "PM";
        return amPm;
    }
    public void createUI()
    {     
     
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
    public void popUp(){
    String message = "You got a new notification message. Isn't it awesome to have such a notification message.";
    String header = "This is header of notification message";
    JFrame frame = new JFrame();
    frame.setSize(300,125);
    frame.setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.weightx = 1.0f;
    constraints.weighty = 1.0f;
    constraints.insets = new Insets(5, 5, 5, 5);
    constraints.fill = GridBagConstraints.BOTH;
    JLabel headingLabel = new JLabel(header);
    headingLabel.setOpaque(false);
    frame.add(headingLabel, constraints);
    constraints.gridx++;
    constraints.weightx = 0f;
    constraints.weighty = 0f;
    constraints.fill = GridBagConstraints.NONE;
    constraints.anchor = GridBagConstraints.NORTH;
    constraints.gridx = 0;
    constraints.gridy++;
    constraints.weightx = 1.0f;
    constraints.weighty = 1.0f;
    constraints.insets = new Insets(5, 5, 5, 5);
    constraints.fill = GridBagConstraints.BOTH;
    JLabel messageLabel = new JLabel("<HtMl>"+message);
    frame.add(messageLabel, constraints);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }
}
