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
    private MainMenuUIv2 theMainMenuUIv2 = null;
    private String navUsername = "";
    private TaskCntl theTaskCntl = null;
    private CalendarCntl theCalendarCntl = null;
    private ContactController theContactControl = null;
    private NotificationController theNotificationCntl = null;
    
    public NavigationCntl(String username){
        System.out.println("Made it to NavigationCntl");
        theMainMenuUIv2 = new MainMenuUIv2(this);
        theMainMenuUIv2.setLocationRelativeTo(null);
        theMainMenuUIv2.setVisible(true);
        navUsername = username;
    }
    
    public String getTheUsername(){
        return navUsername;
    }
    
    public void requestContactCntl(){
        theMainMenuUIv2.setVisible(false);
        theContactControl = new ContactController(this);
    }
    
    public void requestTaskCntl(){
        theMainMenuUIv2.setVisible(false);
        theTaskCntl = new TaskCntl(this);
    }
    
    
    
    public void requestCalendarCntl(){
        theMainMenuUIv2.setVisible(false);
        //theCalendarCntl = new CalendarCntl(this);
    }
    
    public void requestNotificationCntl(){
        theMainMenuUIv2.setVisible(false);
        theNotificationCntl = new NotificationController(this);
    }

    public void getNavigationCntl(){
        
        theMainMenuUIv2.setVisible(true);
    
    }
}
