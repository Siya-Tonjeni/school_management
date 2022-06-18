/**
 * EmployeeServiceTest.java
 * Test class for EmployeeService.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 18 June 2022
 */
package za.ac.cput.school_management.service.user;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.user.Employee;
import za.ac.cput.school_management.factory.user.EmployeeFactory;
import za.ac.cput.school_management.factory.user.NameFactory;
import za.ac.cput.school_management.service.impl.user.EmployeeService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeServiceTest {

    private Employee emp = EmployeeFactory.build("test-id","name@email.co.za",NameFactory.build("Sonwabile","", "Gxoyiya"));
    private Employee emp1 = EmployeeFactory.build("test-id1","name1@cput.ac.za", NameFactory.build("Siyabulela", "", "Gxoyiya"));
    @Autowired private EmployeeService service ;



    @Test
    @Order(1)
    void save() {
        Employee save = service.save(emp);
        service.save(emp1);
        assertNotNull(save);
        //service.save(emp1);
        System.out.println("[Save Result]: \t\t" + service.getAll());
    }

    @Test
    @Order(2)
    void read() {
        Optional<Employee> read = service.read(emp1.getStaffId());
        assertNotNull(read);
        System.out.println("[Read Value]: \t\t" + read);
    }

    @Test
    @Order(5)
    void delete() {
        service.delete(emp);
        service.delete(emp1);
        System.out.println("[Delete Result]: \t" + service.getAll());
    }

    @Test
    @Order(3)
    void getAll(){
        assertNotNull(service.getAll());
        System.out.println("[Get all]: \t\t\t" + service.getAll());
    }

    @Test
    @Order(4)
    void getEmployeeNameByEmail(){
        //service.save(emp);
        List<Employee> get = service.getEmployeeNameByEmail("name1@cput.ac.za");
        assertNotNull(get);
        System.out.println("[getEmployeeNameByEmail() Value]: \t" + get);
    }
}