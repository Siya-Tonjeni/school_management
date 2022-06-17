/**
 * NameFactory.java
 * Factory class for Name class
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 June 2022
 */

package za.ac.cput.school_management.factory;
import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.util.helper;

public class NameFactory {

    public static Name build(String firstName, String middleName, String lastName){

        helper.checkNameAndSurname(firstName, lastName);

        return new Name.Builder().setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();
    }

//    public static Name.NameId build(Name name){
//        return new Name.NameId(name.getFistName(), name.getLastName());
//    }

}
