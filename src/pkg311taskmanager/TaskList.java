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
public class TaskList {
    private ArrayList<Task> theListOfTasks = null;
    
    public void buildTestTaskList(){
            theListOfTasks = new ArrayList<Task>();
            for (int i = 0; i < 100; i++){
            String taskTitle = "Task Title "+i;
            String taskDescription = "Description"+i;
            String taskCategory = "Work";
            long startTime = 0;
            long endTime = 0;
            boolean enabled = false;
            Task newTask = new Task(taskTitle, taskDescription, taskCategory, startTime, endTime, enabled);
            theListOfTasks.add(newTask);
        }
       
       
    }
}
