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
public class NotificationController {
    
    
    private NotificationList theNotificationList;
    private NotificationListModel listModel;
    private NotificationModel newNotification;
    private NavigationCntl theNavigationCntl = null;
    private NotificationUI theNotificationUI = null;
    private AddNotificationUI theAddNotificationUI = null;
    private MainMenuUIv2 theMainMenuUI = null;
    
    public NotificationController(NavigationCntl parentNavCntl){
        System.out.println("MADE IT TO Notification CNTL");
        theNavigationCntl = parentNavCntl;
        theNotificationUI = new NotificationUI(this);
        theNotificationUI.setVisible(true);
    }
    
    public void getNotificationUI(){
        theNotificationUI.setVisible(false);
        theNotificationUI.dispose();
        theNotificationUI.setLocationRelativeTo(null);
        theNotificationUI.setVisible(true);
    }
    
    public void getAddNotificationUI(){
        theNotificationUI.setVisible(false);
        theAddNotificationUI = new AddNotificationUI(this);
    }
    
    public void backButtonPressed(){
        theAddNotificationUI.setVisible(false);
        theNotificationUI.setVisible(false);
        theNotificationUI.dispose();
        theNotificationUI.setLocationRelativeTo(null);
        theNotificationUI.setVisible(true);
    }
    
    public void addNotificationButtonPressed(String task, String priority, String hour, String minute, String am_pm, String day, String month, String year){
        NotificationModel newNotification = new NotificationModel(task, priority, hour, minute, am_pm, day, month, year);
        theNotificationList.addNotification(newNotification);
    }
    
    public NotificationList getNotificationList(){
        return theNotificationList;
    }
    
    public NotificationListModel getNotificationListModel(){
        return listModel;
    }
    
    
    public void requestNavigationCntl(){
        theNotificationUI.setVisible(false);
        theNavigationCntl.getNavigationCntl();
    }
    
}
