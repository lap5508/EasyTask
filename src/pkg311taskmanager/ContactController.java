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
public class ContactController {
    private NavigationCntl theNavigationCntl = null;
    private ContactUI theContactUI = null;
    private ContactList contactList = null;
    private MainMenuUIv2 theMainMenuUI = null;
    private AddContactUI theAddContactUI = null;
    private ContactTableModel contactTableModel;
    private ArrayList<ContactModel> theContactList;
    int tempIndex = 0;
    private ContactModel tempContact;
    
    public ContactController(NavigationCntl parentNavCntl){
        System.out.println("MADE IT TO CONTACT CNTL");
        theNavigationCntl = parentNavCntl;
        contactList = new ContactList();
        contactTableModel = new ContactTableModel(SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getContactList().getTheContactList());
        theContactUI = new ContactUI(this);
        theContactUI.setLocationRelativeTo(null);
        theContactUI.setVisible(true);
    }
    
    public void getContactUI(){
        theContactUI.setVisible(false);
        theContactUI.dispose();
        theContactUI.setLocationRelativeTo(null);
        theContactUI.setVisible(true);
    }
    public void keepContactUI(){
        theContactUI.setVisible(false);
        theContactUI.dispose();
        theContactUI = new ContactUI(this);
        theContactUI.setLocationRelativeTo(null);
        theContactUI.setVisible(true);
    }
    public void returnContactUI(){
        theAddContactUI.setVisible(false);
        theAddContactUI.dispose();
        theContactUI.setLocationRelativeTo(null);
        theContactUI.setVisible(true);
    }
    public void getAddContactUIblank(){
        theAddContactUI = new AddContactUI(this);
    }
    public void getAddContactUI(int contactRowToGet){
        theContactUI.setVisible(false);
        theAddContactUI = new AddContactUI(this, contactRowToGet);
    }
    public ContactList getContactList(){
        return contactList;
    }
    public ArrayList<ContactModel> getTheContactList(){
        return theContactList;
    }
    public ContactTableModel getContactTableModel(){
        return contactTableModel;
    }
    
    public void requestNavigationCntl(){
        theContactUI.setVisible(false);
        theNavigationCntl.getNavigationCntl();
    }
    public void requestTaskCntl(){
        theContactUI.setVisible(false);
        theNavigationCntl.requestTaskCntl();
    }
    public void requestCalendarCntl(){
        theContactUI.setVisible(false);
        theNavigationCntl.requestCalendarCntl();
    }
    public void requestNotificationCntl(){
        theContactUI.setVisible(false);
        theNavigationCntl.requestNotificationCntl();
    }
    public void addNewContact(String fName, String mName, String lName, String hNum, String cNum, String wNum, String hAddress, String wAddress){
        ContactModel newContact = new ContactModel(fName, mName, lName, hNum, cNum, wNum, hAddress, wAddress);
        SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getContactList().getTheContactList().add(newContact);
    }
    public void addNewContact(ContactModel newContact){
        tempContact = contactList.getTheContactList().get(tempIndex);
        contactList.getTheContactList().add(tempContact);
    }
    public void setContactList(ContactModel newContact){
        tempContact = newContact;
        theContactList.add(tempContact);
    }
    public void editContactInfo(int index, String fName, String mName, String lName, String hNum, String cNum, String wNum, String hAddress, String wAddress){
        tempContact = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getContactList().getTheContactList().get(index);
        tempContact.changeInfo(fName, mName, lName, hNum, cNum, wNum, hAddress, wAddress);
    }
}
