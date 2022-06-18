package za.ac.cput.school_management.controller.user;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.school_management.domain.user.Student;
import za.ac.cput.school_management.factory.user.StudentFactory;
import za.ac.cput.school_management.factory.user.NameFactory;


import static org.junit.jupiter.api.Assertions.*;
    @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)

    class StudentControllerTest {

        @LocalServerPort
        private int port;

        @Autowired
        private TestRestTemplate restTemplate;
        private za.ac.cput.school_management.domain.user.Student Student;
        private String baseUrl;
        private za.ac.cput.school_management.domain.user.Student student;

        @BeforeEach
        void setUp() {
            this.student = StudentFactory.build("dpengmarais99@gmail.com",
                    NameFactory.build("hlombe", "hlombe", "mbelu"));
            String baseUrl = "http://localhost:" + this.port + "/school-management/student/";

        }

        @Test
        @Order(1)
        void save() {
            String url = baseUrl + "save";
            System.out.println(url);
            ResponseEntity<Student> response = this.restTemplate.postForEntity(url, this.student, Student.class);
            System.out.println(response);
            assertAll(
                    () -> assertEquals(HttpStatus.OK, response.getStatusCode()), () -> assertNotNull(response.getBody())
            );
        }
    }