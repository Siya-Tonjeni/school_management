package za.ac.cput.school_management.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import za.ac.cput.school_management.domain.EmployeeAddress;
import za.ac.cput.school_management.domain.geography.Address;
import za.ac.cput.school_management.domain.geography.City;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmployeeAddressServiceTest {
    City city=new City.Builder().setId("1").setName("Cape town").build();
    private final Address address = new Address.Builder()
            .setUnitNumber("2209")
            .setComplexName("L")
            .setStreetNumber("47")
            .setStreetName("Mvuzo Street")
            .setPostalCode("7784")
            .setCity(city)
            .builder();

    private final EmployeeAddress employeeAddress = new EmployeeAddress.Builder()
            .setStaffId("014")
            .setAddress(address)
            .build();
    @Autowired
    private EmployeeAddressService service;

    @Test
    void save() {
        EmployeeAddress employeeAddress1 = service.save(employeeAddress);
        String employAdd1 = String.valueOf(employeeAddress);
        String output = String.valueOf(employeeAddress1);
        assertAll(
                ()-> assertNotNull(employeeAddress1),
                () -> assertEquals(employAdd1, output)
        );
        System.out.println(employeeAddress1);
    }

    @Test
    void read() {
        EmployeeAddress employeeAddress1 = service.save(employeeAddress);
        Optional<EmployeeAddress> read = service.read(employeeAddress1.getStaffId());
        System.out.println(read);
        String employAdd1 = String.valueOf(employeeAddress1);
        String output = String.valueOf(read.get());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(employAdd1, output)
        );
    }

    @Test
    void delete() {
        this.service.delete(employeeAddress);
    }

    @Test
    void getAll() {
        EmployeeAddress employeeAddress1 = service.save(employeeAddress);
        String staffId = employeeAddress1.getStaffId();
        List<EmployeeAddress> employeeAddressList = service.getAll(staffId);
        System.out.println(employeeAddressList);
        assertSame(1, employeeAddressList.size());
    }

}

