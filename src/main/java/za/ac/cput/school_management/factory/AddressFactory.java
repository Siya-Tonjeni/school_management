/*
 * AddressFactory.java
 * Factory class for Address class
 * Author: Siyamtanda (217107958)
 * Date: 9 June 2022
 */
package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.domain.City;

public class AddressFactory {
    public static Address buildAddress(String unitNumber, String complexName, String streetNumber,
                                       String streetName, String postalCode, City city){
        return new Address.Builder()
                .setUnitNumber(unitNumber)
                .setComplexName(complexName)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setPostalCode(postalCode)
                .setCity(city)
                .builder();
    }
}
