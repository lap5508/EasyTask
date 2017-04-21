/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

/**
 *
 * @author rober_000
 */
public class NotificationModel {
    
    private String tasks;
    private String priority;
    private String hour;
    private String minute;
    private String am_pm;
    private String day;
    private String month;
    private String year;
    
    public NotificationModel(String tasks, String priority, String hour, String minute, String am_pm, String day, String month, String year){
        this.tasks = tasks;
        this.priority = priority;
        this.hour = hour;
        this.minute = minute;
        this.am_pm = am_pm;
        this.day = day;
        this.month = month;
        this.year = year;  
    }
    
     public String getTask() {
        return tasks;
    }

    public void setTask(String tasks) {
        this.tasks = tasks;
    }
    
    
     public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    
    
     public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
    
    
     public String getMinute() {
        return minute;
    }
    
    public void setMinute(String minute) {
        this.minute = minute;
    }
    
    
     public String getAm_Pm() {
        return am_pm;
    }

    public void setAm_Pm(String am_pm) {
        this.am_pm = am_pm;
    }
    
    
     public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    
    
     public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    
    
     public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public void changeInfo(String task, String priority, String hour, String minute, String am_pm, String day, String month, String year){
        this.tasks = task;
        this.priority = priority;
        this.hour = hour;
        this.minute = minute;
        this.am_pm = am_pm;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
}


