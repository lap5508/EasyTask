/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.util.ArrayList;

/**
 *
 * @author Luke
 */
public class TaskCntl {
    private NavigationCntl theNavigationCntl = null;
    private TaskUIv2 theTaskUI = null;
    private TaskUIv2 newTaskUI = null;
    private TaskList theTaskList = null;
    private MainMenuUIv2 theMainMenuUI = null;
    private AddTaskUI theAddTaskUI = null;
    private ArrayList<Task> theListOfTasks;
    private Task tempTask;
    private int tempIndex = 0;
    
    public TaskCntl(NavigationCntl parentNavCntl){
        System.out.println("MADE IT TO TaskCNTL"); //test line
        theNavigationCntl = parentNavCntl;
        theTaskList = new TaskList();
        theTaskUI = new TaskUIv2(this);
        theTaskUI.setVisible(true);
        newTaskUI = new TaskUIv2(this);
        
    }
    
    public void requestAddTaskUI(){
        theAddTaskUI = new AddTaskUI(this);
        theTaskUI.setVisible(false);
        theAddTaskUI.setVisible(true);
    }
    public void returnTaskUI(){
        theAddTaskUI.dispose();
        theTaskUI.dispose();
        newTaskUI = new TaskUIv2(this);
        newTaskUI.setVisible(false);
    }
    
    public ArrayList<Task> getTheListOfTasks() {
        return theListOfTasks;
    }
    
    /*
    public String returnListOfComments(){
        String theComment = "";
        //SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getMediaList().getListOfMedia()
        ArrayList<Rating> list = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getMediaList().getListOfMedia().get(tempIndex).getTheListOfRatings();
        
        theComment="<html>";
        for(int i=0; i < list.size(); i++){
            
            if(list.get(i).getComment().isEmpty()){
                System.out.println("comment is null");
            }else{
                theComment = theComment.concat("\"" + list.get(i).getComment() + "\""+
                        "  -"+list.get(i).getUsername()+ "<br>");
            }
            
        }
        theComment.concat("</html>");
        return theComment;
        
    }
    */
    
    public String returnListOfTitles(){
        String theTitle = "";
        ArrayList<Task> list = theTaskList.getListOfTasks();
        System.out.println("Got to list of tasks");
        for(int i=0; i < list.size(); i++){
            
            if(list.get(i).getTitle().isEmpty()){
                System.out.println("comment is null");
            }else{
                theTitle = theTitle.concat("\"" + list.get(i).getTitle() + "\""+ "<br>");
            }
            
        }
        return theTitle;
    }
    
    public String computeListOfTasks(){
        String taskOutput = "";
        ArrayList<Task> list = theTaskList.getListOfTasks();
        System.out.println(list);
        
        for(int i=0; i < list.size(); i++){
            if(i==0){
                taskOutput = taskOutput.concat(list.get(i).getTitle());
            }
            else{
                taskOutput = taskOutput.concat("," + list.get(i).getTitle());
            }
        }
        return taskOutput;
    }
    
    public void returnNewTaskUI(){
        theTaskUI.dispose();
        newTaskUI.setVisible(true);
    }
    /*public String computeListOfRatings(){
        String ratingOutput = "";
        ArrayList<Rating> list = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getMediaList().getListOfMedia().get(tempIndex).getTheListOfRatings();
        
        for(int i=0; i < list.size(); i++){
            if(i==0){
                ratingOutput = ratingOutput.concat(list.get(i).getRating());
            }
            else{
                ratingOutput = ratingOutput.concat(", " + list.get(i).getRating());
            }
            

        }
        return ratingOutput;
        
    }*/

    /**
     * @param theListOfTasks the theListOfTasks to set
     */
    public void setTheListOfTasks(Task newTask) {
        tempTask = newTask;
        theListOfTasks.add(tempTask);
        System.out.print(theListOfTasks);
    }
    
    public void addNewTask(Task newTask){
        //Task newTask = new Task(newTitle, newDescription, newCategory, newStartTime, newEndTime, newEnabled);
        //TaskList theTaskList = new TaskList();
        tempTask = theTaskList.getListOfTasks().get(tempIndex);
        theTaskList.getListOfTasks().add(tempTask);
        System.out.print(theTaskList.getListOfTasks());
        
    }
    /*
    public void addNewRating(Rating newRating){
        tempSong = SerializedDataCntl.getSerializedDataCntl().getSerializedDataModel().getMediaList().getListOfMedia().get(tempIndex);
        tempSong.addRating(newRating);
    }
    */
    
    

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
