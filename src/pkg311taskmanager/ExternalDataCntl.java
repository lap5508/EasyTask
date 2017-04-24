/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
/**
 *
 * @author lap5508
 */
public class ExternalDataCntl {
    private final String EXTERNAL_DATA_PATH = "easytask_data\\";
    private final String TASK_FILE_NAME = "tasklist.TSV";
    private final String CONTACT_FILE_NAME = "contactlist.TSV";
    private final String NOTIFICATION_FILE_NAME = "notificationlist.TSV";
    
    public ExternalDataCntl(){
        if(confirmImport()){
            getTaskList();
        }
    }
    
    public void getTaskList(){
        File  externalDataFile = new File(EXTERNAL_DATA_PATH+TASK_FILE_NAME);
        try {
            Scanner in = new Scanner(externalDataFile);
            
       
            ArrayList<Task> tempTaskList = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getTaskList().getListOfTasks();
            String dontUse = in.nextLine();
            if(!tempTaskList.isEmpty()){
                tempTaskList.clear();
            }
            int count = 0;
            while(in.hasNextLine()){
                
                String tempStr = in.nextLine();
                System.out.println(tempStr);
                Task tempTask = new Task(tempStr);
                
                tempTaskList.add(tempTask);
                System.out.println("Madeittohere");
                count++;
            }
            System.out.println(count);
            //System.out.println(tempMediaList);
            SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
            SerializedDataCntl.getSerializedDataCntl().readSerializedDataModel();
            
            
        } catch (FileNotFoundException fne) {
            String message = fne.getMessage();
            System.out.println(message);
        }
    }
    
    /*
    ArrayList<Media> tempMediaList = SerializedDataCntl.GetSerializedDataCntl().getSerializedDataModel().getMediaList().getListOfMedia();
    */
    /*
    public ArrayList<Song> returnMediaList(){
        ArrayList<Song> tempMediaList = this.getSongList();
    }*/
    
    public boolean confirmImport(){
        boolean importConfirmed = false;
        String message = "Are you sure you want to import songs?";
        String title = "Import Songs";
        int result = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION){
            importConfirmed = true;
        }
        
        return importConfirmed;
    }
}
