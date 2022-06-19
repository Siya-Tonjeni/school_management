package za.ac.cput.school_management.repository.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.domain.employee.EmployeeAddress;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class EmployeeAddressRepositoryTest {
    private final Address location = new Address.Builder()
            .setStreetName("Mvuzo street")
            .setStreetNumber("47")
            .setComplexName("")
            .setUnitNumber("")
            .setPostalCode(7784)
            .build();
    private final EmployeeAddress employeeAddress = new EmployeeAddress.Builder()
            .setStaffId("test")
            .setAddress(location)
            .build();
    @Autowired private EmployeeAddressRepository repository;

    @Test
    void save() {
        EmployeeAddress saved = repository.save(employeeAddress);
        String emp1 = String.valueOf(employeeAddress);
        String output = String.valueOf(saved);
        assertNotNull(saved);
        assertEquals(emp1,output);
    }

    @Test
    void read() {
        EmployeeAddress saved = repository.save(employeeAddress);
        Optional<EmployeeAddress> read = repository.findById(saved.getStaffId());
        String employ1 = String.valueOf(saved);
        String output = String.valueOf(read.get());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(employ1, output)
        );
    }

    @Test
    void delete() {
        EmployeeAddress saved = repository.save(employeeAddress);
        List<EmployeeAddress> getAll = repository.findAll();
        repository.delete(saved);
        assertEquals(0, getAll.size());
    }

    @Test
    void getAll() {
        repository.save(employeeAddress);
        List<EmployeeAddress> getAll = repository.findAll();
        assertEquals(1,getAll.size());
    }

}

