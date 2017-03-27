/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author lap5508
 */
public class AddTaskUI extends javax.swing.JFrame{
    
    //private TaskList theTaskList = null;
    private ArrayList<Task> newTaskList = null;
    private TaskCntl parentTaskCntl = null;
    private JButton backgroundButton;
    private JButton cancelButton;
    private JTextField dateField;
    private JLabel dateLabel;
    private JTextArea descriptionField;
    private JLabel descriptionLabel;
    private JComboBox groupComboBox;
    private JLabel groupLabel;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextField locationField;
    private JLabel locationLabel;
    private JLabel logoLabel;
    private JComboBox priorityComboBox;
    private JLabel priorityLabel;
    private JButton submitButton;
    private JTextField timeField;
    private JLabel timeLabel;
    private JTextField titleField;
    private JLabel titleLabel;
    TaskList tasklist;
    
    public AddTaskUI(TaskCntl newParentTaskCntl) {
        parentTaskCntl = newParentTaskCntl;
        initComponents();
    }
    /*
    public AddTaskUI() {
        initCustomComponents();
    }*/

                      
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        groupLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        groupComboBox = new javax.swing.JComboBox();
        locationField = new javax.swing.JTextField();
        titleField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        timeField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionField = new javax.swing.JTextArea();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        priorityLabel = new javax.swing.JLabel();
        priorityComboBox = new javax.swing.JComboBox();
        //backgroundButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        //logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Easy Task Logo.png"))); // NOI18N
        jPanel1.add(logoLabel);
        logoLabel.setBounds(130, 20, 690, 160);

        groupLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        groupLabel.setForeground(new java.awt.Color(255, 255, 255));
        groupLabel.setText("Group:");
        jPanel1.add(groupLabel);
        groupLabel.setBounds(690, 350, 130, 40);

        titleLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleLabel.setText("Title:");
        jPanel1.add(titleLabel);
        titleLabel.setBounds(70, 200, 100, 40);

        dateLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dateLabel.setText("Date:");
        jPanel1.add(dateLabel);
        dateLabel.setBounds(70, 240, 100, 40);

        timeLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        timeLabel.setText("Time:");
        jPanel1.add(timeLabel);
        timeLabel.setBounds(70, 280, 100, 40);

        locationLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        locationLabel.setForeground(new java.awt.Color(255, 255, 255));
        locationLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        locationLabel.setText("Location:");
        jPanel1.add(locationLabel);
        locationLabel.setBounds(70, 320, 100, 40);

        descriptionLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        descriptionLabel.setText("Description:");
        jPanel1.add(descriptionLabel);
        descriptionLabel.setBounds(50, 360, 120, 40);

        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Work", "Family", "Recreation", "School", "Other" }));
        groupComboBox.setSelectedIndex(1);
        groupComboBox.setToolTipText("");
        jPanel1.add(groupComboBox);
        groupComboBox.setBounds(690, 400, 150, 20);

        locationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationFieldActionPerformed(evt);
            }
        });
        jPanel1.add(locationField);
        locationField.setBounds(190, 330, 450, 20);

        titleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFieldActionPerformed(evt);
            }
        });
        jPanel1.add(titleField);
        titleField.setBounds(190, 210, 450, 20);

        dateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFieldActionPerformed(evt);
            }
        });
        jPanel1.add(dateField);
        dateField.setBounds(190, 250, 450, 20);

        timeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeFieldActionPerformed(evt);
            }
        });
        jPanel1.add(timeField);
        timeField.setBounds(190, 290, 450, 20);

        descriptionField.setColumns(20);
        descriptionField.setRows(5);
        jScrollPane1.setViewportView(descriptionField);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(190, 370, 450, 150);

        submitButton.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        submitButton.setText("Submit");
        jPanel1.add(submitButton);
        submitButton.setBounds(430, 560, 210, 25);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        
        cancelButton.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");
        jPanel1.add(cancelButton);
        cancelButton.setBounds(190, 560, 210, 25);

        priorityLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        priorityLabel.setForeground(new java.awt.Color(255, 255, 255));
        priorityLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        priorityLabel.setText("Priority Level:");
        jPanel1.add(priorityLabel);
        priorityLabel.setBounds(680, 250, 130, 40);

        priorityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Low", "Medium", "High" }));
        priorityComboBox.setSelectedIndex(1);
        jPanel1.add(priorityComboBox);
        priorityComboBox.setBounds(690, 300, 150, 20);

        //backgroundButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Easy Task BG.jpg"))); // NOI18N
        //jPanel1.add(backgroundButton);
        //backgroundButton.setBounds(-20, 0, 960, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void locationFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void titleFieldActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void dateFieldActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void timeFieldActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.out.println("In Event Handler");
        ArrayList<Task> tempList = new ArrayList();
        long startTime = 0;
        long endTime = 0;
        Task newTask = new Task(titleField.getText(), descriptionField.getText(), "", startTime, endTime, true);
        tempList.add(newTask);
        
    }

    /**
     * @param args the command line arguments
     */
    


    // Variables declaration - do not modify                     
    
    // End of variables declaration    
}
