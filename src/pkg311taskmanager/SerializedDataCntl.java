/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author lap5508
 */
public class SerializedDataCntl {
    private SerializedDataModel theSerializedDataModel;
    private static SerializedDataCntl theSerializedDataCntl;
    private final String EXTERNAL_DATA_PATH = "easytask_data\\";
    private final String EASYTASK_DATA_FILE_NAME = "EasyTask.ser";
    //private MediaList theMediaList = null;
    
    
    //SAME, ALGORTHYM_FILE_NAME
            
    private SerializedDataCntl(){
      getSerializedDataModel();
    }
    
    public static SerializedDataCntl getSerializedDataCntl(){
        if(theSerializedDataCntl == null){
            theSerializedDataCntl = new SerializedDataCntl();
        }
        return theSerializedDataCntl;
    }
    
    public SerializedDataModel getSerializedDataModel(){
        if(theSerializedDataModel == null){
            theSerializedDataModel = new SerializedDataModel();
            readSerializedDataModel();
            if(theSerializedDataModel == null){
                theSerializedDataModel = new SerializedDataModel();
                writeSerializedDataModel();
                readSerializedDataModel();
                
            }
            
        }
        return theSerializedDataModel;
    }
    
    public void readSerializedDataModel(){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        String filePath = EXTERNAL_DATA_PATH+EASYTASK_DATA_FILE_NAME;
        
        try{
            fis = new FileInputStream(filePath);
            in = new ObjectInputStream(fis);
            theSerializedDataModel = (SerializedDataModel) in.readObject();
            in.close();
            fis.close();
            System.out.println("Serialized data has been read in");
            //EXACTLY THE SAME AS TESTIO
        }catch(IOException i){
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
    }
    
    
    public void writeSerializedDataModel(){
        try{
            FileOutputStream fileOut = new FileOutputStream(EXTERNAL_DATA_PATH+EASYTASK_DATA_FILE_NAME);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(theSerializedDataModel);
            out.close();
            System.out.println("Serialized data has been saved");
        }catch(IOException i){
            i.printStackTrace();
        }
        
    }
}
