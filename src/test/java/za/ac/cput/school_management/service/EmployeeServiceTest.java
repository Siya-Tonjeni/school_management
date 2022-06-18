/**
 * EmployeeServiceTest.java
 * Test class for EmployeeService
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 16 June 2022
 */
package za.ac.cput.school_management.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.factory.EmployeeFactory;
import za.ac.cput.school_management.factory.NameFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeeServiceTest {

    private Employee emp, emp1;

    @Autowired private EmployeeService service ;

    @BeforeEach
    void setUp(){
        emp = EmployeeFactory.build("name@email.co.za",NameFactory.build("Sonwabile","", "Gxoyiya"));
        //Name.NameId nameId = NameFactory.build(e);
        emp1 = EmployeeFactory.build("name1@cput.ac.za", NameFactory.build("Siyabulela", "", "Gxoyiya"));
        service.save(emp1);

    }

    @Test
    void save() {
        assertNotNull(service.save(emp));
        //service.save(emp1);
        System.out.println("Save Result: " + service.getAll());
    }

    @Test
    void read() {
        Optional<Employee> read = service.read(emp1.getStaffId());
        assertNotNull(read);
        System.out.println("Value: " + read);
    }

    @Test
    void delete() {
        service.delete(emp);
        System.out.println("Delete Result: " + service.getAll());
    }

    @Test
    void getEmployeeNameByEmail(){
        service.save(emp);
        List<Employee> get = service.getEmployeeNameByEmail("name1@cput.ac.za");
        assertNotNull(get);
        System.out.println("Value: " + get);
    }
}