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
public class LoginController {
    private UserListModel theUserList;
    private LoginUI theLoginUI;
    private NavigationController theNavigationCntl;
    private ArrayList<UserModel> theListOfUsers;
    private AddUserUI theAddUserUI;
    //private SerializedDataCntl theSerializedDataCntl;
    
    public LoginController(){
        
        
        theUserList = SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getUserList();
        theLoginUI = new LoginUI(this);
        theLoginUI.setLocationRelativeTo(null);
        theLoginUI.setVisible(true);
    }
    public LoginController(NavigationController newNavCntl){
        theNavigationCntl = newNavCntl;
        if(theUserList == null){
            theUserList = new UserListModel();
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
        theNavigationCntl = new NavigationController(theLoginUI.getUsername());
    }
    public ArrayList<UserModel> getListOfUsers(){
        return theListOfUsers;
    }
    
    public UserListModel getUserList(){
        return theUserList;
    }
    public void addNewUser(String uName, char[] pW){
        UserModel newUser = new UserModel(uName, pW);
        theUserList.getTheListOfUsers().add(newUser);
        SerializedDataController.getSerializedDataCntl().writeSerializedDataModel();
    }
    public boolean requestAuthenticate(String usernameToCheck, char[] passwordToCheck){
        boolean authenticated = theUserList.authenticate(usernameToCheck, passwordToCheck);
        return authenticated;
    }
    
    public String getUsername(){
        return theLoginUI.getUsername();
    }
}
