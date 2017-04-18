/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rober_000
 */
public class NotificationListModel extends AbstractTableModel{
    
    private static String[] columnNames={"Task","Priority","Hour","Minute","AM/PM", "Day", "Month", "Year"};
    private ArrayList<NotificationModel> notificationData;
    
    
    public NotificationListModel(ArrayList<NotificationModel> newNotificationData){
        this.notificationData = newNotificationData;
    }
    
    public int getColumnCount(){
        return columnNames.length;
    }
    
    public int getRowCount(){
        return notificationData.size();
    }
    
    public String getColumnName(int col){
        return columnNames[col];
    }
    
    public Object getValueAt(int row, int col){
        Object objectToReturn = new Object();
        switch(col){
            case 0: objectToReturn = notificationData.get(row).getTask();break;
            case 1: objectToReturn = notificationData.get(row).getPriority();break;
            case 2: objectToReturn = notificationData.get(row).getHour();break;
            case 3: objectToReturn = notificationData.get(row).getMinute();break;
            case 4: objectToReturn = notificationData.get(row).getAm_Pm();break;
            case 5: objectToReturn = notificationData.get(row).getDay();break;
            case 6: objectToReturn = notificationData.get(row).getMonth();break;
            case 7: objectToReturn = notificationData.get(row).getYear();break;
        }
        return objectToReturn;
    }
    
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    
}
