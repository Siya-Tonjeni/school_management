package za.ac.cput.school_management.factory.user;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.geography.Address;
import za.ac.cput.school_management.domain.EmployeeAddress;
import za.ac.cput.school_management.domain.geography.City;
import za.ac.cput.school_management.factory.EmployeeAddressFactory;
import za.ac.cput.school_management.factory.geography.AddressFactory;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {
    @Test

    public void createStudentAddressWithAnError(){
        City city=new City.Builder().setId("1").setName("Cape town").build();

        Exception exception= assertThrows(IllegalArgumentException.class, ()->
                EmployeeAddressFactory.createEmployeeAddress("", AddressFactory.buildAddress("","","","","",city)));
                  String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertTrue(exception.getMessage().contains("id"));

    }

    @Test
    void createEmployeeAddressWithNoErrors(){
        City city=new City.Builder().setId("1").setName("Cape town").build();
        Address address=AddressFactory.buildAddress("20","","22093","","8561",city);

        EmployeeAddress employeeAddress= EmployeeAddressFactory.createEmployeeAddress("1", address);
        System.out.println(employeeAddress);
        assertAll(
                ()->assertNotNull(employeeAddress),
                ()->assertNotNull(address)
        );
    }
}
