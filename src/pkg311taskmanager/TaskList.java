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
public class TaskList implements Serializable{
    private ArrayList<Task> theListOfTasks = null;
    
    public TaskList (){
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
            Task newTask = new Task(taskTitle, taskDate, taskTime, taskLocation, taskDescription);
            theListOfTasks.add(newTask);
        }
        System.out.println(theListOfTasks);
    }
    
    public ArrayList<Task> getListOfTasks() {
        if(theListOfTasks == null){
            theListOfTasks = new ArrayList<Task>();
        }
        return theListOfTasks;
    }
 
}
