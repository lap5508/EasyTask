/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.WindowConstants;
/**
 *
 * @author Luke
 */
public class AddTaskUI extends JFrame{
    private JLabel titleLabel;
    private JLabel dateLabel;
    private JLabel timeLabel;
    private JLabel locationLabel;
    private JLabel descriptionLabel;
    private JLabel headerLabel;
    private JButton saveButton;
    private JButton backButton;
    private JTextField titleField;
    private JTextField dateField;
    private JTextField timeField;
    private JTextField locationField;
    private JTextField descriptionField;
    private JPanel buttonPanel;
    private JPanel infoPanel;
    private JPanel[] cellNumbers;
    private int index = -1;
    private TaskCntl theTaskCntl = null;
    
    public AddTaskUI(TaskCntl newTaskCntl){
        theTaskCntl = newTaskCntl;
        this.setVisible(true);
        initCustomComponents(false, 0);
    }
    
    public AddTaskUI(TaskCntl newTaskCntl, int taskRow){
        theTaskCntl = newTaskCntl;
        index = taskRow;
        initCustomComponents(true, taskRow);
        System.out.println("MADE IT YEA");
        this.setVisible(true);
    }
    
    public void initCustomComponents(boolean hasInfo, int songRow){
        this.setSize(700, 300);
        this.setTitle("Task Info");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        saveButton = new JButton("SAVE");
            saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        
            backButton = new JButton("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        
        buttonPanel = new JPanel();
            buttonPanel.add(backButton);
            buttonPanel.add(saveButton);

        infoPanel = new JPanel();
            infoPanel.setLayout(new GridLayout(3,2,0,0));
        
        cellNumbers = new JPanel[10];
            for (int i = 0; i < 10; i++) {
                JPanel nextPanel = new JPanel();
                cellNumbers[i] = nextPanel;
                infoPanel.add(nextPanel);
            }
            
        titleLabel = new JLabel("Title: ");
        dateLabel = new JLabel("Date: ");
        timeLabel = new JLabel("Time: ");
        locationLabel = new JLabel("Location: ");
        descriptionLabel = new JLabel("Description: ");
        
        titleField = new JTextField(12);
            titleField.setEditable(true);
        dateField = new JTextField(12);
            dateField.setEditable(true);
        timeField = new JTextField(12);
            timeField.setEditable(true);
        locationField = new JTextField(12);
            locationField.setEditable(true);
        descriptionField = new JTextField(12);
            descriptionField.setEditable(true);
        
        if(hasInfo){
            String titleInfo;
                titleInfo = theTaskCntl.getTaskList().getListOfTasks().get(index).getTitle();
            String dateInfo;
                dateInfo = theTaskCntl.getTaskList().getListOfTasks().get(index).getDate();
            String timeInfo;
                timeInfo = theTaskCntl.getTaskList().getListOfTasks().get(index).getTime();
            String locationInfo;
                locationInfo = theTaskCntl.getTaskList().getListOfTasks().get(index).getLocation();
            String descriptionInfo;
                descriptionInfo = theTaskCntl.getTaskList().getListOfTasks().get(index).getDescription();
            titleField.setText(titleInfo);
            dateField.setText(dateInfo);
            timeField.setText(timeInfo);
            locationField.setText(locationInfo);
            descriptionField.setText(descriptionInfo);         
        }
        
        cellNumbers[0].add(titleLabel);
        cellNumbers[1].add(titleField);
        cellNumbers[2].add(dateLabel);
        cellNumbers[3].add(dateField);
        cellNumbers[4].add(timeLabel);
        cellNumbers[5].add(timeField);
        cellNumbers[6].add(locationLabel);
        cellNumbers[7].add(locationField);
        cellNumbers[8].add(descriptionLabel);
        cellNumbers[9].add(descriptionField);
        
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(infoPanel, BorderLayout.CENTER);
    }
    
    private void saveButtonActionPerformed(ActionEvent evt){
        if(index == -1){
            
            AddTaskUI.this.theTaskCntl.addNewTask(titleField.getText(),dateField.getText(),timeField.getText(),locationField.getText(),descriptionField.getText());
            //SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
            AddTaskUI.this.theTaskCntl.getTaskTableModel().fireTableDataChanged();
        }
        else{
            AddTaskUI.this.theTaskCntl.editTaskInfo(index, titleField.getText(),dateField.getText(),timeField.getText(),locationField.getText(),descriptionField.getText());
            //SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
            AddTaskUI.this.theTaskCntl.getTaskTableModel().fireTableDataChanged();

        }
        AddTaskUI.this.theTaskCntl.returnTaskUI();
        this.setVisible(false);
    }
    
    private void backButtonActionPerformed(ActionEvent evt){
        AddTaskUI.this.theTaskCntl.returnTaskUI();
        this.setVisible(false);
    }
}
