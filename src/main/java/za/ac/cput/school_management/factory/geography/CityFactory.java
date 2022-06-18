/**
 * CityFactory.java
 * Factory class for City
 * Author:Zintle Zothe(216130565)
 * Date:  10 June 2022
 */
package za.ac.cput.school_management.factory.geography;

import za.ac.cput.school_management.domain.geography.City;
import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.util.helper;

public class CityFactory {
    public static City createCity(String id, String name, Country country){
        helper.checkStringParam("id", id);
        helper.checkStringParam("name",name);

        //check if country is null or empty
        if( country == null || country.getId().isEmpty() || country.getName().isEmpty())
            throw new IllegalArgumentException("Please insert country id or name: ");

        City city= new City.Builder().setId(id)
                .setName(name)
                .setCountry(country)
                .build();
        return city;

    }
}
