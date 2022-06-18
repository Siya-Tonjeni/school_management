/*
 * AddressFactoryTest.java
 * Factory Test class for Address class
 * Author: Siyamtanda Tonjeni(217107958)
 * Date: 11 June 2022
 */
package za.ac.cput.school_management.factory.geography;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.geography.Address;
import za.ac.cput.school_management.factory.geography.CityFactory;
import za.ac.cput.school_management.factory.CountryFactory;
import za.ac.cput.school_management.factory.geography.AddressFactory;

import static org.junit.jupiter.api.Assertions.*;

public class AddressFactoryTest {

    @Test
    public void build(){
        Address address = AddressFactory.buildAddress("B12","Palms",
                "28","Long","8001",
                CityFactory.createCity("217","Cape Town",
                        CountryFactory.build("234","South Africa")));
        System.out.println(address);
        assertNotNull(address);
    }

    @Test
    @DisplayName("Test Throwing an IllegalArgumentException for streetNumber.")
    public void buildWithError(){

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                AddressFactory.buildAddress("B12 ","Palms","",
                        "Long","8001",CityFactory.createCity("217","Cape Town",
                                CountryFactory.build("234","South Africa"))));
       // String exceptionMessage = exception.getMessage();
        System.out.println("Street number: "+exception.getMessage());
    }

    @Test
    @DisplayName("Test Throwing an IllegalArgumentException for Postal code")
    public void testPostalCodeError(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                AddressFactory.buildAddress("B12","Palms","28",
                        "Long","81",CityFactory.createCity("217","Cape Town",
                                CountryFactory.build("234","South Africa"))));
        System.out.println(exception.getMessage());
    }
}
