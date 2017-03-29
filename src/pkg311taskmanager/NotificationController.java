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
    
    
    
    
    private NavigationCntl theNavigationCntl = null;
    private NotificationUI theNotificationUI = null;
    private AddNotificationUI theAddNotificationUI = null;
    //private NotificationList theContactList = null;
    private MainMenuUIv2 theMainMenuUI = null;
    
    public NotificationController(NavigationCntl parentNavCntl){
        System.out.println("MADE IT TO Notification CNTL");
        theNavigationCntl = parentNavCntl;
        //theContactList = new ContactList();
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
    
    public void requestNavigationCntl(){
        theNotificationUI.setVisible(false);
        theNavigationCntl.getNavigationCntl();
    }
    
}
