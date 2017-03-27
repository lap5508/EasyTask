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
    private String taskDescription = "";
    private String taskCategory = "";
    private ArrayList<String> actionSteps = new ArrayList();
    
    public Task(){
        System.out.println("Called: Task()");
    }
    
    public Task(String newTitle, String newDescription, String newCategory, Long newStartTime, Long newEndTime, Boolean newEnabled){
        super(newStartTime, newEndTime, newEnabled);
        taskTitle = newTitle;
        taskDescription = newDescription;
        taskCategory = newCategory;
        
        
    }
    
    public String getTitle(){
        return taskTitle;
    }
    
    public String getDescription(){
        return taskDescription;
    }
    
    public String getCategory(){
        return taskCategory;
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
