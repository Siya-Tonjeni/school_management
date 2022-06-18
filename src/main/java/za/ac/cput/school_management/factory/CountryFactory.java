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
    public static Country build( String id, String name){

//        helper.checkStringParam("id", id);
//        helper.checkStringParam("name", name);

        //String id = helper.generateUUID();

        return new Country.Builder()
                .setId(id)
                .setName(name)
                .build();
    }
}
