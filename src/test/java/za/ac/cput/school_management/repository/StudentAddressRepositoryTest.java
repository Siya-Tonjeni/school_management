/**
 * StudentAddressRepositoryTest.java
 * test for StudentAddressRepository
 * Author: Zintle Zothe(216130565)
 * Date: 15 June 2022
 */
package za.ac.cput.school_management.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.school_management.domain.user.StudentAddress;
import za.ac.cput.school_management.factory.AddressFactory;
import za.ac.cput.school_management.factory.geography.CityFactory;
import za.ac.cput.school_management.factory.CountryFactory;
import za.ac.cput.school_management.factory.user.StudentAddressFactory;
import za.ac.cput.school_management.repository.user.IStudentAddressRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class StudentAddressRepositoryTest {
   //private static StudentAddressRepository repository=StudentAddressRepository.getRepository();
    private static IStudentAddressRepository repository=null;
    private static StudentAddress studentAddress= StudentAddressFactory.createStudentAddress("student-200", AddressFactory.buildAddress("","","41086","Osaka","7784",
            CityFactory.createCity("City-300","Tokyo",
                    CountryFactory.build("Country-300","Japan"))));


    @Test
    void b_save(){
        StudentAddress saved = repository.save(studentAddress);
        assertNotNull(saved);
        assertEquals(saved.getStudentId(),studentAddress.getStudentId());
        System.out.println("Saved: "+'\n'+saved);

    }
    @Test
    void c_read() {
        StudentAddress saved=repository.save(studentAddress);
//        Optional<StudentAddress> read= repository.read(saved.getStudentId());
        Optional<StudentAddress> read= repository.findById(saved.getStudentId());
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

    @Test
    void e_findStudentAddressByStudentId(){
        StudentAddress studentAddress1 =StudentAddressFactory.createStudentAddress("student100", AddressFactory.buildAddress("","","41086","Osaka","7784",
                CityFactory.createCity("City-300","Tokyo",
                        CountryFactory.build("Country-300","Japan"))));

        StudentAddress studentAddress2 = StudentAddressFactory.createStudentAddress("student101", AddressFactory.buildAddress("","","41000","Zamalek","7700",
                CityFactory.createCity("City-400","Cairo",
                        CountryFactory.build("Country-400","Egypt"))));

        StudentAddress save = repository.save(studentAddress1);
        StudentAddress save1 = repository.save(studentAddress2);


    List<StudentAddress>  sa=repository.findStudentAddressByStudentId("student101");
        System.out.println("student address "+'\n'+sa);

}
}