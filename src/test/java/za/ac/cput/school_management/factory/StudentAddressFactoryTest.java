/**
 * StudentFactoryTest.java
 * Test  for StudentAddressFactory
 * Author:Zintle Zothe(216130565)
 * Date:  12 June 2022
 */
package za.ac.cput.school_management.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.domain.StudentAddress;

import static org.junit.jupiter.api.Assertions.*;

class StudentAddressFactoryTest {
    @Test
    //createCity with errors to check if it throws an exception
    public void createStudentAddressWithAnError(){
        Exception exception= assertThrows(IllegalArgumentException.class, ()->
                StudentAddressFactory.createStudentAddress("",AddressFactory.buildAddress("","","","","",
                        CityFactory.createCity("","",
                                CountryFactory.build("")))));
        String exceptionMessage = exception.getMessage();
        System.out.println(exception.getMessage());
        assertTrue(exception.getMessage().contains("id"));

    }

    @Test
        //shows successful createStudentAddress test results
    void createStudentAddressWithNoErrors(){
        Address address=AddressFactory.buildAddress("","","41086","Shiyeka","7784",
                CityFactory.createCity("City-200","Cape Town",
                        CountryFactory.build("South Africa")));
        StudentAddress studentAddress= StudentAddressFactory.createStudentAddress("Student-1",address);
        System.out.println(studentAddress);
        assertAll(
                ()->assertNotNull(studentAddress),
                ()->assertNotNull(address)
        );
    }
}