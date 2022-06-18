package za.ac.cput.school_management.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.factory.CountryFactory;

import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CountryRepositoryTest {

    private Country country, country1, country2;

    private CountryRepository repository;

    @BeforeEach void setUp(){
        this.country = CountryFactory.build("SA123456789","South Africa");
        this.country1 = CountryFactory.build("KY987654321","Kenya");
        this.country2 = CountryFactory.build("ZIM123456789","Zimbabwe");
        this.repository = CountryRepository.getRepository();
    }

    @Test
    void a_save() {
        Country saved = this.repository.save(this.country);
        Country saved1 = this.repository.save(this.country1);
        Country saved2 = this.repository.save(this.country2);
        assertNotNull(saved);
        assertSame(this.country,saved);

    }

    @Test
    void b_read() {
        Country saved=repository.save(country);
        Optional<Country>read = repository.read(saved.getId());
        assertAll(
                ()->assertTrue(read.isPresent()),
                ()->assertSame(saved,read.get())
        );
        System.out.println("read"+'\n'+read.get());
    }

    @Test
    void d_delete() {
        Country saved = repository.save(country);
        List<Country> countryDB = repository.getAll();
        assertEquals(3,countryDB.size());
        repository.delete(saved);
        System.out.println("SA country is deleted");
        System.out.println("Displaying all countries in the database"+'\n'+countryDB);
        countryDB= repository.getAll();
        assertEquals(2,countryDB.size());
    }


    @Test
    void c_getAll() {
        System.out.println("Display all countries");
        System.out.println(repository.getAll());
    }
}