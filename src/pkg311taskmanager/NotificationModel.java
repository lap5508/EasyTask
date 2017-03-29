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
    private int hour;
    private int minute;
    private String am_pm;
    private String day;
    private String month;
    private String year;
    
    public NotificationModel(String tasks, String priority, int hour, int minute, String am_pm, String day, String month, String year){
        this.tasks = tasks;
        this.priority = priority;
        this.hour = hour;
        this.minute = minute;
        this.am_pm = am_pm;
        this.day = day;
        this.month = month;
        this.year = year;  
    }
    
}


