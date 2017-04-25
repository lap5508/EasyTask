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
public class contactHelp extends JFrame{
    
    private ContactController c_control;
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
    
    public contactHelp(ContactController newC_control){
        c_control = newC_control;
        setBounds(0, 0, 610, 370);
        panel = new JPanel();
        
        FlowLayout flow = new FlowLayout();
        panel.setLayout(flow);
        
        line1 = new JLabel("*****************************************************************");
        line2 = new JLabel("*****************************************************************");
        line3 = new JLabel("*****************************************************************");
        line4 = new JLabel("*****************************************************************");
        
        header = new JLabel("Contact Instuctions");
        header.setFont(new Font("Arial", Font.PLAIN,35));
        
        searchInstructions = new JLabel("<html>Search:     To search a contact add your search criteria to the area <br> labeled Search contacts and press the button labeled filter.<html>");
        searchInstructions.setFont(new Font("Arial", Font.PLAIN,16));
        
        addInstructions = new JLabel("<html>Add:     To add a contact click the add contact button and enter the new contact <br> information in the new window. When all of your information is entered press the save <br> button to save it to your contact list.<html>");
        addInstructions.setFont(new Font("Arial", Font.PLAIN,16));
        
        editInstructions = new JLabel("<html>Edit:     To edit a contact select the desired contact and press the edit contact button. In <br> the new window you may change any information and press save to save the changes.<html>");
        editInstructions.setFont(new Font("Arial", Font.PLAIN,16));
        
        deleteInstructions = new JLabel("<html>Delete:     To delete a contact select the desired contact and press the delete <br> button. The selected contact will be removed from your list of contacts.<html>");
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
