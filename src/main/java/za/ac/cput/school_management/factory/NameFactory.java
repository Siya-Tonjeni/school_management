/**
 * NameFactory.java
 * Factory class for Name class
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 June 2022
 */

package za.ac.cput.school_management.factory;
import za.ac.cput.school_management.domain.Name;

public class NameFactory {

    public static Name buildName(String firstName, String middleName, String lastName){
        return new Name.Builder().setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();
    }
}
