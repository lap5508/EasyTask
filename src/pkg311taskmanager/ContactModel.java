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
public class ContactModel {
    private String fName;
    private String mName;
    private String lName;
    private int contactID;
    private String hAddress;
    private String wAddress;
    private String email;
    private int workNum;
    private int cellNum;
    private int homeNum;
    private String photoID;
    private String group;
    
    
    public ContactModel(String first, String last, String groupN){
        fName = first;
        this.mName = mName;
        lName = last;
        this.contactID = contactID;
        this.hAddress = hAddress;
        this.wAddress = wAddress;
        this.workNum = workNum;
        this.cellNum = cellNum;
        this.homeNum = homeNum;
        this.photoID = photoID;
        group = groupN;
        
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the mName
     */
    public String getmName() {
        return mName;
    }

    /**
     * @param mName the mName to set
     */
    public void setmName(String mName) {
        this.mName = mName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the hAddress
     */
    public String gethAddress() {
        return hAddress;
    }

    /**
     * @param hAddress the hAddress to set
     */
    public void sethAddress(String hAddress) {
        this.hAddress = hAddress;
    }

    /**
     * @return the wAddress
     */
    public String getwAddress() {
        return wAddress;
    }

    /**
     * @param wAddress the wAddress to set
     */
    public void setwAddress(String wAddress) {
        this.wAddress = wAddress;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the workNum
     */
    public int getWorkNum() {
        return workNum;
    }

    /**
     * @param workNum the workNum to set
     */
    public void setWorkNum(int workNum) {
        this.workNum = workNum;
    }

    /**
     * @return the cellNum
     */
    public int getCellNum() {
        return cellNum;
    }

    /**
     * @param cellNum the cellNum to set
     */
    public void setCellNum(int cellNum) {
        this.cellNum = cellNum;
    }

    /**
     * @return the homeNum
     */
    public int getHomeNum() {
        return homeNum;
    }

    /**
     * @param homeNum the homeNum to set
     */
    public void setHomeNum(int homeNum) {
        this.homeNum = homeNum;
    }

    /**
     * @return the photoID
     */
    public String getPhotoID() {
        return photoID;
    }

    /**
     * @param photoID the photoID to set
     */
    public void setPhotoID(String photoID) {
        this.photoID = photoID;
    }

    /**
     * @return the group
     */
    public String getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }
    
}

