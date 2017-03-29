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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author rober_000
 */
public class NotificationUI extends JFrame{
    
    private JPanel titlePanel;
    private JLabel title;
    private JPanel scrollPanel;
    private JScrollPane notifications;
    private JPanel buttonsPanel;
    private JButton mainMenuButton;
    private JButton addNotificationButton;
    private JButton deleteNotificationButton;
    private NotificationController n_control = null;
    
    
    public NotificationUI(NotificationController newn_control)
    {
        n_control = newn_control;
        createUI();
        setBounds(0, 0, 600, 500);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    public void createUI()
    {
        
        JPanel titlePanel = new JPanel();
        JLabel title = new JLabel("Notification Menu");
        title.setFont(new Font("Arial", Font.PLAIN,60));
        
        titlePanel.add(title);
        
        JPanel scrollPanel = new JPanel();
        JScrollPane notifications = new JScrollPane();
        notifications.setPreferredSize(new Dimension(450, 300));
        notifications.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPanel.add(notifications);
        
        JPanel buttonsPanel = new JPanel();
        JButton mainMenuButton = new JButton("Main Menu");
        JButton addNotificationButton = new JButton("Add Notifiaction");
        addNotificationButton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    addNotificationButtonActionPerformed(evt);
                }
            });
        
        
        
        JButton deleteNotificationButton = new JButton("Delete Notifiaction");
        
        buttonsPanel.setLayout(new GridLayout(1,1));
        buttonsPanel.add(mainMenuButton);
        buttonsPanel.add(addNotificationButton);
        buttonsPanel.add(deleteNotificationButton);
        
        add(titlePanel, BorderLayout.NORTH);
        add(scrollPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
        
    }
    
    
    private void addNotificationButtonActionPerformed(java.awt.event.ActionEvent evt){
        n_control.getAddNotificationUI();
    }
    
    
}
