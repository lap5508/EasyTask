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
public class LoginCntl {
    private UserList theUserList;
    private LoginUIv2 theLoginUIv2;
    private NavigationCntl theNavigationCntl;
    //private SerializedDataCntl theSerializedDataCntl;
    
    public LoginCntl(){

        if(theUserList == null){
            theUserList = new UserList();
        }    
        theLoginUIv2 = new LoginUIv2(this);
        theLoginUIv2.setLocationRelativeTo(null);
        theLoginUIv2.setVisible(true);
    }
    
    public void requestNavigationCntl(){
        theLoginUIv2.setVisible(false); 
        //theNavigationCntl = new NavigationCntl();
        theNavigationCntl = new NavigationCntl(theLoginUIv2.getUsername());
    }
    
    public boolean requestAuthenticate(String usernameToCheck, char[] passwordToCheck){
        boolean authenticated = theUserList.authenticate(usernameToCheck, passwordToCheck);
        return authenticated;
    }
    
    public String getUsername(){
        return theLoginUIv2.getUsername();
    }
}
