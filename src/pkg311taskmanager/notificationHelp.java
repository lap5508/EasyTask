/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author rober_000
 */
public class notificationHelp extends JFrame{
      
    private NotificationController n_control;
    private JPanel panel;
    private JLabel searchInstructions;
    private JLabel addInstructions;
    private JLabel editInstructions;
    private JLabel deleteInstructions;
    private JLabel header;
    private JLabel line1;
    private JLabel line2;
    private JLabel line3;
    private JLabel line4;
    
    public notificationHelp(NotificationController newN_control){
        n_control = newN_control;
        setBounds(0, 0, 600, 380);
        panel = new JPanel();
        
        FlowLayout flow = new FlowLayout();
        panel.setLayout(flow);
        
        line1 = new JLabel("*****************************************************************");
        line2 = new JLabel("*****************************************************************");
        line3 = new JLabel("*****************************************************************");
        line4 = new JLabel("*****************************************************************");
        
        header = new JLabel("Notification Instuctions");
        header.setFont(new Font("Arial", Font.PLAIN,30));
        
        searchInstructions = new JLabel("<html>Search:     To search a notification add your search criteria to the area <br> labeled Search Notifications and press the button labeled filter.<html>");
        searchInstructions.setFont(new Font("Arial", Font.PLAIN,16));
        
        addInstructions = new JLabel("<html>Add:     To add a notification click the add notification button and enter the new <br> notification information in the new window. When all of your information is <br> entered press the save button to save it to your notification list.<html>");
        addInstructions.setFont(new Font("Arial", Font.PLAIN,16));
        
        editInstructions = new JLabel("<html>Edit:     To edit a notification select the desired notification and press the edit <br> notification button. In the new window you may change any information and press <br> save to save the changes.<html>");
        editInstructions.setFont(new Font("Arial", Font.PLAIN,16));
        
        deleteInstructions = new JLabel("<html>Delete:     To delete a notification select the desired notification and press the delete <br> button. The selected notification will be removed from your list of notifications.<html>");
        deleteInstructions.setFont(new Font("Arial", Font.PLAIN,16));
        

        panel.add(header);
        panel.add(line1);
        panel.add(searchInstructions);
        panel.add(line2);
        panel.add(addInstructions);
        panel.add(line3);
        panel.add(editInstructions);
        panel.add(line4);
        panel.add(deleteInstructions);
        
        add(panel);
        
        this.setVisible(true);
    }
     
}
