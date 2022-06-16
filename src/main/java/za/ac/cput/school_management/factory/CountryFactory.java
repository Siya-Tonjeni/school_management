package za.ac.cput.school_management.factory;
/**
 * CountryFactory.java
 * CountryFactory
 * Author: Abongile Tshopi (214254151)
 * Date Created: 14 June 2022
 */

import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.util.helper;

public class CountryFactory {
    public static Country build( String name){

        String id = helper.generateUUID();

        if(name.equals(""))
            throw new IllegalArgumentException("County name is empty.");

        return new Country.Builder()
                .setId(id)
                .setName(name)
                .build();
    }
}
