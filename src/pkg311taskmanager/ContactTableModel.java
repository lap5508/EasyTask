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
 * @author kkc5141
 */
public class ContactTableModel extends AbstractTableModel {
    private static String[] columnNames = {"First Name","Middle Name","Last Name","Group"};
    private ArrayList<ContactModel> contactTableData;
    
    public ContactTableModel(ArrayList<ContactModel> theContactTableData){
        this.contactTableData = theContactTableData;
    }
    
    public int getColumnCount(){
        return columnNames.length;
    }
    
    public int getRowCount(){
        return contactTableData.size();
    }
    public String getColumnName(int col){
        return columnNames[col];
    }
    
    public Object getValueAt(int row, int col){
        Object objectToReturn = new Object();
        switch(col){
            case 0: objectToReturn = contactTableData.get(row).getfName();break;
            case 1: objectToReturn = contactTableData.get(row).getmName();break;
            case 2: objectToReturn = contactTableData.get(row).getCellNum();break;
            case 3: objectToReturn = contactTableData.get(row).getGroup();break;
        }
        return objectToReturn;
    }
    
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}
