/**
 * NameRepositoryTest.java
 * Test class for NameRepository.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 15 June 2022
 */
//package za.ac.cput.school_management.repository;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import za.ac.cput.school_management.domain.user.Name;
//import za.ac.cput.school_management.factory.user.NameFactory;
////import za.ac.cput.school_management.repository.NameRepository;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//class NameRepositoryTest {
//
//    public static INameRepository repository ;
//    public static Name name = NameFactory.build("Sonwabile","OK","Gxoyiya");
//    Name.NameId nameId = new Name.NameId(name.getFistName(),name.getLastName());
//    public static Name name1 = NameFactory.build("Siyabulela","","Gxoyiya");
//    public static Name name2 = NameFactory.build("Sonwabile","","Lolo");
//
//    @Test
//    void create() {
//        Name createdName = repository.save(name);
//        assertNotNull(createdName);
//        System.out.println(createdName.toString());
//        System.out.println("In the Repository: " + repository.findAll());
//    }
//
//    @Test
//    void read() {
//        Name createdName = repository.save(name);
//        Name createdName1 = repository.save(name1);
//        Name createdName2 = repository.save(name2);
//        Name readName = repository.getById(nameId);
//        assertNotNull(readName);
//        System.out.println("In Repository: " + repository.findAll());
//        System.out.println("Read value: " + readName);
//    }
//
//
//
//    @Test
//    void delete() {
//        Name createdName = repository.save(name);
//        Name createdName1 = repository.save(name1);
//        System.out.println("In repository: " + repository.findAll());
//        repository.delete(name1);
//        System.out.println("In the Repository: " + repository.findAll());
//    }
//
//
//}