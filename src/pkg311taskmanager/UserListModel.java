/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Luke
 */
public class UserListModel implements Serializable{
    private ArrayList<UserModel> theListOfUsers;
    
    public UserListModel(){
        if(theListOfUsers == null){
            //buildTestUserList();
            //SerializedDataCntl.getSerializedDataCntl().writeSerializedDataModel();
        }    
        
    }
    
    public void buildTestUserList(){
        theListOfUsers = new ArrayList();
        for (int i = 0; i < 100; i++){
            String username = ("TestUser" + i);
            char[] password = {'t','e','s','t'};
            UserModel newUser = new UserModel(username, password);
            getTheListOfUsers().add(newUser);
        }
        System.out.println("made new losers");
    }
    
    public boolean authenticate(String usernameToCheck, char[] passwordToCheck){
        boolean authenticated = false;
        boolean nameMatch = false;
        boolean passwordMatch = false;
        for (int i = 0; i < getTheListOfUsers().size(); i++){
            nameMatch = usernameToCheck.equals(getTheListOfUsers().get(i).getUsername());
            passwordMatch = String.valueOf(passwordToCheck).equals(String.valueOf(getTheListOfUsers().get(i).getPassword()));
            if(nameMatch && passwordMatch){
                authenticated = true;
                break;
            }
        }
        
        return authenticated;
    }

    /**
     * @return the theListOfUsers
     */
    public ArrayList<UserModel> getTheListOfUsers() {
        if(theListOfUsers == null){
            theListOfUsers = new ArrayList<UserModel>();
        }
        return theListOfUsers;
    }
}
