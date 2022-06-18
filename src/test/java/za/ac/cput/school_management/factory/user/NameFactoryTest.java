/**
 * NameFactoryTest.java
 * Test class for NameFactory.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 10 June 2022
 */
package za.ac.cput.school_management.factory.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.user.Name;
import za.ac.cput.school_management.factory.user.NameFactory;

import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {


    @Test
    @DisplayName("Testing create the Name Value object")
    public void testCreate(){
        Name name = NameFactory.build("Sonwabile","", "Gxyiya");
        assertNotNull(name);
        System.out.println(name.toString());

    }



    @Test
    @DisplayName("Testing create the Name Value object")
    public void testNotSame(){
        Name name1 = NameFactory.build("Siyabulela","","Gxoyiya");
        Name name2 = NameFactory.build("Sonwabile","","Gxoyiya");
        assertNotSame(name1, name2);
        System.out.println(name1.toString());
        System.out.println(name2.toString());
    }

    @Test
    @DisplayName("Test Throwing an IllegalArgumentException for FirstName.")
    public void testExceptionForFirstName(){

        Exception exc = assertThrows(IllegalArgumentException.class,  () -> NameFactory.build("","","Gxoyiya"));
        System.out.println("IllegalArgumentException: " + exc.getMessage());
    }

    @Test
    @DisplayName("Test Throwing an IllegalArgumentException for LastName.")
    public void testExceptionForLastName(){
        Exception exc = assertThrows(IllegalArgumentException.class, () ->  NameFactory.build("Sonwabile","",""));
        System.out.println("IllegalArgumentException: " + exc.getMessage());
    }

}