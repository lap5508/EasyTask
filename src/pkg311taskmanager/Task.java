/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author Luke
 */
public class Task extends ScheduledEvent implements Serializable{
    
    private String taskTitle = "";
    private String taskLocation = "";
    private String taskTime = "";
    private String taskDate = "";
    private String taskDescription = "";
    private String taskCategory = "";
    private String taskPriority = "";
    private ArrayList<String> actionSteps = new ArrayList();
    
    public Task(){
        System.out.println("Called: Task()");
    }
    
    public Task(String importTaskString){
        //super(importTaskString);
        String delimiter = "\\t";
        String[] tempTaskArray = importTaskString.split(delimiter);
        try{
            this.taskTitle = tempTaskArray[0];
            this.taskDate = tempTaskArray[1];
            this.taskTime = tempTaskArray[2];
            this.taskLocation = tempTaskArray[3];
            this.taskDescription = tempTaskArray[4];
            this.taskCategory = tempTaskArray[5];
            this.taskPriority = tempTaskArray[6];
            
        }catch(ArrayIndexOutOfBoundsException e){
            
        }       
    }
    
    public Task(String newTitle, String newDate, String newTime, String newLocation, String newDescription){
        //super(newStartTime, newEndTime, newEnabled);
        taskTitle = newTitle;
        taskDate = newDate;
        taskTime = newTime;
        taskLocation = newLocation;
        taskDescription = newDescription;
        //taskCategory = newCategory;
        //taskPriority = newPriority;
        
        
    }
    
    public String getTitle(){
        return taskTitle;
    }
    
    public String getDate(){
        return taskDate;
    }
    
    public String getTime(){
        return taskTime;
    }
    
    public String getLocation(){
        return taskLocation;
    }
    
    public String getDescription(){
        return taskDescription;
    }
    
    public String getCategory(){
        return taskCategory;
    }
    
    public String getPriority(){
        return taskPriority;
    }
    
    public Long getStartTime(){
        return super.getTaskStartTime();
    }
    
    public Long getEndTime(){
        return super.getTaskEndTime();
    }
    
    public Boolean getEnabled(){
        return super.getTaskEnabled();
    }
    
    public void changeInfo(String newTitle, String newDate, String newTime, String newLocation, String newDescription){
        this.taskTitle = newTitle;
        this.taskDate = newDate;
        this.taskTime = newTime;
        this.taskLocation = newLocation;
        this.taskDescription = newDescription;
    }
}
