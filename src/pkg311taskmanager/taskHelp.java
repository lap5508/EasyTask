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
public class taskHelp extends JFrame{
    
    private TaskCntl t_control;
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
    
    public taskHelp(TaskCntl newT_control){
        t_control = newT_control;
        setBounds(0, 0, 600, 370);
        panel = new JPanel();
        
        FlowLayout flow = new FlowLayout();
        panel.setLayout(flow);
        
        line1 = new JLabel("*****************************************************************");
        line2 = new JLabel("*****************************************************************");
        line3 = new JLabel("*****************************************************************");
        line4 = new JLabel("*****************************************************************");
        
        header = new JLabel("Task Instuctions");
        header.setFont(new Font("Arial", Font.PLAIN,35));
        
        searchInstructions = new JLabel("<html>Search:     To search a task add your search criteria to the area <br> labeled Search Task List and press the button labeled filter.<html>");
        searchInstructions.setFont(new Font("Arial", Font.PLAIN,16));
        
        addInstructions = new JLabel("<html>Add:     To add a task click the add task button and enter the new task information <br> in the new window. When all of your information is entered press the save button to <br> save it to your task list.<html>");
        addInstructions.setFont(new Font("Arial", Font.PLAIN,16));
        
        editInstructions = new JLabel("<html>Edit:     To edit a task select the desired task and press the edit task button. In the new <br> window you may change any information and press save to save the changes.<html>");
        editInstructions.setFont(new Font("Arial", Font.PLAIN,16));
        
        deleteInstructions = new JLabel("<html>Delete:     To delete a task select the desired task and press the delete <br> button. The selected task will be removed from your list of tasks.<html>");
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
