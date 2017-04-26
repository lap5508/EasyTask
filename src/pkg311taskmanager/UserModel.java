/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.io.Serializable;

/**
 *
 * @author Luke
 */
public class UserModel implements Serializable{
    private String username = null;
    private char[] password = null;
    
    public UserModel(String newUsername, char[] newPassword){
        username = newUsername;
        password = newPassword;
    }
    
    public String getUsername(){
        return username;
    }
    
    public char[] getPassword(){
        return password;
    }
}
