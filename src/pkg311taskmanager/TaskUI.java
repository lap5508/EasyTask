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
    private JButton addButton;
    private JButton deleteButton;
    private JButton editButton;
    private JButton menuButton;
    private JPanel[] cellNumbers;
    private JPanel buttonPanel;
    private JPanel tablePanel;
    private JLabel headerLabel;
    private JLabel taskLabel;
    private JLabel priorityLabel;
    private JLabel notificationLabel;
    private JTable taskTable;
    private JScrollPane theScrollPane;
    
    
    public TaskUI(TaskCntl newParentTaskCntl) {
        theTaskCntl = newParentTaskCntl;
        initCustomComponents();
    }
    
    public void initCustomComponents(){
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //BUTTONS
        menuButton = new JButton("MENU");
            menuButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    menuButtonActionPerformed(evt);
                }
            });
        
        addButton = new JButton("ADD");
            addButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    addButtonActionPerformed(evt);
                }
            });
        
        editButton = new JButton("EDIT");
            editButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    editButtonActionPerformed(evt);
                }
            });
        
        deleteButton = new JButton("DELETE");
            deleteButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    deleteButtonActionPerformed(evt);
                }
            });
        
        //Button Panel
        buttonPanel = new JPanel();
            buttonPanel.add(menuButton);
            buttonPanel.add(addButton);
            buttonPanel.add(deleteButton);
            buttonPanel.add(editButton);
        
        //Task Table
        taskTable = new JTable(this.theTaskCntl.getTaskTableModel());
            taskTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            taskTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            taskTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            taskTable.getColumnModel().getColumn(3).setPreferredWidth(20); 
            taskTable.getColumnModel().getColumn(4).setPreferredWidth(20);
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(this.theTaskCntl.getTaskTableModel());
        taskTable.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
        int columnIndexForDate = 1;
        sortKeys.add(new RowSorter.SortKey(columnIndexForDate, SortOrder.ASCENDING));
        int columnIndexForTime = 2;
        sortKeys.add(new RowSorter.SortKey(columnIndexForTime, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
        sorter.sort();
        
        //ScrollPane
        theScrollPane = new JScrollPane(taskTable);
            theScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            theScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            theScrollPane.setPreferredSize(new Dimension(500, 320));
            taskTable.setFillsViewportHeight(true);
            
        //Table Panel
        tablePanel = new JPanel();
            tablePanel.setLayout(new BorderLayout());
            tablePanel.add(theScrollPane, BorderLayout.CENTER);
            
        //pack it
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(tablePanel, BorderLayout.CENTER);
            
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
    
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt){
        int selectedTableRow = taskTable.getSelectedRow();
        int selectedModelRow = taskTable.convertRowIndexToModel(selectedTableRow);
        TaskUI.this.theTaskCntl.getTaskList().getListOfTasks().remove(selectedModelRow);
        //SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getMediaList().getListOfMedia().remove(selectedModelRow);
        //SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
        this.theTaskCntl.getTaskTableModel().fireTableDataChanged();
    }
    
    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt){
        this.setVisible(false);
        TaskUI.this.theTaskCntl.requestNavigationCntl();
    }
}
