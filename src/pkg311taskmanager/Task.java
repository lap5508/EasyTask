/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.util.ArrayList;
/**
 *
 * @author Luke
 */
public class Task extends ScheduledEvent{
    
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
    
    public Task(String newTitle, String newDate, String newTime, String newLocation, String newDescription, String newCategory, String newPriority, Long newStartTime, Long newEndTime, Boolean newEnabled){
        super(newStartTime, newEndTime, newEnabled);
        taskTitle = newTitle;
        taskDate = newDate;
        taskTime = newTime;
        taskLocation = newLocation;
        taskDescription = newDescription;
        taskCategory = newCategory;
        taskPriority = newPriority;
        
        
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
    
}
