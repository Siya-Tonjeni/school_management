
/*
EmployeeAddress.java
RepositoryTest for EmployeeAddress
Student: Nikiwe Mkontshwana
Student Number: 214236714
Date: 18 June 2022
*/


package za.ac.cput.school_management.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import za.ac.cput.school_management.domain.geography.Address;
import za.ac.cput.school_management.domain.geography.City;
import za.ac.cput.school_management.domain.EmployeeAddress;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class EmployeeAddressRepositoryTest {

    City city = new City.Builder().setId("1").setName("Cape town").build();
    private final Address employeeAddress2 = new Address.Builder()
            .setUnitNumber("2209")
            .setComplexName("L")
            .setStreetNumber("47")
            .setStreetName("Mvuzo Street")
            .setPostalCode("7784")
            .setCity(city)
            .builder();

    private final EmployeeAddress employeeAddress = new EmployeeAddress.Builder()
            .setStaffId("test")
            .setAddress(employeeAddress2)
            .build();
    @Autowired
    private IEmployeeAddressRepository repository;

    @Test
    void save() {
        EmployeeAddress employeeAddress1 = repository.save(employeeAddress);
        String employ1 = String.valueOf(employeeAddress1);
        String output = String.valueOf(employeeAddress1);
        assertNotNull(employeeAddress);
        assertEquals(employ1, output);

                    }

        @Test
        void read () {

            EmployeeAddress EmployeeAddress1 = repository.save(employeeAddress);
            Optional<EmployeeAddress> read = repository.findById(EmployeeAddress1.getStaffId());
            String employ1 = String.valueOf(EmployeeAddress1);

            String output = String.valueOf(read.get());
            assertAll(
                    () -> assertTrue(read.isPresent()),
                    () -> assertSame(employ1, output)
            );
        }

        @Test
        void delete () {

            EmployeeAddress EmployeeAddress1 = repository.save(employeeAddress);
            List<EmployeeAddress> getAll = repository.findAll();
            repository.delete(EmployeeAddress1);

            assertEquals(0, getAll.size());
        }

        @Test
        void getAll () {
            repository.save(employeeAddress);
            List<EmployeeAddress> getAll = repository.findAll();
            assertEquals(1, getAll.size());
        }

    }


