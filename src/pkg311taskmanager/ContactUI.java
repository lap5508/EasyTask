/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Kyle
 */
public class ContactUI extends JFrame{
    
    private ContactController c_control = null;
    private JLabel contactLabel;
    private JTextArea contactArea;
    private JScrollPane scrollPane;
    private final int AREA_ROWS = 10;
    private final int AREA_COLS = 50;
    private JPanel listPanel;
    private JPanel navigationPanel;
    private JPanel optionsPanel;
    private JButton menuButton;
    private JButton calendarButton;
    private JButton taskButton;
    private JButton notificationButton;
    private JButton addContact;
    private JButton helpButton;
    
public ContactUI(ContactController newc_control){    
    
    c_control = newc_control;
    createLabelPanel();
    createListPanel();
    createNavigationPanel();
    createOptionsPanel();
    setBounds(0, 0, 1151, 941);
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
}
public void createLabelPanel(){
    contactLabel = new JLabel("Contact List", JLabel.CENTER);
    contactLabel.setFont(new Font("Serif", Font.PLAIN, 48));
    add(contactLabel, BorderLayout.NORTH);
}
public void createListPanel(){
    JPanel listPanel = new JPanel();
    JTextArea contactArea = new JTextArea();
    contactArea.setColumns(50);
    contactArea.setRows(50);
    contactArea.setText("Contacts go here" + "\n" + "maybe");
    contactArea.setEditable(false);
    
    //listPanel.add(contactArea);
    JScrollPane scrollPane = new JScrollPane(contactArea);
    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    listPanel.add(scrollPane);
    add(listPanel, BorderLayout.CENTER);
}
public void createNavigationPanel(){
    JPanel navPanel = new JPanel();
    JButton menuButton = new JButton("Menu");
    JButton calendarButton = new JButton("Calendar");
    JButton taskButton = new JButton("Task");
    JButton notificationButton = new JButton("Notification");
    navPanel.setLayout(new GridLayout(1, 3));
    navPanel.add(menuButton);
    navPanel.add(calendarButton);
    navPanel.add(taskButton);
    navPanel.add(notificationButton);
    add(navPanel, BorderLayout.SOUTH);
}
public void createOptionsPanel(){
    JPanel optionsPanel = new JPanel();
    JButton addContact = new JButton("Add Contact");
    JButton helpButton = new JButton("Help");
    optionsPanel.setLayout(new GridLayout(2,1));
    optionsPanel.add(addContact);
    optionsPanel.add(helpButton);
    add(optionsPanel, BorderLayout.EAST);
}
}
