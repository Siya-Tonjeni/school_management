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
    void b_read() {
        StudentAddress read= repository.read(studentAddress.getStudentId());
        assertNotNull(read);
        assertEquals(read.getStudentId(),studentAddress.getStudentId());
        System.out.println("Read: "+'\n'+ read);
    }

    @Test
    void d_delete() {

        List<StudentAddress> studentAddressDB = repository.getAll();
        StudentAddress deleted= repository.delete(studentAddress);
        assertNull(deleted);
        assertEquals(0,studentAddressDB.size());

        System.out.println("list after delete"+'\n'+studentAddressDB);

    }



    @Test
    void c_findAll() {
        System.out.println("Show all cities");
        System.out.println(repository.getAll());
    }
}