/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.util.ArrayList;
//import java.io.Serializable;
/**
 *
 * @author Luke
 */
public abstract class ScheduledEvent{
    
    private long startTime = 0;
    private long endTime = 0;
    private boolean enabled = false;
    
    
    public ScheduledEvent(){
        System.out.println("Called: ScheduledEvent()");
    }
    /*
    public ScheduledEvent(String importTaskString){
        String delimiter = "\\t";
        String[] tempTaskArray = importTaskString.split(delimiter);
        this.title = tempTaskArray[0];
        this.title = tempMediaArray[1];
        this.year = tempMediaArray[3]; 
        this.artist = tempMediaArray[2];
    }*/
    
    public ScheduledEvent(Long newStartTime, Long newEndTime, Boolean newEnabled){
        this.startTime = newStartTime;
        this.endTime = newEndTime;
        this.enabled = newEnabled;
    }
    
    public Long getTaskStartTime(){
        return startTime;
    }
    
    public Long getTaskEndTime(){
        return endTime;
    }
    
    public Boolean getTaskEnabled(){
        return enabled;
    }
    
 
}
