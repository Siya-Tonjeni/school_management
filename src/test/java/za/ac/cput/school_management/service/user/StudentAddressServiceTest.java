/**
 * StudentAddressServiceTest.java
 * test for StudentAddressService
 * Author: Zintle Zothe(216130565)
 * Date: 15 June 2022
 */
package za.ac.cput.school_management.service.user;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.school_management.domain.user.StudentAddress;
import za.ac.cput.school_management.factory.AddressFactory;
import za.ac.cput.school_management.factory.geography.CityFactory;
import za.ac.cput.school_management.factory.CountryFactory;
import za.ac.cput.school_management.factory.user.StudentAddressFactory;
import za.ac.cput.school_management.service.StudentAddressService;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class StudentAddressServiceTest {


   private static final StudentAddressService service=null;
  //  private static StudentAddressService service=StudentAddressService.getService();
    private static StudentAddress studentAddress= StudentAddressFactory.createStudentAddress("student-200", AddressFactory.buildAddress("","","41086","Osaka","7784",
            CityFactory.createCity("City-300","Tokyo",
                    CountryFactory.build("Country-300","Japan"))));


    @Test
    void b_save(){
        StudentAddress saved = service.save(studentAddress);
        assertNotNull(saved);
        assertEquals(saved.getStudentId(),studentAddress.getStudentId());
        System.out.println("Saved: "+'\n'+saved);

    }
    @Test
    void c_read() {
        StudentAddress saved=service.save(studentAddress);
        Optional<StudentAddress> read= service.read(saved.getStudentId());
        assertAll(
                ()-> assertTrue(read.isPresent()),
                ()->assertSame(saved, read.get())
        );
        System.out.println("read "+'\n'+read.get());
    }

    @Test
    void a_delete() {

        StudentAddress saved = service.save(studentAddress);
        List<StudentAddress> studentAddressDB=service.getAll();
        assertEquals(1,studentAddressDB.size());
        service.delete(saved);
        System.out.println("Student addresses on the list "+'\n'+studentAddressDB);
        studentAddressDB= service.getAll();
        assertEquals(0,studentAddressDB.size());

    }



    @Test
    void d_findAll() {
        System.out.println("Show all studentAddress");
        System.out.println(service.getAll());
    }

    @Test
    void e_findStudentAddressByStudentId(){
        StudentAddress studentAddress1 =StudentAddressFactory.createStudentAddress("student100", AddressFactory.buildAddress("","","41086","Osaka","7784",
                CityFactory.createCity("City-300","Tokyo",
                        CountryFactory.build("Country-300","Japan"))));

        StudentAddress studentAddress2 = StudentAddressFactory.createStudentAddress("student101", AddressFactory.buildAddress("","","41000","Zamalek","7700",
                CityFactory.createCity("City-400","Cairo",
                        CountryFactory.build("Country-300","Egypt"))));

        StudentAddress save = service.save(studentAddress1);
        StudentAddress save1 = service.save(studentAddress2);


        List<StudentAddress>  sa=service.findStudentAddressByStudentId("student101");
        System.out.println("student address "+'\n'+sa);

    }
}