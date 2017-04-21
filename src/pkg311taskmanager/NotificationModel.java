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
    
    public NotificationModel(String task, String apriority, String ahour, String aminute, String zam_pm, String zday, String zmonth, String zyear){
        tasks = task;
        priority = apriority;
        hour = ahour;
        minute = aminute;
        am_pm = zam_pm;
        day = zday;
        month = zmonth;
        year = zyear;  
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
    
    public void changeInfo(String task, String zpriority, String zhour, String zminute, String zam_pm, String zday, String zmonth, String zyear){
        this.tasks = task;
        this.priority = zpriority;
        this.hour = zhour;
        this.minute = zminute;
        this.am_pm = zam_pm;
        this.day = zday;
        this.month = zmonth;
        this.year = zyear;
    }
    
}


