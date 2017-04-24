/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.util.ArrayList;

/**
 *
 * @author rober_000
 */

public class NotificationList {
    
    private ArrayList<NotificationModel> notificationList = null;
    
    
    public NotificationList(){
     if(notificationList == null){
        buildTestNotificationList();
        }    
    }

    public void buildTestNotificationList(){
        notificationList = new ArrayList();
        for(int i = 0; i < 10; i++){
            String tasks = "Task " +i;
            String priority = "Low";
            String hour = "3";
            String minute = "15";
            String am_pm = "PM";
            String day = "14";
            String month = "April";
            String year = "2017";
            NotificationModel newTestNotification = new NotificationModel(tasks, priority, hour, minute, am_pm, day, month, year);
            notificationList.add(newTestNotification);
        }
        System.out.println(notificationList);
    }
    
    
    public ArrayList<NotificationModel> getTheNotificationList(){
        
        return notificationList;
    }

    
    }
    














