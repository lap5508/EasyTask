/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author Luke
 */
public class TaskUIv2 extends javax.swing.JFrame{
    
    private TaskCntl parentTaskCntl = null;
    private JButton BackGround;
    private JLabel Logo;
    private JLabel TaskLogo;
    private ButtonGroup buttonGroup1;
    private JRadioButton familyButton;
    private JButton editTaskButton;
    private JButton deleteTaskButton;
    private JButton mainMenuButton;
    private JButton addTaskButton;
    private JButton backGroundButton;
    private JComboBox<String> jComboBox1;
    private JLabel notificationLabel;
    private JLabel priorityLabel;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea1;
    private JTextPane jTextPane1;
    private JToggleButton notificationToggle;
    private JRadioButton otherButton;
    private JRadioButton recreationButton;
    private JRadioButton schoolButton;
    private JRadioButton workButton;
    private String tasksList;
    private String previousTasks;
    
    public TaskUIv2(TaskCntl newParentTaskCntl) {
        parentTaskCntl = newParentTaskCntl;
        initCustomComponents();
    }
  

    
    private void initCustomComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BackGround = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TaskLogo = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        
        recreationButton = new javax.swing.JRadioButton();
        workButton = new javax.swing.JRadioButton();
        schoolButton = new javax.swing.JRadioButton();
        otherButton = new javax.swing.JRadioButton();
        familyButton = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        editTaskButton = new javax.swing.JButton();
        deleteTaskButton = new javax.swing.JButton();
        mainMenuButton = new JButton();
        addTaskButton = new JButton();
        notificationLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        notificationToggle = new javax.swing.JToggleButton();
        priorityLabel = new javax.swing.JLabel();
        backGroundButton = new javax.swing.JButton();

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Easy Task BG.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        TaskLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tasks_.png"))); // NOI18N
        jPanel1.add(TaskLogo);
        TaskLogo.setBounds(80, 400, 210, 65);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Easy Task Bigger (2).png"))); // NOI18N
        jPanel1.add(Logo);
        Logo.setBounds(190, 40, 790, 230);

        buttonGroup1.add(recreationButton);
        recreationButton.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        recreationButton.setText("Recreation");
        jPanel1.add(recreationButton);
        recreationButton.setBounds(930, 450, 110, 25);

        buttonGroup1.add(workButton);
        workButton.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        workButton.setText("Work");
        jPanel1.add(workButton);
        workButton.setBounds(930, 370, 110, 25);

        buttonGroup1.add(schoolButton);
        schoolButton.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        schoolButton.setText("School");
        jPanel1.add(schoolButton);
        schoolButton.setBounds(930, 490, 110, 25);

        buttonGroup1.add(otherButton);
        otherButton.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        otherButton.setText("Other");
        jPanel1.add(otherButton);
        otherButton.setBounds(930, 530, 110, 25);

        buttonGroup1.add(familyButton);
        familyButton.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        familyButton.setText("Family");
        jPanel1.add(familyButton);
        familyButton.setBounds(930, 410, 110, 25);

        jComboBox1.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jComboBox1.setMaximumRowCount(20);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Task 1", "Task 2", "Task 3", "Task 4" }));
        jComboBox1.setAutoscrolls(true);
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(310, 430, 490, 30);

        jTextArea1.setColumns(20);
            jTextArea1.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
            jTextArea1.setRows(8);
            //jTextArea1.setText("This is where task information will go.");
            previousTasks = TaskUIv2.this.parentTaskCntl.returnListOfTitles();
            TaskUIv2.this.jTextArea1.setText(previousTasks);
            //tasksList = this.parentTaskCntl.computeListOfTasks();
            //jTextArea1.setText(tasksList);
        
        
        /*
  commentListPanel = new JPanel();
            previousCommentsLabel = new JLabel("Previous Comments:");
            selectedComment = new JLabel();
            previousComments = RatingUI2.this.parentMediaCntl.returnListOfComments();
            RatingUI2.this.selectedComment.setText(previousComments);
            commentListPanel.add(previousCommentsLabel);
            commentListPanel.add(selectedComment);  
*/
        /*userRatingsPanel = new JPanel();
            allRatings = new JLabel("      Previous Ratings:");
            avgRatingField = new JLabel();
                ratingsList = this.parentMediaCntl.computeListOfRatings();
                avgRatingField.setText(ratingsList);
            userRatingsPanel.add(allRatings);
            userRatingsPanel.add(avgRatingField);*/
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 540, 640, 180);

        editTaskButton.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        editTaskButton.setText("Edit Task");
        jPanel1.add(editTaskButton);
        editTaskButton.setBounds(10, 620, 110, 25);

        deleteTaskButton.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        deleteTaskButton.setText("Delete Task");
        jPanel1.add(deleteTaskButton);
        deleteTaskButton.setBounds(10, 660, 110, 25);

        mainMenuButton.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        mainMenuButton.setText("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(mainMenuButton);
        mainMenuButton.setBounds(10, 540, 110, 25);

        addTaskButton.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        addTaskButton.setText("Add Task");

        addTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskButtonActionPerformed(evt);
            }
        });
        
        
        
        jPanel1.add(addTaskButton);
        addTaskButton.setBounds(10, 580, 110, 25);

        notificationLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        notificationLabel.setForeground(new java.awt.Color(255, 255, 255));
        notificationLabel.setText("Notifications:");
        jPanel1.add(notificationLabel);
        notificationLabel.setBounds(880, 690, 220, 30);

        jTextPane1.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jTextPane1.setText("High");
        jScrollPane2.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(880, 640, 180, 30);

        notificationToggle.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        notificationToggle.setText("On");
        jPanel1.add(notificationToggle);
        notificationToggle.setBounds(930, 740, 67, 50);

        priorityLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        priorityLabel.setForeground(new java.awt.Color(255, 255, 255));
        priorityLabel.setText("Priority Level:");
        jPanel1.add(priorityLabel);
        priorityLabel.setBounds(880, 590, 220, 30);

        backGroundButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Easy Task BG.jpg"))); // NOI18N
        backGroundButton.setBorderPainted(false);
        backGroundButton.setContentAreaFilled(false);
        backGroundButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backGroundButton.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Easy Task BG.jpg"))); // NOI18N
        backGroundButton.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Easy Task BG.jpg"))); // NOI18N
        backGroundButton.setEnabled(false);
        backGroundButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Easy Task BG.jpg"))); // NOI18N
        backGroundButton.setRolloverEnabled(false);
        jPanel1.add(backGroundButton);
        backGroundButton.setBounds(0, 0, 1140, 900);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1160, 960);
        jPanel1.getAccessibleContext().setAccessibleName("");

        setBounds(0, 0, 1151, 941);
    }// </editor-fold>                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        TaskUIv2.this.parentTaskCntl.requestNavigationCntl();
    }      
    
    private void addTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //MediaListUI.this.theMediaCntl.getMediaUI(selectedModelRow);
        System.out.println("In Event Handler");
        TaskUIv2.this.parentTaskCntl.requestAddTaskUI();
    }  

//MainMenuUIv2.this.parentNavCntl.requestTaskCntl();  AddTaskButtonActionPerformed
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    
    // End of variables declaration                   
}
