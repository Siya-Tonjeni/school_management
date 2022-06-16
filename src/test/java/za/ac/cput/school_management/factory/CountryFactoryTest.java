package za.ac.cput.school_management.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.school_management.domain.Country;

import static org.junit.jupiter.api.Assertions.*;

class CountryFactoryTest {

    private CountryFactory country0;
    private CountryFactory country1;
    private CountryFactory country2;

    @BeforeEach
    void setUp() {
        country0 = new CountryFactory();
        country1 = new CountryFactory();
        country2 = country1;
    }

    /*
     * Object Equality:
     * This test checks if the two objects are the same
     * the test passes since the object are the same
     */

    @Test
    void createCountry0(){

        Country country0 = CountryFactory.build("South Africa");
        System.out.println(country0.toString());

        if(country0.equals(""))
            throw new IllegalArgumentException("County name is empty.");

        assertNotNull(country0);
        System.out.println("Country created successfully");
    }

    @Test
    void testIdentity() {
        assertSame(country1, country2);
        System.out.println("country1 & country2 are the same");
    }

    /*
     * Object Equality:
     * This test checks if the two objects are equal
     */
    @Test
    void testEquality(){
        assertEquals(country1, country0);
        System.out.println("Object are not equal");
    }

    @Test
    @Timeout(1)
    void testTimeOUt() throws InterruptedException {
        Thread.sleep(998);
        System.out.println("Test passes");
    }

    @Test
    @Disabled
    void disableTest(){
    disableTest();
    }
}