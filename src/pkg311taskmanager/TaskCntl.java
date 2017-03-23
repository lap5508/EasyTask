/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

/**
 *
 * @author Luke
 */
public class TaskCntl {
    private NavigationCntl theNavigationCntl = null;
    private TaskUIv2 theTaskUI = null;
    private TaskList theTaskList = null;
    
    public TaskCntl(NavigationCntl parentNavCntl){
        System.out.println("MADE IT TO TaskCNTL"); //test line
        theNavigationCntl = parentNavCntl;
        theTaskList = new TaskList();
        theTaskUI = new TaskUIv2();
        theTaskUI.setVisible(true);
        
    }
    
    public void getTaskUIv2(){
        theTaskUI.setVisible(false);
        theTaskUI.dispose();
        theTaskUI.setLocationRelativeTo(null);
        theTaskUI.setVisible(true);                
    }
    
    public void requestNavigationCntl(){ 
        theNavigationCntl.getNavigationCntl();
    }
}
