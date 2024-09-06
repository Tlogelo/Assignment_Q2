
package com.mycompany.assignment_q2;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
       private String taskDescription;
    private int taskID;
    
    // Constructor to initialize task
    public Task(String taskDescription, int taskID) {
        this.taskDescription = taskDescription;
        this.taskID = taskID;
    }
    
    // Method to display task details
    public void displayTaskInfo() {
        System.out.println("Task ID: " + taskID);
        System.out.println("Task Description: " + taskDescription);
    }
}
