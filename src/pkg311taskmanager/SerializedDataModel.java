/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.io.Serializable;

/**
 *
 * @author lap5508
 */
public class SerializedDataModel implements Serializable {
    private UserList theUserList;
    private TaskList theTaskList;
    private ContactList theContactList;
    private NotificationList theNotificationList;
    
    public SerializedDataModel(){
        if(theUserList == null){
            theUserList = new UserList();
        }    
        if(theTaskList == null){
            theTaskList = new TaskList();
        }   
        if(theNotificationList == null){
            theNotificationList = new NotificationList();
        }
    }
    
    public UserList getUserList(){
        return theUserList;
    }
    
    public TaskList getTaskList(){
        return theTaskList;
    }
    
    public ContactList getContactList(){
        return theContactList;
    }
    
    public NotificationList getNotificationList(){
        return theNotificationList;
    }
    
    public void setTaskList(TaskList newTaskList){
        theTaskList = newTaskList;
    }
    
    public void setUserList(UserList newUserList){
        theUserList = newUserList;
    } 
    
    public void setContactList(ContactList newContactList){
        theContactList = newContactList;
    }
    
    public void setNotificationList(NotificationList newNotificationList){
        theNotificationList = newNotificationList;
    }
}
