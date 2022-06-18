/**
 * CityFactoryTest.java
 * test for cityFactory
 * Author: Zintle Zothe(216130565)
 * Date: 12 June 2022
 */
package za.ac.cput.school_management.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.Country;

import static org.junit.jupiter.api.Assertions.*;

class CityFactoryTest {
    @Test
    //createCity with errors to check if it throws an exception
    public void createCityWithError(){
        Exception exception= assertThrows(IllegalArgumentException.class, ()->
                CityFactory.createCity("","Nairobi",CountryFactory.build("Country-100","Kenya")));
        String exceptionMessage = exception.getMessage();
        System.out.println(exception.getMessage());
        assertTrue(exception.getMessage().contains("id"));


    }

    @Test
        //shows successful createCity test results
    void createCityWithNoErrors(){
        Country country=CountryFactory.build("Country-200","South Africa");
        City city= CityFactory.createCity("City-200","cape town",country);
        System.out.println(city);
        assertAll(
                ()->assertNotNull(city),
                ()->assertNotNull(country)
        );
    }
}