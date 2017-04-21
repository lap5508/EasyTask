/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rfd5085
 */
public class AddNotificationUI extends JFrame{

    private JLabel logo;
    private JLabel taskLabel;
    private JLabel priorityLabel;
    private JPanel buttonsPanel;
    private JPanel comboBoxPanel;
    private JTextField tasks;
    private JComboBox priority;
    private JButton backButton;
    private JButton addNotificationButton;
    private JLabel time;
    private JTextField hour;
    private JTextField minute;
    private JComboBox am_pm;
    private JTextField year;
    private JLabel date;
    private JComboBox month;
    private JTextField day;
    private JPanel[] cellNumbers;
    private int index = -1;
    private NotificationController n_control = null;
    
    
    public AddNotificationUI(NotificationController newn_control){
        n_control = newn_control;
        setBounds(0, 0, 600, 500);
        this.setVisible(true);
        createUI(false, 0);
    }
    
    public AddNotificationUI(NotificationController newn_control, int taskRow)
    {
    n_control = newn_control;
    index = taskRow;
    createUI(true, taskRow);
    setBounds(0, 0, 600, 500);
    this.setVisible(true);
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    private void createUI(boolean hasInfo, int songRow)
    {
        JPanel logoPanel = new JPanel();
        logo = new JLabel("Add Notification");
        logo.setFont(new Font("Arial", Font.PLAIN,60));
        
        JPanel buttonsPanel = new JPanel();
        
        backButton = new JButton("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        
        addNotificationButton = new JButton("Save");
        addNotificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNotificationButtonActionPerformed(evt);
            }
        });
        
        buttonsPanel.setLayout(new GridLayout(1,1));
        buttonsPanel.add(backButton);
        buttonsPanel.add(addNotificationButton);
       
        comboBoxPanel = new JPanel();
        taskLabel = new JLabel("Tasks:");
        taskLabel.setFont(new Font("Arial", Font.PLAIN, 25));
        priorityLabel = new JLabel("Priority:");
        priorityLabel.setFont(new Font("Arial", Font.PLAIN, 25));
        
        tasks = new JTextField();
        tasks.setColumns(12);
        tasks.setFont(new Font("Arial", Font.PLAIN, 20));
        priority = new JComboBox();
        priority.setFont(new Font("Arial", Font.PLAIN, 16));
        priority.addItem("Low");
        priority.addItem("Medium");
        priority.addItem("High");
        comboBoxPanel.setLayout(new GridLayout(6,2));
        
        time = new JLabel("Time of reminder:");
        time.setFont(new Font("Arial", Font.PLAIN, 25));
        hour = new JTextField("Hour");
        hour.setFont(new Font("Arial", Font.PLAIN,20));
        hour.setColumns(12);
        minute = new JTextField("Minute");
        minute.setFont(new Font("Arial", Font.PLAIN,20));
        minute.setColumns(12);
        am_pm = new JComboBox();
        am_pm.setFont(new Font("Arial", Font.PLAIN, 16));
        am_pm.addItem("AM");
        am_pm.addItem("PM");
        
        cellNumbers = new JPanel[12];
            for (int i = 0; i < 12; i++) {
                JPanel nextPanel = new JPanel();
                cellNumbers[i] = nextPanel;
                comboBoxPanel.add(nextPanel);
            }
        
        date = new JLabel("Date of Reminder:");
        date.setFont(new Font("Arial", Font.PLAIN, 25));
        day = new JTextField("Day");
        day.setFont(new Font("Arial", Font.PLAIN,20));
        day.setColumns(12);
        month = new JComboBox();
        month.setFont(new Font("Arial", Font.PLAIN, 16));
        month.addItem("January");
        month.addItem("February");
        month.addItem("March");
        month.addItem("April");
        month.addItem("May");
        month.addItem("June");
        month.addItem("July");
        month.addItem("August");
        month.addItem("September");
        month.addItem("October");
        month.addItem("November");
        month.addItem("December");
        year = new JTextField("Year");
        year.setFont(new Font("Arial", Font.PLAIN,20));
        year.setColumns(12);
               
        logoPanel.add(logo);
        
        comboBoxPanel.add(taskLabel);
        comboBoxPanel.add(tasks);
        comboBoxPanel.add(priorityLabel);
        comboBoxPanel.add(priority);
        comboBoxPanel.add(time);
        comboBoxPanel.add(hour);
        comboBoxPanel.add(minute);
        comboBoxPanel.add(am_pm);
        comboBoxPanel.add(date);
        comboBoxPanel.add(day);
        comboBoxPanel.add(month);
        comboBoxPanel.add(year);
        
        add(logoPanel, BorderLayout.NORTH);
        add(comboBoxPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
        
        if(hasInfo){
            String taskInfo;
                taskInfo = n_control.getNotificationList().getTheNotificationList().get(index).getTask();
            String priorityInfo;
                priorityInfo = n_control.getNotificationList().getTheNotificationList().get(index).getPriority();
            String hourInfo;
                hourInfo = n_control.getNotificationList().getTheNotificationList().get(index).getHour();
            String minuteInfo;
                minuteInfo = n_control.getNotificationList().getTheNotificationList().get(index).getMinute();
            String am_pmInfo;
                am_pmInfo = n_control.getNotificationList().getTheNotificationList().get(index).getAm_Pm();
            String dayInfo;
                dayInfo = n_control.getNotificationList().getTheNotificationList().get(index).getDay();
            String monthInfo;
                monthInfo = n_control.getNotificationList().getTheNotificationList().get(index).getMonth();
            String yearInfo;
                yearInfo = n_control.getNotificationList().getTheNotificationList().get(index).getYear();
            tasks.setText(taskInfo);
            priority.setSelectedItem(priorityInfo);
            hour.setText(hourInfo);
            minute.setText(minuteInfo);
            am_pm.setSelectedItem(am_pmInfo);  
            day.setText(dayInfo);  
            month.setSelectedItem(monthInfo);  
            year.setText(yearInfo);  
        }
        cellNumbers[0].add(taskLabel);
        cellNumbers[1].add(tasks);
        cellNumbers[2].add(priorityLabel);
        cellNumbers[3].add(priority);
        cellNumbers[4].add(time);
        cellNumbers[5].add(hour);
        cellNumbers[6].add(minute);
        cellNumbers[7].add(am_pm);
        cellNumbers[8].add(date);
        cellNumbers[9].add(day);
        cellNumbers[10].add(month);
        cellNumbers[11].add(year);
    }
    
     private void backButtonActionPerformed(java.awt.event.ActionEvent evt){
        
        AddNotificationUI.this.n_control.returnNotificationUI();
        this.setVisible(false);
    }
     
     private void addNotificationButtonActionPerformed(java.awt.event.ActionEvent evt){
        if(index == -1){
            AddNotificationUI.this.n_control.addNotification(tasks.getText(), priority.getSelectedItem().toString(), hour.getText(),minute.getText(),am_pm.getSelectedItem().toString(),day.getText(), month.getSelectedItem().toString(), year.getText());
            AddNotificationUI.this.n_control.getNotificationListModel().fireTableDataChanged();
        } 
        else{
            AddNotificationUI.this.n_control.editNotificationInfo(index, tasks.getText(), priority.getSelectedItem().toString(), hour.getText(),minute.getText(),am_pm.getSelectedItem().toString(),day.getText(), month.getSelectedItem().toString(), year.getText());
            AddNotificationUI.this.n_control.getNotificationListModel().fireTableDataChanged();
        }
    AddNotificationUI.this.n_control.returnNotificationUI();
    this.setVisible(false);
}
} 