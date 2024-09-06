/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment_q2;
import java.util.*;
/**
 *
 * @author RC_Student_lab
 */
public class Assignment_Q2 {

    public static void main(String[] args) {
        
         // ArrayList to hold employees and tasks
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Loop to show menu and perform actions
        int choice;
       
        do {
            
             //prompting the user to enter the option they want .
            
             System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            System.out.println("1. Add Employee");
            System.out.println("2. Add Manager");
            System.out.println("3. Assign Task");
            System.out.println("4. Display All Employees");
            System.out.println("5. Display All Tasks");
            System.out.println("0. Exit");
           
            switch (choice) {
                case 1:
                    // Add Employee
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Employee ID: ");
                    int empID = scanner.nextInt();
                    employees.add(new Employee(name, empID));
                    System.out.println("Employee added.");
                    break;
                case 2:
                    // Add Manager
                    System.out.print("Enter Manager Name: ");
                    String managerName = scanner.next();
                    System.out.print("Enter Manager ID: ");
                    int managerID = scanner.nextInt();
                    System.out.print("Enter Department: ");
                    String department = scanner.next();
                    employees.add(new Manager(managerName, managerID, department));
                    System.out.println("Manager added.");
                    break;
                case 3:
                    // Assign Task
                    System.out.print("Enter Task Description: ");
                    String taskDescription = scanner.next();
                    System.out.print("Enter Task ID: ");
                    int taskID = scanner.nextInt();
                    tasks.add(new Task(taskDescription, taskID));
                    System.out.println("Task assigned.");
                    break;
                case 4:
                    // Display all employees
                    for (Employee emp : employees) {
                        emp.displayEmployeeInfo();
                        if (emp instanceof Manager) {
                            ((Manager) emp).displayManagerInfo(); // Cast to Manager if applicable
                        }
                        System.out.println("-----------------");
                    }
                    break;
                case 5:
                    // Display all tasks
                    for (Task task : tasks) {
                        task.displayTaskInfo();
                        System.out.println("-----------------");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
    }

