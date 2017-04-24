/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import javax.swing.WindowConstants;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.util.ArrayList;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Luke
 */
public class TaskUI extends JFrame{
    private TaskCntl theTaskCntl = null;
    private JButton addTask;
    private JButton deleteButton;
    private JButton editTask;
    private JButton menuButton;
    private JButton notificationButton;
    private JButton contactButton;
    private JPanel[] cellNumbers;
    private JPanel optionsPanel;
    private JPanel navigationPanel;
    private JPanel tablePanel;
    private JLabel headerLabel;
    private JLabel taskLabel;
    private JLabel priorityLabel;
    private JLabel notificationLabel;
    private JTable taskTable;
    private JScrollPane theScrollPane;
    
    /*
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
    */
    
    
    public TaskUI(TaskCntl newParentTaskCntl) {
        theTaskCntl = newParentTaskCntl;
        createLabelPanel();
        createListPanel();
        createOptionsPanel();
        createNavigationPanel();
        setBounds(0, 0, 750, 700);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //initCustomComponents();
    }
    
    public void createLabelPanel(){
        taskLabel = new JLabel("Task List", JLabel.CENTER);
        taskLabel.setFont(new Font("Serif", Font.PLAIN, 48));
        add(taskLabel, BorderLayout.NORTH);
    }
    
    public void createListPanel(){
        JPanel tablePanel = new JPanel();
        
        taskTable = new JTable(this.theTaskCntl.getTaskTableModel());
            taskTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            taskTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            taskTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            taskTable.getColumnModel().getColumn(3).setPreferredWidth(20); 
            taskTable.getColumnModel().getColumn(4).setPreferredWidth(20);
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(this.theTaskCntl.getTaskTableModel());
        taskTable.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();

        int columnIndexToSort = 0;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
        final JTextField filterText = new JTextField("Search Task List");
        tablePanel.add(filterText, BorderLayout.NORTH);
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
        tablePanel.add(filterButton, BorderLayout.NORTH);    
            
        theScrollPane = new JScrollPane(taskTable);
            theScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            theScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            theScrollPane.setPreferredSize(new Dimension(500, 400));
            taskTable.setFillsViewportHeight(true);
            
        tablePanel.add(theScrollPane);
        add(tablePanel, BorderLayout.CENTER);
    }
    
    public void createOptionsPanel(){
        JPanel optionsPanel = new JPanel();
        JButton addTask = new JButton("Add Task");
        addTask.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(java.awt.event.ActionEvent evt){
                        addButtonActionPerformed(evt);
                    }
                });
        JButton editButton = new JButton("Edit Task");
        editButton.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(java.awt.event.ActionEvent evt){
                        editButtonActionPerformed(evt);
                    }
                });
        JButton deleteTask = new JButton("Delete Task");
        deleteTask.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(java.awt.event.ActionEvent evt){
                        deleteButtonActionPerformed(evt);
                    }
                });
        optionsPanel.setLayout(new GridLayout(3,1));
        optionsPanel.add(addTask);
        optionsPanel.add(editButton);
        optionsPanel.add(deleteTask);
        add(optionsPanel, BorderLayout.EAST);
    }
    
    public void createNavigationPanel(){
        JPanel navigationPanel = new JPanel();
        JButton menuButton = new JButton("Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(java.awt.event.ActionEvent evt){
                        menuButtonActionPerformed(evt);
                    }
                });

        JButton contactButton = new JButton("Contact");
        contactButton.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(java.awt.event.ActionEvent evt){
                        contactButtonActionPerformed(evt);
                    }
                });
        JButton notificationButton = new JButton("Notification");
        notificationButton.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(java.awt.event.ActionEvent evt){
                        notificationButtonPerformed(evt);
                    }
                });
        navigationPanel.setLayout(new GridLayout(1, 3));
        navigationPanel.add(menuButton);
        //navigationPanel.add(calendarButton);
        navigationPanel.add(contactButton);
        navigationPanel.add(notificationButton);
        add(navigationPanel, BorderLayout.SOUTH);
    }
    
    
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt){
        if(taskTable.getSelectedRow() == -1){
            
           TaskUI.this.theTaskCntl.keepTaskUI();
           JOptionPane.showMessageDialog(null, "Please select a Task!");        
        }
        else{
        int selectedTableRow = taskTable.getSelectedRow();
        int selectedModelRow = taskTable.convertRowIndexToModel(selectedTableRow);
        TaskUI.this.theTaskCntl.getAddTaskUI(selectedModelRow);
        }
    }
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt){
        TaskUI.this.theTaskCntl.getAddTaskUINoInfo();
    }
    
    private void contactButtonActionPerformed(java.awt.event.ActionEvent evt){
        this.setVisible(false);
        TaskUI.this.theTaskCntl.requestContactCntl();
    }
    
    private void notificationButtonPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        TaskUI.this.theTaskCntl.requestNotificationCntl();
    }
    
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt){
        if(taskTable.getSelectedRow() == -1){
            
           TaskUI.this.theTaskCntl.keepTaskUI();
           JOptionPane.showMessageDialog(null, "Please select a Task!");        
        }
        else{
        int selectedTableRow = taskTable.getSelectedRow();
        int selectedModelRow = taskTable.convertRowIndexToModel(selectedTableRow);
        TaskUI.this.theTaskCntl.getTaskList().getListOfTasks().remove(selectedModelRow);
        //SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getMediaList().getListOfMedia().remove(selectedModelRow);
        //SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
        this.theTaskCntl.getTaskTableModel().fireTableDataChanged();
        }
    }
    
    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt){
        this.setVisible(false);
        TaskUI.this.theTaskCntl.requestNavigationCntl();
    }
}
