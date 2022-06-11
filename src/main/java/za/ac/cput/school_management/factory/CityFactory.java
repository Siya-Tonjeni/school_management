/**
 * CityFactory.java
 * Factory class for City
 * Author:Zintle Zothe(216130565)
 * Date:  10 June 2022
 */
package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.util.helper;

public class CityFactory {
    public static City build(String id, String name, Country country){
        helper.checkStringParam("id", id);
        helper.checkStringParam("name",name);

        //check if country is null
        //....

        return new City.Builder().id(id)
                .name(name)
                .country(country)
                .build();

    }
}
