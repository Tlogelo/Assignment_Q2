
package com.mycompany.assignment_q2;

/**
 *
 * @author RC_Student_lab
 */
public class Employee {
        // Fields (private to hide information)
    private String name;
    private int employeeID;
    
    // Constructor to initialize employee
    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }
    
    // Getter methods to access employee details (encapsulation)
    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }
    
    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + name);
    }
}
