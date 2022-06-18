package za.ac.cput.school_management.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.ContextConfiguration;
import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.factory.CountryFactory;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;



//@DataJpaTest
//@ContextConfiguration
//@TestComponent
@SpringBootConfiguration
@SpringBootTest
class CountryServiceTest {
    private Country country, country1, country2;

    @Autowired
    private CountryService countryService;

    CountryServiceTest(Country country1) {
        this.country1 = country1;
    }

    @BeforeEach
    void setUp(){
        country = CountryFactory.build("SA123456789", "South Africa");
        countryService.save(country);

    }

    @ParameterizedTest
   // @Test
    void save() {
        assertNotNull(countryService.save(country));
        System.out.println("Countries saved:"+ countryService.getAll());

    }

    @Test
    void read() {
        Optional<Country> read = countryService.read(country.getId());
        assertNotNull(read);
        System.out.println("Value :"+read);
    }

    @ParameterizedTest
    //@Test
    void delete() {
        countryService.delete(country);
        System.out.println("A country is deleted");
    }

    @Test
    void getAll() {
        System.out.println("Displaying all the countries");
        System.out.println(countryService.getAll());
    }
}