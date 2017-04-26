/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.WindowConstants;
/**
 *
 * @author Kyle
 */
public class AddContactUI extends JFrame{
    private JLabel fNameLabel;
    private JLabel lNameLabel;
    private JLabel mNameLabel;
    private JLabel cNumLabel;
    private JLabel wNumLabel;
    private JLabel hNumLabel;
    private JLabel hAddressLabel;
    private JLabel wAddressLabel;
    private JLabel Label;
    private JLabel headerLabel;
    private JButton saveButton;
    private JButton backButton;
    private JTextField fNameField;
    private JTextField lNameField;
    private JTextField mNameField;
    private JTextField cNumField;
    private JTextField hNumField;
    private JTextField wNumField;
    private JTextField hAddressField;
    private JTextField wAddressField;
    private JPanel buttonPanel;
    private JPanel infoPanel;
    private JPanel[] cellNumbers;
    private int index = -1;
    private TaskController theTaskCntl = null;
    private ContactController cControl = null;
    
    public AddContactUI(ContactController newcCntl){
        cControl = newcCntl;
        this.setVisible(true);
        initCustomComponents(false, 0);
    }
    
    public AddContactUI(ContactController newcCntl, int taskRow){
        cControl = newcCntl;
        index = taskRow;
        initCustomComponents(true, taskRow);
        System.out.println("Lets See");
        this.setVisible(true);
    }
    
    public void initCustomComponents(boolean hasInfo, int row){
        this.setSize(700, 300);
        this.setTitle("Contact Info");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        saveButton = new JButton("SAVE");
            saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        
            backButton = new JButton("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        
        buttonPanel = new JPanel();
            buttonPanel.add(backButton);
            buttonPanel.add(saveButton);

        infoPanel = new JPanel();
            infoPanel.setLayout(new GridLayout(8,2,0,0));
        
        cellNumbers = new JPanel[16];
            for (int i = 0; i < 16; i++) {
                JPanel nextPanel = new JPanel();
                cellNumbers[i] = nextPanel;
                infoPanel.add(nextPanel);
            }
            
        fNameLabel = new JLabel("First Name: ");
        mNameLabel = new JLabel("Middle Name: ");
        lNameLabel = new JLabel("Last Name: ");
        hNumLabel = new JLabel("HomeNumber ");
        cNumLabel = new JLabel("Cell Number: ");
        wNumLabel = new JLabel("Work Number: ");
        hAddressLabel = new JLabel("Home Address: ");
        wAddressLabel = new JLabel("Work Address: ");
        
        fNameField = new JTextField(12);
            fNameField.setEditable(true);
        mNameField = new JTextField(12);
            mNameField.setEditable(true);
        lNameField = new JTextField(12);
            lNameField.setEditable(true);
        hNumField = new JTextField(10);
            hNumField.setEditable(true);
        cNumField = new JTextField(10);
            cNumField.setEditable(true);
        wNumField = new JTextField(10);
            wNumField.setEditable(true);
        hAddressField = new JTextField(30);
            hAddressField.setEditable(true);
        wAddressField = new JTextField(30);
            wAddressField.setEditable(true);
        
        if(hasInfo){
           
            String fName;
                fName = SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getContactList().getTheContactList().get(row).getfName();
            String mName;
                mName = SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getContactList().getTheContactList().get(row).getmName();
            String lName;
                lName = SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getContactList().getTheContactList().get(row).getlName();
            String hNum;
                hNum = SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getContactList().getTheContactList().get(row).getHomeNum();
            String cNum;
                cNum = SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getContactList().getTheContactList().get(row).getCellNum();
            String wNum;
                wNum = SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getContactList().getTheContactList().get(row).getWorkNum();
            String hAddress;
                hAddress = SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getContactList().getTheContactList().get(row).gethAddress();
            String wAddress;
               wAddress = SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getContactList().getTheContactList().get(row).getwAddress();


            fNameField.setText(fName);
            mNameField.setText(mName);
            lNameField.setText(lName);
            hNumField.setText(hNum);
            cNumField.setText(cNum);
            wNumField.setText(wNum);
            hAddressField.setText(hAddress);
            wAddressField.setText(wAddress);
        }
        
        cellNumbers[0].add(fNameLabel);
        cellNumbers[1].add(fNameField);
        cellNumbers[2].add(mNameLabel);
        cellNumbers[3].add(mNameField);
        cellNumbers[4].add(lNameLabel);
        cellNumbers[5].add(lNameField);
        cellNumbers[6].add(hNumLabel);
        cellNumbers[7].add(hNumField);
        cellNumbers[8].add(cNumLabel);
        cellNumbers[9].add(cNumField);
        cellNumbers[10].add(wNumLabel);
        cellNumbers[11].add(wNumField);
        cellNumbers[12].add(hAddressLabel);
        cellNumbers[13].add(hAddressField);
        cellNumbers[14].add(wAddressLabel);
        cellNumbers[15].add(wAddressField);
        
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(infoPanel, BorderLayout.CENTER);
    }
    
    private void saveButtonActionPerformed(ActionEvent evt){
        if(index == -1){
            
            AddContactUI.this.cControl.addNewContact(fNameField.getText(),mNameField.getText(),lNameField.getText(),hNumField.getText(),cNumField.getText(), wNumField.getText(), hAddressField.getText(), wAddressField.getText());
            SerializedDataController.getSerializedDataCntl().writeSerializedDataModel();
            AddContactUI.this.cControl.getContactTableModel().fireTableDataChanged();
        }
        else{
            AddContactUI.this.cControl.editContactInfo(index, fNameField.getText(),mNameField.getText(),lNameField.getText(),hNumField.getText(),cNumField.getText(), wNumField.getText(), hAddressField.getText(), wAddressField.getText());
            SerializedDataController.getSerializedDataCntl().writeSerializedDataModel();
            AddContactUI.this.cControl.getContactTableModel().fireTableDataChanged();

        }
        AddContactUI.this.cControl.returnContactUI();
        this.setVisible(false);
    }
    
    private void backButtonActionPerformed(ActionEvent evt){
        AddContactUI.this.cControl.returnContactUI();
        this.setVisible(false);
    }
}
