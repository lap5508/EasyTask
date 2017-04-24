/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.util.ArrayList;

/**
 *
 * @author Luke
 */
public class LoginCntl {
    private UserList theUserList;
    private LoginUI theLoginUI;
    private NavigationCntl theNavigationCntl;
    private ArrayList<User> theListOfUsers;
    private AddUserUI theAddUserUI;
    //private SerializedDataCntl theSerializedDataCntl;
    
    public LoginCntl(){
        if(theUserList == null){
            theUserList = new UserList();
        }    
        theLoginUI = new LoginUI(this);
        theLoginUI.setLocationRelativeTo(null);
        theLoginUI.setVisible(true);
    }
    public LoginCntl(NavigationCntl newNavCntl){
        theNavigationCntl = newNavCntl;
        if(theUserList == null){
            theUserList = new UserList();
        }    
        theLoginUI = new LoginUI(this);
        theLoginUI.setLocationRelativeTo(null);
        theLoginUI.setVisible(true);
    }
    
 
    public void requestAddUserUI(){
       
       theAddUserUI = new AddUserUI(this);
    }
    
    public void requestNavigationCntl(){
        theLoginUI.setVisible(false); 
        //theNavigationCntl = new NavigationCntl();
        theNavigationCntl = new NavigationCntl(theLoginUI.getUsername());
    }
    public ArrayList<User> getListOfUsers(){
        return theListOfUsers;
    }
    
    public UserList getUserList(){
        return theUserList;
    }
    public void addNewUser(String uName, char[] pW){
        User newUser = new User(uName, pW);
        theUserList.getTheListOfUsers().add(newUser);
    }
    public boolean requestAuthenticate(String usernameToCheck, char[] passwordToCheck){
        boolean authenticated = theUserList.authenticate(usernameToCheck, passwordToCheck);
        return authenticated;
    }
    
    public String getUsername(){
        return theLoginUI.getUsername();
    }
}
