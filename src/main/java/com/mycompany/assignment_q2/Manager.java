/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_q2;

/**
 *
 * @author RC_Student_lab
 */
public class Manager extends Employee {
        private String department;
    
    // Constructor to initialize manager, also calling the superclass (Employee) constructor
    public Manager(String name, int employeeID, String department) {
        super(name, employeeID); // Calls Employee constructor
        this.department = department;
    }
    
    // Method to display manager details
    public void displayManagerInfo() {
        displayEmployeeInfo(); // Call method from Employee class
        System.out.println("Department: " + department);
    }

}
