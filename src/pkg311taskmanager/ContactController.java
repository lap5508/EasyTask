/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

/**
 *
 * @author Kyle
 */
public class ContactController {
    private NavigationCntl theNavigationCntl = null;
    private ContactUI theContactUI = null;
    private ContactList theContactList = null;
    private MainMenuUIv2 theMainMenuUI = null;
    
    public ContactController(NavigationCntl parentNavCntl){
        System.out.println("MADE IT TO CONTACT CNTL");
        theNavigationCntl = parentNavCntl;
        theContactList = new ContactList();
        theContactUI = new ContactUI(this);
        theContactUI.setVisible(true);
    }
    
    public void getContactUI(){
        theContactUI.setVisible(false);
        theContactUI.dispose();
        theContactUI.setLocationRelativeTo(null);
        theContactUI.setVisible(true);
    }
    
    public void requestNavigationCntl(){
        theContactUI.setVisible(false);
        theNavigationCntl.getNavigationCntl();
    }
}
