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
    private UserListModel theUserList;
    private TaskListModel theTaskList;
    private ContactListModel theContactList;
    private NotificationList theNotificationList;
    
    public SerializedDataModel(){
        if(theUserList == null){
            theUserList = new UserListModel();
        }    
        if(theTaskList == null){
            theTaskList = new TaskListModel();
        }   
        if(theNotificationList == null){
            theNotificationList = new NotificationList();
        }
        if(theContactList == null){
            theContactList = new ContactListModel();
        }
    }
    
    public UserListModel getUserList(){
        return theUserList;
    }
    
    public TaskListModel getTaskList(){
        return theTaskList;
    }
    
    public ContactListModel getContactList(){
        return theContactList;
    }
    
    public NotificationList getNotificationList(){
        return theNotificationList;
    }
    
    public void setTaskList(TaskListModel newTaskList){
        theTaskList = newTaskList;
    }
    
    public void setUserList(UserListModel newUserList){
        theUserList = newUserList;
    } 
    
    public void setContactList(ContactListModel newContactList){
        theContactList = newContactList;
    }
    
    public void setNotificationList(NotificationList newNotificationList){
        theNotificationList = newNotificationList;
    }
}
