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
    private ArrayList<Task> theListOfTasks = new ArrayList();
    
//    public TaskList(ArrayList<Task> listofTasks){
//        theListOfTasks = listofTasks;
//    }
//    public void buildTestTaskList(){
//            setTheListOfTasks(new ArrayList<Task>());
//            for (int i = 0; i < 5; i++){
//            String taskTitle = "Task Title "+i;
//            String taskDescription = "Description"+i;
//            String taskCategory = "Work";
//            long startTime = 0;
//            long endTime = 0;
//            boolean enabled = false;
//            Task newTask = new Task(taskTitle, taskDescription, taskCategory, startTime, endTime, enabled);
//            getTheListOfTasks().add(newTask);
//        }
//       
//       
//    }

    /**
     * @return the theListOfTasks
     */
    public ArrayList<Task> getListOfTasks() {
        if (theListOfTasks == null){
            theListOfTasks = new ArrayList<Task>();
        }
        return theListOfTasks;
    }

    /**
     * @param theListOfTasks the theListOfTasks to set
     */
    public void setTheListOfTasks(Task newTask) {
        if (theListOfTasks == null){
            theListOfTasks = new ArrayList<Task>();
        }
        theListOfTasks.add(newTask);
    }
}
