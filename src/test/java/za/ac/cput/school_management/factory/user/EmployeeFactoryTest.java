/**
 * EmployeeFactoryTest.java
 * Test class for EmployeeFactory.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 18 June 2022
 */
package za.ac.cput.school_management.factory.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.user.Employee;
import za.ac.cput.school_management.factory.user.EmployeeFactory;
import za.ac.cput.school_management.factory.user.NameFactory;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    @DisplayName("Test Creating the Employee Object.")
    public void testCreate(){
        Employee emp = EmployeeFactory.build("test-id","name@email.ac.za",
                NameFactory.build("Sonwabile","","Gxoyiya"));

        assertNotNull(emp);
        System.out.println(emp.toString());
    }


    @Test
    @DisplayName("Test Employee Object Identity.")
    public void testNotSame(){

        Employee emp1 = EmployeeFactory.build("test-id","email@gmail.com",
                NameFactory.build("Thando","Ace","Soma"));

        Employee emp2 = new Employee.Builder().copy(emp1).build();

        assertNotSame(emp1, emp2);

        System.out.println(emp1);
        System.out.println(emp2);
    }

    @Test
    @DisplayName("Test Employee Object Equality.")
    public void testIsEqual(){

        Employee emp1 = EmployeeFactory.build("test-id1","email@gmail.com",
                NameFactory.build("Thando","Ace","Soma"));

        Employee emp2 = new Employee.Builder().copy(emp1).build();

        assertEquals(emp1, emp2);

        System.out.println(emp1);
        System.out.println(emp2);
    }


    @Test
    @DisplayName("Test throws IllegalArgumentException if email is invalid.")
    public void testEmailException(){
        Exception exc = assertThrows(IllegalArgumentException.class, () -> EmployeeFactory.build("test-id","2322",
                NameFactory.build("Sonwabile","","Gxoyiya")));

        System.out.println("IllegalArgumentException: " + exc.getMessage());
    }

    @Test
    @DisplayName("Test throws IllegalArgumentException if FirstName is empty.")
    public void testFirstNameException(){
        Exception exc = assertThrows(IllegalArgumentException.class, () -> EmployeeFactory.build("test-id","name@email.com",
                NameFactory.build("","","Gxoyiya")));

        System.out.println("IllegalArgumentException: " + exc.getMessage());
    }

    @Test
    @DisplayName("Test throws IllegalArgumentException if LastName is empty.")
    public void testLastNameException(){
        Exception exc = assertThrows(IllegalArgumentException.class, () -> EmployeeFactory.build("test-id","name@email.com",
                NameFactory.build("Sonwabile","","")));

        System.out.println("IllegalArgumentException: " + exc.getMessage());
    }
}