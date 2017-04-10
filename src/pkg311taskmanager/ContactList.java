/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.util.ArrayList;

/**
 *
 * @author Kyle
 */
public class ContactList {
    private ArrayList<ContactModel> contactList = null;

    public ContactList(){
        if(contactList== null){
            buildTestContactList();
        }
    }
    public void buildTestContactList(){
        contactList = new ArrayList();
        for(int i = 0; i < 50; i++){
            String fName = "Bob" + i;
            String mName = "Lee" + i;
            String lName = "Swagger" + i;
            String hNum = "5558430";
            String cNum = "5555555";
            String wNum = "N/A";
            String hAdd = i + " East Beaver Ave";
            String wAdd = "N/A";
            ContactModel newContact = new ContactModel(fName, mName, lName, hNum, cNum, wNum, hAdd,wAdd);
            contactList.add(newContact);
        }
        System.out.println(contactList);
    }
    
    public ArrayList<ContactModel> getTheContactList() {
        return contactList;
    }
    
}
