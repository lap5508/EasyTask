/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.io.Serializable;

/**
 *
 * @author rober_000
 */
public class NotificationModel implements Serializable{
    
    private String tasks;
    private String priority;
    private int hour;
    private String tempHour;
    private int minute;
    private String tempMinute;
    private int am_pm;
    private String tempAm_Pm;
    private int day;
    private String tempDay;
    private int month;
    private String tempMonth;
    private int year;
    private String tempYear;
    
    public NotificationModel(String task, String apriority, String ahour, String aminute, String zam_pm, String zday, String zmonth, String zyear){
        this.tasks = task;
        this.priority = apriority;
        hour = Integer.parseInt(ahour);
        minute = Integer.parseInt(aminute);
        if(zam_pm == "AM")
        {
        am_pm = 0;
        }
        if(zam_pm == "PM")
        {
        am_pm = 1;
        }
        day = Integer.parseInt(zday);
   
        if(zmonth == "January")
        {
        month = 1;
        }
        if(zmonth == "February")
        {
        month = 2;
        }
        if(zmonth == "March")
        {
        month = 3;
        }
        if(zmonth == "April")
        {
        month = 4;
        }
        if(zmonth == "May")
        {
        month = 5;
        }
        if(zmonth == "June")
        {
        month = 6;
        }
        if(zmonth == "July")
        {
        month = 7;
        }
        if(zmonth == "August")
        {
        month = 8;
        }
        if(zmonth == "September")
        {
        month = 9;
        }
        if(zmonth == "October")
        {
        month = 10;
        }
        if(zmonth == "November")
        {
        month = 11;
        }
        if(zmonth == "December")
        {
        month = 12;
        }
        
        year = Integer.parseInt(zyear);  
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
        tempHour = Integer.toString(hour);
        return tempHour;
    }

    public void setHour(String newHour) {
        hour = Integer.parseInt(newHour);
    }
    
    
     public String getMinute() {
        tempMinute = Integer.toString(minute);
        return tempMinute;
        
    }
    
    public void setMinute(String newMinute) {
        minute = Integer.parseInt(newMinute);
    }
    
    
     public String getAm_Pm() {
         if(am_pm == 0){
         tempAm_Pm = "AM";
         }
         if(am_pm == 1){
         tempAm_Pm = "PM";
         }
         return tempAm_Pm;
    }

    public void setAm_Pm(String newAm_pm) {
        if(newAm_pm == "AM")
        {
        am_pm = 0;
        }
        if(newAm_pm == "PM")
        {
        am_pm = 1;
        }
    }
    
    
     public String getDay() {
        tempDay = Integer.toString(day);
        return tempDay;
    }

    public void setDay(String newDay) {
        day = Integer.parseInt(newDay);
    }
    
    
     public String getMonth() {
         if(month == 1)
        {
        tempMonth = "January";
        }
        if(month == 2)
        {
        tempMonth = "February";
        }
        if(month == 3)
        {
        tempMonth =  "March";
        }
        if(month == 4)
        {
        tempMonth = "April";
        }
        if(month == 5)
        {
        tempMonth = "May";
        }
        if(month == 6)
        {
        tempMonth = "June";
        }
        if(month == 7)
        {
        tempMonth = "July";
        }
        if(month == 8)
        {
        tempMonth =  "August";
        }
        if(month == 9)
        {
        tempMonth = "September";
        }
        if(month == 10)
        {
        tempMonth =  "October";
        }
        if(month == 11)
        {
        tempMonth = "November";
        }
        if(month == 12)
        {
        tempMonth = "December";
        }
        return tempMonth;
    }

    public void setMonth(String newMonth) {
        if(newMonth == "January")
        {
        month = 1;
        }
        if(newMonth == "February")
        {
        month = 2;
        }
        if(newMonth == "March")
        {
        month = 3;
        }
        if(newMonth == "April")
        {
        month = 4;
        }
        if(newMonth == "May")
        {
        month = 5;
        }
        if(newMonth == "June")
        {
        month = 6;
        }
        if(newMonth == "July")
        {
        month = 7;
        }
        if(newMonth == "August")
        {
        month = 8;
        }
        if(newMonth == "September")
        {
        month = 9;
        }
        if(newMonth == "October")
        {
        month = 10;
        }
        if(newMonth == "November")
        {
        month = 11;
        }
        if(newMonth == "December")
        {
        month = 12;
        }
                
    }
    
    
     public String getYear() {
        tempYear = Integer.toString(year);
        return tempYear;
    }

    public void setYear(String newYear) {
        year = Integer.parseInt(newYear);
    }
    
    public void changeInfo(String task, String zpriority, String zhour, String zminute, String zam_pm, String zday, String zmonth, String zyear){
        this.tasks = task;
        this.priority = zpriority;
        hour = Integer.parseInt(zhour);
        minute = Integer.parseInt(zminute);
        if(zam_pm == "AM")
        {
        am_pm = 0;
        }
        if(zam_pm == "PM")
        {
        am_pm = 1;
        }
        //day = Integer.parseInt(zday);
   
        if(zmonth == "January")
        {
        month = 1;
        }
        if(zmonth == "February")
        {
        month = 2;
        }
        if(zmonth == "March")
        {
        month = 3;
        }
        if(zmonth == "April")
        {
        month = 4;
        }
        if(zmonth == "May")
        {
        month = 5;
        }
        if(zmonth == "June")
        {
        month = 6;
        }
        if(zmonth == "July")
        {
        month = 7;
        }
        if(zmonth == "August")
        {
        month = 8;
        }
        if(zmonth == "September")
        {
        month = 9;
        }
        if(zmonth == "October")
        {
        month = 10;
        }
        if(zmonth == "November")
        {
        month = 11;
        }
        if(zmonth == "December")
        {
        month = 12;
        }
        
        year = Integer.parseInt(zyear);
    }
    
}


