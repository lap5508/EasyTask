/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

/**
 *
 * @author Luke
 */
public class NavigationCntl {
    private MainMenuUI theMainMenuUI = null;
    private String navUsername = "";
    private TaskCntl theTaskCntl = null;
    private CalendarCntl theCalendarCntl = null;
    private ContactController theContactControl = null;
    private NotificationController theNotificationCntl = null;
    private LoginCntl theLogInCntl = null;
    
    public NavigationCntl(String username){
        System.out.println("Made it to NavigationCntl");
        theMainMenuUI = new MainMenuUI(this);
        theMainMenuUI.setLocationRelativeTo(null);
        theMainMenuUI.setVisible(true);
        navUsername = username;
    }
    
    public String getTheUsername(){
        return navUsername;
    }
    
    public void requestContactCntl(){
        theMainMenuUI.setVisible(false);
        theContactControl = new ContactController(this);
    }
    public void requestLoginCntl(){
        theMainMenuUI.setVisible(false);
        theLogInCntl = new LoginCntl(this);
    }
    
    public void requestTaskCntl(){
        theMainMenuUI.setVisible(false);
        theTaskCntl = new TaskCntl(this);
    }
    
    
    
    public void requestCalendarCntl(){
        theMainMenuUI.setVisible(false);
        //theCalendarCntl = new CalendarCntl(this);
    }
    
    public void requestNotificationCntl(){
        theMainMenuUI.setVisible(false);
        theNotificationCntl = new NotificationController(this);
    }

    public void getNavigationCntl(){
        
        theMainMenuUI.setVisible(true);
    
    }
}
