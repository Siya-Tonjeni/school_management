package za.ac.cput.school_management.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.factory.CountryFactory;

import static org.junit.jupiter.api.Assertions.*;

class CountryControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private EmployeeController controller;

    @Autowired
    private TestRestTemplate restTemplate;

    private Country country = country = CountryFactory.build("ZIM23455","Zimbabwe");

    private String baseUrl = "http://localhost:" + this.port + "/school-management/country/";

    @BeforeEach
    void setUp() {
        assertNotNull(controller);

    }

    @Test
    void a_save() {
        String saveUrl = baseUrl + "save";
        ResponseEntity<Country> response = this.restTemplate.postForEntity(saveUrl, this.country,Country.class);
        assertNotNull(response.getBody());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    void b_read() {
        String readUrl = baseUrl + "read/" + this.country.getId();
        ResponseEntity<Country> response = this.restTemplate.getForEntity(readUrl, Country.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    void d_delete() {
        String deleteUrl = baseUrl + "delete/" + this.country.getId();
        this.restTemplate.delete(deleteUrl);
    }

    @Test
    void c_getAll() {
        String getAllUrl = baseUrl + "all";
        ResponseEntity<Country[]> response = this.restTemplate.getForEntity(getAllUrl, Country[].class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}