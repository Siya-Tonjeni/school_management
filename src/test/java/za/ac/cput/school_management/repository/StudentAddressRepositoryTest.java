package za.ac.cput.school_management.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.school_management.domain.StudentAddress;
import za.ac.cput.school_management.factory.AddressFactory;
import za.ac.cput.school_management.factory.CityFactory;
import za.ac.cput.school_management.factory.CountryFactory;
import za.ac.cput.school_management.factory.StudentAddressFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class StudentAddressRepositoryTest {
    private static StudentAddressRepository repository=StudentAddressRepository.getRepository();
    private static StudentAddress studentAddress= StudentAddressFactory.createStudentAddress("student-id", AddressFactory.buildAddress("41086","Arigato","7784",
            CityFactory.createCity("City-300","Tokyo",
                    CountryFactory.build("Japan"))));


    @Test
    void a_save(){
        StudentAddress saved = repository.save(studentAddress);
        assertNotNull(saved);
        assertEquals(saved.getStudentId(),studentAddress.getStudentId());
        System.out.println("Saved: "+'\n'+saved);

    }
    @Test
    void c_read() {
        StudentAddress saved=repository.save(studentAddress);
        Optional<StudentAddress> read= repository.read(saved.getStudentId());
        assertAll(
                ()-> assertTrue(read.isPresent()),
                ()->assertSame(saved, read.get())
        );
        System.out.println("read "+'\n'+read.get());
    }

    @Test
    void a_delete() {

        StudentAddress saved = repository.save(studentAddress);
        List<StudentAddress> studentAddressDB=repository.getAll();
        assertEquals(1,studentAddressDB.size());
        repository.delete(saved);
        System.out.println("Student addresses on the list "+'\n'+studentAddressDB);
        studentAddressDB= repository.getAll();
        assertEquals(0,studentAddressDB.size());

    }



    @Test
    void d_findAll() {
        System.out.println("Show all studentAddress");
        System.out.println(repository.getAll());
    }
}