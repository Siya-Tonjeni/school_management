/**
 * EmployeeControllerTest.java
 * Test class for EmployeeController.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 18 June 2022
 */
package za.ac.cput.school_management.controller.user;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.school_management.domain.user.Employee;
import za.ac.cput.school_management.factory.user.EmployeeFactory;
import za.ac.cput.school_management.factory.user.NameFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private EmployeeController controller;

    @Autowired
    private TestRestTemplate restTemplate;

    private Employee employee = employee = EmployeeFactory.build("test-id","test@cput.ac.za", NameFactory.build("Sonwabile", "middle", "Gxoyiya"));

    private String baseUrl = "http://localhost:" + this.port + "/school-management/employee/";

    @BeforeEach
    void setUp() {
        assertNotNull(controller);

    }

    @Test
    @Order(1)
    void save() {
        String saveUrl = baseUrl + "save";
        ResponseEntity<Employee> response = this.restTemplate.postForEntity(saveUrl, this.employee,Employee.class);
        assertNotNull(response.getBody());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    @Order(2)
    void read() {
        String readUrl = baseUrl + "read/" + this.employee.getStaffId();
        ResponseEntity<Employee> response = this.restTemplate.getForEntity(readUrl, Employee.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    @Order(4)
    void delete() {
        String deleteUrl = baseUrl + "delete/" + this.employee.getStaffId();
        this.restTemplate.delete(deleteUrl);
    }

    @Test
    @Order(3)
    void getAll() {
        String getAllUrl = baseUrl + "all";
        ResponseEntity<Employee[]> response = this.restTemplate.getForEntity(getAllUrl, Employee[].class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}