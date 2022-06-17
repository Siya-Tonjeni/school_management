package za.ac.cput.school_management.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.factory.CountryFactory;

import static org.junit.jupiter.api.Assertions.*;

class CountryRepositoryTest {
    private Country country;
    private  CountryRepository repository;

    @BeforeEach void setUp(){
        this.country = CountryFactory.build("SA123456789","South Africa");
        this.repository = CountryRepository.getRepository();
    }

    @AfterEach void teaDown(){
        this.repository.delete(this.country);
    }
    @Test
    void save() {
        Country saved = this.repository.save(this.country);
        assertNotNull(saved);
        assertSame(this.country,saved);
    }

    @Test
    void read() {
    }

    @Test
    void delete() {
    }

    @Test
    void getAll() {
    }
}