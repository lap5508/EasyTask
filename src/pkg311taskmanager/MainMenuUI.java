/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author lap5508
 */
public class MainMenuUI extends JFrame{
    
    private NavigationCntl theNavCntl;
    private JLabel menuLabel;
    private JScrollPane theScrollPane;
    private JPanel navigationPanel;
    private JPanel closePanel;
    private JButton taskButton;
    private JButton contactButton;
    private JButton alarmButton;
    private JButton closeButton;
    
    public MainMenuUI(NavigationCntl parentNavCntl){
        
        theNavCntl = parentNavCntl;
        createLabelPanel();
        createNavigationPanel();
        setBounds(0, 0, 650, 650);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    public void createLabelPanel(){
        menuLabel = new JLabel("Easy Task", JLabel.CENTER);
            menuLabel.setFont(new Font("Serif", Font.PLAIN, 48));
            add(menuLabel, BorderLayout.NORTH);
    }
    
    public void createNavigationPanel(){
        JPanel navigationPanel = new JPanel();
        
        JButton taskButton = new JButton("Task");
            taskButton.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(java.awt.event.ActionEvent evt){
                        taskButtonActionPerformed(evt);
                    }
                });
            
        JButton contactButton = new JButton("Contact");
            contactButton.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(java.awt.event.ActionEvent evt){
                        contactButtonActionPerformed(evt);
                    }
                });
            
        JButton alarmButton = new JButton("Alarm");
            alarmButton.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(java.awt.event.ActionEvent evt){
                        alarmButtonActionPerformed(evt);
                    }
                });
        JButton logOutButton = new JButton("Log out :(");
            logOutButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    logOutButtonPerformed(evt);
                }
            });
            
        navigationPanel.setLayout(new GridLayout(2, 1));
            navigationPanel.add(taskButton);
            navigationPanel.add(contactButton);
            navigationPanel.add(alarmButton);
            navigationPanel.add(logOutButton);
            add(navigationPanel, BorderLayout.CENTER);
    }
    
    private void taskButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        MainMenuUI.this.theNavCntl.requestTaskCntl();
    }
    
    private void contactButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        MainMenuUI.this.theNavCntl.requestContactCntl();
    }
    
    private void alarmButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        MainMenuUI.this.theNavCntl.requestNotificationCntl();
    }
    private void logOutButtonPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        MainMenuUI.this.theNavCntl.requestLoginCntl();
    }
}
