/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.util.ArrayList;
import javax.swing.table.*;
/**
 *
 * @author Luke
 */
public class TaskTableModel extends AbstractTableModel{
    private static String[] columnNames={"Task","Date","Time","Location","Description"};
    private ArrayList<Task> taskTableData;
    
    public TaskTableModel(ArrayList<Task> theTaskTableData){
        this.taskTableData = theTaskTableData;
    }
    
    public int getColumnCount(){
        return columnNames.length;
    }
    
    public int getRowCount(){
        return taskTableData.size();
    }
    
    public String getColumnName(int col){
        return columnNames[col];
    }
    
    public Object getValueAt(int row, int col){
        Object objectToReturn = new Object();
        switch(col){
            case 0: objectToReturn = taskTableData.get(row).getTitle();break;
            case 1: objectToReturn = taskTableData.get(row).getDate();break;
            case 2: objectToReturn = taskTableData.get(row).getTime();break;
            case 3: objectToReturn = taskTableData.get(row).getLocation();break;
            case 4: objectToReturn = taskTableData.get(row).getDescription();break;
        }
        return objectToReturn;
    }
    
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}
