/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg311taskmanager;

import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author Luke
 */
public class TaskListModel implements Serializable{
    private ArrayList<TaskModel> theListOfTasks = null;
    
    public TaskListModel (){
        if(theListOfTasks == null){
            //buildTestTaskList();
        }
    }

    public void buildTestTaskList(){
        theListOfTasks = new ArrayList();
        for(int i = 0; i < 5; i++){
            String taskTitle = "Task " +i;
            String taskDate = "10/12/17";
            String taskTime = "3:00";
            String taskLocation = "IST" + i;
            String taskDescription = "" + i;
            TaskModel newTask = new TaskModel(taskTitle, taskDate, taskTime, taskLocation, taskDescription);
            theListOfTasks.add(newTask);
        }
        System.out.println(theListOfTasks);
    }
    
    public ArrayList<TaskModel> getListOfTasks() {
        if(theListOfTasks == null){
            theListOfTasks = new ArrayList<TaskModel>();
        }
        return theListOfTasks;
    }
 
}
