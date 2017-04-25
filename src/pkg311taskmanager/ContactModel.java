/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.io.Serializable;

/**
 *
 * @author Kyle
 */
public class ContactModel implements Serializable{
    private String fName;
    private String mName;
    private String lName;
    private int contactID;
    private String hAddress;
    private String wAddress;
    private String email;
    private String workNum;
    private String cellNum;
    private String homeNum;
    private String photoID;
    private String group;
    
    
    public ContactModel(String first,String newmName, String last,String newHomeNum, String newWorkNum,String newCellNum, String newHAddress, String newWAddress){
        fName = first;
        mName = newmName;
        lName = last;
        homeNum = newHomeNum;
        workNum = newWorkNum;
        cellNum = newCellNum;
        hAddress = newHAddress;
        wAddress = newWAddress;        
        //photoID = newPhotoID;
        //group = groupN;
        
    }
    public void changeInfo(String first,String newmName, String last,String newHomeNum, String newWorkNum,String newCellNum, String newHAddress, String newWAddress){
        this.fName = first;
        this.mName = newmName;
        this.lName = last;
        this.homeNum = newHomeNum;
        this.workNum = newWorkNum;
        this.cellNum = newCellNum;
        this.hAddress = newHAddress;
        this.wAddress = newWAddress;
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
    public String getWorkNum() {
        return workNum;
    }

    /**
     * @return the cellNum
     */
    public String getCellNum() {
        return cellNum;
    }

    /**
     * @return the homeNum
     */
    public String getHomeNum() {
        return homeNum;
    }

 
}

