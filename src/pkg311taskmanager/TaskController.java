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
public class TaskController {
    private NavigationController theNavigationCntl = null;
    private TaskUI theTaskUI = null;
    private TaskListModel theTaskList = null;
    private AddTaskUI theAddTaskUI = null;
    private ArrayList<TaskModel> theListOfTasks;
    private TaskModel tempTask;
    private int tempIndex = 0;
    private TaskTableModel taskTableModel = null;
    private TaskHelpUI theTaskHelpUI = null;
    
    public TaskController(NavigationController parentNavCntl){
        System.out.println("MADE IT TO TaskCNTL"); //test line
        theNavigationCntl = parentNavCntl;
        theTaskList = new TaskListModel();
        taskTableModel = new TaskTableModel(SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getTaskList().getListOfTasks());
        theTaskUI = new TaskUI(this);
        theTaskUI.setLocationRelativeTo(null);
        theTaskUI.setVisible(true);
        
    }
    
    public void getTaskHelpWindow(){
        theTaskHelpUI = new TaskHelpUI(this);
        theTaskHelpUI.setLocationRelativeTo(null);
    }
    
    public TaskListModel getTaskList(){
        return theTaskList;
    }
    
    public TaskTableModel getTaskTableModel(){
        return taskTableModel;
    }
    
 
    public void returnTaskUI(){
        theAddTaskUI.setVisible(false);
        theAddTaskUI.dispose();
        theTaskUI.setVisible(true);
    }
    
    public ArrayList<TaskModel> getTheListOfTasks() {
        return theListOfTasks;
    }
    
    public void requestContactCntl(){
        theTaskUI.setVisible(false);
        theNavigationCntl.requestContactCntl();
    }
    
    public void requestNotificationCntl(){
        theTaskUI.setVisible(false);
        theNavigationCntl.requestNotificationCntl();
    }
    
    public void keepTaskUI(){
        theTaskUI.setVisible(false);
        theTaskUI.dispose();
        theTaskUI = new TaskUI(this);
        theTaskUI.setLocationRelativeTo(null);
        theTaskUI.setVisible(true);
    }
    
    public void getAddTaskUINoInfo(){
        theAddTaskUI = new AddTaskUI(this);
    }
    
    public void getAddTaskUI(int taskRowToGet){
        theTaskUI.setVisible(false);
        theAddTaskUI = new AddTaskUI(this, taskRowToGet);
    }
    
    public String returnListOfTitles(){
        String theTitle = "";
        ArrayList<TaskModel> list = theTaskList.getListOfTasks();
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
    
    public void addNewTask(String newTitle, String newDate, String newTime, String newLocation, String newDescription){
        TaskModel newTask = new TaskModel(newTitle, newDate, newTime, newLocation, newDescription);
        SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getTaskList().getListOfTasks().add(newTask);
    }
    
    public void editTaskInfo(int index, String newTitle, String newDate, String newTime, String newLocation, String newDescription){
        tempTask = SerializedDataController.getSerializedDataCntl().getSerializedDataModel().getTaskList().getListOfTasks().get(index);
        tempTask.changeInfo(newTitle, newDate, newTime, newLocation, newDescription);
    }
    
    public String computeListOfTasks(){
        String taskOutput = "";
        ArrayList<TaskModel> list = theTaskList.getListOfTasks();
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
        //newTaskUI.setVisible(true);
    }
    

    
    public void setTheListOfTasks(TaskModel newTask) {
        tempTask = newTask;
        theListOfTasks.add(tempTask);
        System.out.print(theListOfTasks);
    }
    
    public void addNewTask(TaskModel newTask){
        //Task newTask = new Task(newTitle, newDescription, newCategory, newStartTime, newEndTime, newEnabled);
        //TaskList theTaskList = new TaskList();
        tempTask = theTaskList.getListOfTasks().get(tempIndex);
        theTaskList.getListOfTasks().add(tempTask);
        System.out.print(theTaskList.getListOfTasks());
        
    }
    
    
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

    //void addNewTask(String text, String text0, String text1, String text2, String text3) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    
}
