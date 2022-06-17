/**
 * NameServiceTest.java
 * Test class for NameService
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 16 June 2022
 */
//package za.ac.cput.school_management.service;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import za.ac.cput.school_management.domain.Name;
//import za.ac.cput.school_management.factory.NameFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//class NameServiceTest {
//
//    private Name name, name1, name2;
//    //private Name.NameId nameId, nameId1, nameId2;
//
//    @Autowired private NameService service;
//
//    @BeforeEach
//    void setUp(){
//        name = NameFactory.build("Sonwabile","","Gxoyiya");
//        //nameId = NameFactory.build(name);
//        name1 = NameFactory.build("Siyabulela", "", "Gxoyiya");
//        //nameId1 = NameFactory.build(name1);
//        name2 = NameFactory.build("Jack","","Daniels");
//        //nameId2 = NameFactory.build(name2);
//        //service.save(name);
//        service.save(name1);
//        service.save(name2);
//    }
//    @Test
//    void save() {
//        Name saveName = service.save(name);
//        assertNotNull(saveName);
//        System.out.println("sAVE Value: " + saveName);
//    }
//
//    @Test
//    void read() {
//        Name readName = service.read(nameId1);
//        assertNotNull(readName);
//        System.out.println("Read Value: " + readName);
//    }
//
//    @Test
//    void delete() {
//        service.delete(name2);
//        System.out.println(service.getAll());
//
//    }
//}