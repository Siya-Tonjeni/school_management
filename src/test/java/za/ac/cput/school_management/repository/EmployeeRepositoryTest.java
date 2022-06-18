///**
// * EmployeeRepositoryTest.java
// * Test class for EmployeeRepository
// * Author: Sonwabile Gxoyiya (219267189)
// * Date: 16 June 2022
// */
//package za.ac.cput.school_management.repository;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.boot.test.context.SpringBootTest;
//import za.ac.cput.school_management.domain.user.Employee;
//import za.ac.cput.school_management.factory.user.EmployeeFactory;
//import za.ac.cput.school_management.factory.user.NameFactory;
//import za.ac.cput.school_management.repository.user.IEmployeeRepository;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class EmployeeRepositoryTest {
//
//    public static IEmployeeRepository repository ;
//
//    public static Employee emp = EmployeeFactory.build("test-id","name@email.com",
//            NameFactory.build("Sonwabile", "", "Gxoyiya"));
//
//    public static Employee emp1 = EmployeeFactory.build("test-id", "namenumbers@email.com",
//            NameFactory.build("Siyabulela", "Middle", "Gxoyiya"));
//
//    @Test
//    @Order(1)
//    void save() {
//        Employee save = repository.save(emp);
//        assertNotNull(save);
//        repository.save(emp1);
//        System.out.println(save.toString());
//        System.out.println("In repository: " + repository.findAll());
//    }
//
//    @Test
//    @Order(2)
//    void read() {
////        Employee save = repository.save(emp);
////        Employee save1 = repository.save(emp1);
////        System.out.println("In repository: " + repository.findAll());
//
//        Employee read = repository.getById(emp1.getStaffId());
//        assertNotNull(read);
//        System.out.println("Value: " + read);
//    }
//
//    @Test
//    @Order(3)
//    void delete() {
////        Employee save = repository.save(emp);
////        Employee save1 = repository.save(emp1);
////        System.out.println("In repository: " + repository.findAll());
//
//        repository.delete(emp);
//        repository.delete(emp1);
//        System.out.println("In repository: " + repository.findAll());
//    }
//}