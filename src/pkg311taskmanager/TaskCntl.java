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
    private MainMenuUIv2 theMainMenuUI = null;
    private AddTaskUI theAddTaskUI = null;
    
    public TaskCntl(NavigationCntl parentNavCntl){
        System.out.println("MADE IT TO TaskCNTL"); //test line
        theNavigationCntl = parentNavCntl;
        theTaskList = new TaskList();
        theTaskUI = new TaskUIv2(this);
        theTaskUI.setVisible(true);
        
    }
    
    public void requestAddTaskUI(){
        theAddTaskUI = new AddTaskUI(this);
        theAddTaskUI.setVisible(true);
    }
    
    

    /*
    public void getRatingUI(){
        theMediaUI.setVisible(false);
        theMediaUI.dispose();
        theRatingUI = new RatingUI(this);
        theRatingUI.setVisible(true);
    }*/
    
    public void getTaskUIv2(){
        theTaskUI.setVisible(false);
        theTaskUI.dispose();
        theTaskUI.setLocationRelativeTo(null);
        theTaskUI.setVisible(true);                
    }
    
    public void requestNavigationCntl(){ 
        theTaskUI.setVisible(false);
        theNavigationCntl.getNavigationCntl();
    }
    
    
}