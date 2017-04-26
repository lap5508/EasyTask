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
public class NotificationController {
    
    
    private NotificationList theNotificationList;
    private NotificationListModel listModel;
    private NotificationModel newNotification;
    private NavigationController theNavigationCntl = null;
    private NotificationUI theNotificationUI = null;
    private ArrayList<NotificationModel> theListOfNotifications;
    private AddNotificationUI theAddNotificationUI = null;
    int tempIndex = 0;
    private NotificationModel tempNotification;
    private ContactController cControl;
    private TaskModel task = null;
    private TaskController t_control = null;
    private TaskListModel theTaskList = null;
    private ArrayList<TaskModel> newTaskList;
    private NotificationHelpUI notificationHelp;
    
    public NotificationController(NavigationController parentNavCntl, TaskController newTaskCntl){
        System.out.println("MADE IT TO Notification CNTL");
        t_control = newTaskCntl;
        this.task = task;
        theNavigationCntl = parentNavCntl;
        theNotificationList = new NotificationList();
        listModel = new NotificationListModel(SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getNotificationList().getTheNotificationList());
        theNotificationUI = new NotificationUI(this);
        theNotificationUI.setLocationRelativeTo(null);
        theNotificationUI.setVisible(true);
    }
    public ArrayList<TaskModel> getTaskList(){
        ArrayList<TaskModel> newTaskList = SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getTaskList().getListOfTasks();
        return newTaskList;
    }
    public ArrayList<NotificationModel> getNotList(){
        ArrayList<NotificationModel> newNoteList = SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getNotificationList().getTheNotificationList();
        return newNoteList;
    }

    
    public void getNotificationUI(){
        theNotificationUI.setVisible(false);
        theNotificationUI.dispose();
        theNotificationUI.setLocationRelativeTo(null);
        theNotificationUI.setVisible(true);
    }
    
    public void getNotificationHelpWindow(){
        notificationHelp = new NotificationHelpUI(this);
        notificationHelp.setLocationRelativeTo(null);
    }
    
    public void getAddNotificationUI(int taskRow){
       
        theNotificationUI.setVisible(false);
        
        theAddNotificationUI = new AddNotificationUI(this, taskRow);
        theAddNotificationUI.setBounds(0, 0, 600, 500);
        theAddNotificationUI.setLocationRelativeTo(null);
    }
    
    public void getBlankAddNotificationUI(){
        theAddNotificationUI = new AddNotificationUI(this);
        theAddNotificationUI.setBounds(0, 0, 600, 500);
        theAddNotificationUI.setLocationRelativeTo(null);
    }
    
    public void keepNotificationUI(){
        theNotificationUI.setVisible(false);
        theNotificationUI.dispose();
        theNotificationUI = new NotificationUI(this);
        theNotificationUI.setVisible(true);
    }
    
    public void backButtonPressed(){
        theAddNotificationUI.setVisible(false);
        theNotificationUI.setVisible(false);
        theNotificationUI.dispose();
        theNotificationUI.setLocationRelativeTo(null);
        theNotificationUI.setVisible(true);
    }
    
    public void addNotification(String task, String priority, String hour, String minute, String am_pm, String day, String month, String year){
        NotificationModel newNotification = new NotificationModel(task, priority, hour, minute, am_pm, day, month, year);
        SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getNotificationList().getTheNotificationList().add(newNotification);
    }
    
    
    
    public void addNotification(NotificationModel newNotification){
        tempNotification = theNotificationList.getTheNotificationList().get(tempIndex);
        theNotificationList.getTheNotificationList().add(tempNotification);
    }
    
    
    public void editNotificationInfo(int index, String task, String priority, String hour, String minute, String am_pm, String day, String month, String year){
        tempNotification = SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getNotificationList().getTheNotificationList().get(index);
        tempNotification.changeInfo(task, priority, hour, minute, am_pm, day, month, year);
    }
    
    public NotificationList getNotificationList(){
        return theNotificationList;
    }
    
    public NotificationListModel getNotificationListModel(){
        return listModel;
    }
    
    public ArrayList<NotificationModel> getTheNotificationList(){
        return theListOfNotifications;
    }
    
    public void returnNotificationUI(){
        theAddNotificationUI.setVisible(false);
        theAddNotificationUI.dispose();
        theNotificationUI.setVisible(true);
    }
    
    public void requestNavigationCntl(){
        theNotificationUI.setVisible(false);
        theNavigationCntl.getNavigationCntl();
    }
    public void requestTaskCntl(){
        theNotificationUI.setVisible(false);
        theNavigationCntl.requestTaskCntl();
    }
    public void requestContactCntl(){
        theNotificationUI.setVisible(false);
        theNavigationCntl.requestContactCntl();
    }
    
}
