/**
 * EmployeeRepositoryTest.java
 * Test class for EmployeeRepository
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 16 June 2022
 */
//package za.ac.cput.school_management.repository;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import za.ac.cput.school_management.domain.Employee;
//import za.ac.cput.school_management.factory.EmployeeFactory;
//import za.ac.cput.school_management.factory.NameFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//class EmployeeRepositoryTest {
//
//    public static IEmployeeRepository repository ;
//
//    public static Employee emp = EmployeeFactory.build("name@email.com",
//            NameFactory.build("Sonwabile", "", "Gxoyiya"));
//
//    public static Employee emp1 = EmployeeFactory.build("namenumbers@email.com",
//            NameFactory.build("Siyabulela", "Middle", "Gxoyiya"));
//
//    @Test
//    void save() {
//        Employee save = repository.save(emp);
//        assertNotNull(save);
//        System.out.println(save.toString());
//        System.out.println("In repository: " + repository.getAll());
//    }
//
//    @Test
//    void read() {
//        Employee save = repository.save(emp);
//        Employee save1 = repository.save(emp1);
//        System.out.println("In repository: " + repository.getAll());
//
//        Employee read = repository.getById(emp1.getStaffId());
//        assertNotNull(read);
//        System.out.println("Value: " + read);
//    }
//
//    @Test
//    void delete() {
//        Employee save = repository.save(emp);
//        Employee save1 = repository.save(emp1);
//        System.out.println("In repository: " + repository.getAll());
//
//        repository.delete(emp);
//        repository.delete(emp1);
//        System.out.println("In repository: " + repository.getAll());
//    }
//}