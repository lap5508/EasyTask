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
public class AddUserUI extends JFrame{
    private JLabel fNameLabel;
    private JLabel mNameLabel;
    private JLabel Label;
    private JLabel headerLabel;
    private JButton saveButton;
    private JButton backButton;
    private JTextField uNameField;
    private JTextField pwField;
    private JPanel buttonPanel;
    private JPanel cellNumbers[];
    private JPanel infoPanel;
    private LoginCntl logCntl;
   
    
    public AddUserUI(LoginCntl newLogCntl){
        logCntl = newLogCntl;
        this.setVisible(true);
        initCustomComponents();
    }
    
    public void initCustomComponents(){
        this.setSize(700, 300);
        this.setTitle("Sign Up");
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
        
        cellNumbers = new JPanel[4];
            for (int i = 0; i < 4; i++) {
                JPanel nextPanel = new JPanel();
                cellNumbers[i] = nextPanel;
                infoPanel.add(nextPanel);
            }
            
        fNameLabel = new JLabel("UserName: ");
        mNameLabel = new JLabel("Password: ");
        
        
        uNameField = new JTextField(12);
            uNameField.setEditable(true);
        pwField = new JTextField(12);
            pwField.setEditable(true);
        
        cellNumbers[0].add(fNameLabel);
        cellNumbers[1].add(uNameField);
        cellNumbers[2].add(mNameLabel);
        cellNumbers[3].add(pwField);
        
        
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(infoPanel, BorderLayout.CENTER);
    }
    private char[] parsePW(String pass){
        char[] pw = new char[pwField.getText().length()];
    
        for(int i = 0; i < pwField.getText().length(); i++){
        pw[i] = pwField.getText().charAt(i);
        }
        return pw;
    }
    private void saveButtonActionPerformed(ActionEvent evt){
        boolean nah = false;
        for(int i = 0; i < AddUserUI.this.logCntl.getUserList().getTheListOfUsers().size(); i++){
            if(uNameField.getText() == AddUserUI.this.logCntl.getUserList().getTheListOfUsers().get(i).getUsername()){
                nah = true;
            } else {
                AddUserUI.this.logCntl.addNewUser(uNameField.getText(), parsePW(pwField.getText()));
                this.setVisible(false);
           }
        }
        if(nah == true){
            JOptionPane.showMessageDialog(null, "Please select a different UserName!");
        }
    }
    
    private void backButtonActionPerformed(ActionEvent evt){
        
        this.setVisible(false);
    }
}
