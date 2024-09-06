package com.mycompany.assignment_q2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    @Test
    public void testDisplayManagerInfo() {
       
        Manager manager = new Manager("John Doe", 101, "IT");


        assertEquals("John Doe", manager.getName(), "Manager name should be John Doe");
        assertEquals(101, manager.getEmployeeID(), "Manager ID should be 101");
        
    }
}
