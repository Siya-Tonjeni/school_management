/**
 * EmployeeServiceTest.java
 * Test class for EmployeeService
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 16 June 2022
 */
package za.ac.cput.school_management.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.factory.EmployeeFactory;
import za.ac.cput.school_management.factory.NameFactory;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    private Employee emp, emp1;

    private EmployeeService service = EmployeeService.getService();

    @BeforeEach
    void setUp(){
        emp = EmployeeFactory.build("name@email.co.za",NameFactory.build("Sonwabile","", "Gxoyiya"));
        emp1 = EmployeeFactory.build("name1@cput.ac.za", NameFactory.build("Siyabulela", "", "Gxoyiya"));
        service.save(emp1);

    }

    @Test
    void save() {
        assertNotNull(service.save(emp));
        //service.save(emp1);
        System.out.println(service.getAll());
    }

    @Test
    void read() {
        Employee read = service.read(emp1.getStaffId());
        assertNotNull(read);
        System.out.println("Value: " + read);
    }

    @Test
    void delete() {
        service.delete(emp);
        System.out.println(service.getAll());
    }
}