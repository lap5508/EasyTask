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
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
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
    private JComboBox tasks;
    private JComboBox priority;
    private JButton backButton;
    private JButton addNotificationButton;
    private JLabel time;
    private JComboBox hour;
    private JComboBox minute;
    private JComboBox am_pm;
    private JComboBox year;
    private JLabel date;
    private JComboBox month;
    private JComboBox day;
    private JPanel[] cellNumbers;
    private int index = -1;
    private NotificationController n_control = null;
    private TaskCntl t_control = null;
    
    public AddNotificationUI(NotificationController newn_control){
        n_control = newn_control;
        this.t_control = t_control;
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
    
    private void createUI(boolean hasInfo, int row)
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
        
        
        tasks = new JComboBox();
        for(int i = 0; i < AddNotificationUI.this.n_control.getTaskList().size(); i++){
        tasks.addItem(AddNotificationUI.this.n_control.getTaskList().get(i).getTitle());
        System.out.println("worked");
        }
        
        tasks.setFont(new Font("Arial", Font.PLAIN, 20));
        priority = new JComboBox();
        priority.setFont(new Font("Arial", Font.PLAIN, 16));
        priority.addItem("Low");
        priority.addItem("Medium");
        priority.addItem("High");
        comboBoxPanel.setLayout(new GridLayout(6,2));
        
        time = new JLabel("Time of reminder:");
        time.setFont(new Font("Arial", Font.PLAIN, 25));
        
        hour = new JComboBox();
        hour.setFont(new Font("Arial", Font.PLAIN,16));
        hour.addItem("1");
        hour.addItem("2");
        hour.addItem("3");
        hour.addItem("4");
        hour.addItem("5");
        hour.addItem("6");
        hour.addItem("7");
        hour.addItem("8");
        hour.addItem("9");
        hour.addItem("10");
        hour.addItem("11");
        hour.addItem("12");
        minute = new JComboBox();
        minute.setFont(new Font("Arial", Font.PLAIN,16));
        minute.addItem("1");
        minute.addItem("2");
        minute.addItem("3");
        minute.addItem("4");
        minute.addItem("5");
        minute.addItem("6");
        minute.addItem("7");
        minute.addItem("8");
        minute.addItem("9");
        minute.addItem("10");
        minute.addItem("11");
        minute.addItem("12");
        minute.addItem("13");
        minute.addItem("14");
        minute.addItem("15");
        minute.addItem("16");
        minute.addItem("17");
        minute.addItem("18");
        minute.addItem("19");
        minute.addItem("20");
        minute.addItem("21");
        minute.addItem("22");
        minute.addItem("23");
        minute.addItem("24");
        minute.addItem("25");
        minute.addItem("26");
        minute.addItem("27");
        minute.addItem("28");
        minute.addItem("29");
        minute.addItem("30");
        minute.addItem("40");
        minute.addItem("41");
        minute.addItem("42");
        minute.addItem("43");
        minute.addItem("44");
        minute.addItem("45");
        minute.addItem("46");
        minute.addItem("47");
        minute.addItem("48");
        minute.addItem("49");
        minute.addItem("50");
        minute.addItem("51");
        minute.addItem("52");
        minute.addItem("53");
        minute.addItem("54");
        minute.addItem("55");
        minute.addItem("56");
        minute.addItem("57");
        minute.addItem("58");
        minute.addItem("59");
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
        day = new JComboBox();
        day.setFont(new Font("Arial", Font.PLAIN,16));
        day.addItem("Sunday");
        day.addItem("Monday");
        day.addItem("Tuesday");
        day.addItem("Wednesday");
        day.addItem("Thursday");
        day.addItem("Friday");
        day.addItem("Saturday");
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
        year = new JComboBox();
        year.setFont(new Font("Arial", Font.PLAIN,16));
        year.addItem("2017");
        year.addItem("2018");
        year.addItem("2019");
        year.addItem("2020");
        year.addItem("2021");
        year.addItem("2023");
        year.addItem("2024");
        year.addItem("2025");
        year.addItem("2026");
        year.addItem("2027");
        year.addItem("2028");
        year.addItem("2029");
        year.addItem("2030");
               
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
                taskInfo = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getNotificationList().getTheNotificationList().get(row).getTask();
            String priorityInfo;
                priorityInfo = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getNotificationList().getTheNotificationList().get(row).getPriority();
            String hourInfo;
                hourInfo = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getNotificationList().getTheNotificationList().get(row).getHour();
            String minuteInfo;
                minuteInfo = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getNotificationList().getTheNotificationList().get(row).getMinute();
            String am_pmInfo;
                am_pmInfo = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getNotificationList().getTheNotificationList().get(row).getAm_Pm();
            String dayInfo;
                dayInfo = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getNotificationList().getTheNotificationList().get(row).getDay();
            String monthInfo;
                monthInfo = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getNotificationList().getTheNotificationList().get(row).getMonth();
            String yearInfo;
                yearInfo = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getNotificationList().getTheNotificationList().get(row).getYear();
            tasks.setSelectedItem(taskInfo);
            priority.setSelectedItem(priorityInfo);
            hour.setSelectedItem(hourInfo);
            minute.setSelectedItem(minuteInfo);
            am_pm.setSelectedItem(am_pmInfo);  
            day.setSelectedItem(dayInfo);  
            month.setSelectedItem(monthInfo);  
            year.setSelectedItem(yearInfo);  
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
            AddNotificationUI.this.n_control.addNotification(tasks.getSelectedItem().toString(), priority.getSelectedItem().toString(), hour.getSelectedItem().toString(),minute.getSelectedItem().toString(),am_pm.getSelectedItem().toString(),day.getSelectedItem().toString(), month.getSelectedItem().toString(), year.getSelectedItem().toString());
            SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
            AddNotificationUI.this.n_control.getNotificationListModel().fireTableDataChanged();
        } 
        else{
            AddNotificationUI.this.n_control.editNotificationInfo(index, tasks.getSelectedItem().toString(), priority.getSelectedItem().toString(), hour.getSelectedItem().toString(),minute.getSelectedItem().toString(),am_pm.getSelectedItem().toString(),day.getSelectedItem().toString(), month.getSelectedItem().toString(), year.getSelectedItem().toString());
            SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
            AddNotificationUI.this.n_control.getNotificationListModel().fireTableDataChanged();
        }
    AddNotificationUI.this.n_control.returnNotificationUI();
    this.setVisible(false);
}
} 
