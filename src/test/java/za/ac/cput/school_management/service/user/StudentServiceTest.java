package za.ac.cput.school_management.service.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.school_management.domain.user.Student;
import za.ac.cput.school_management.factory.user.StudentFactory;
import za.ac.cput.school_management.factory.user.NameFactory;
import za.ac.cput.school_management.service.impl.user.StudentService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    private Student student, stud;

    @Autowired
    private StudentService service ;

    @BeforeEach
    void setUp(){
        student = StudentFactory.build("Hlombe@yahoo.co.za", NameFactory.build("Hlombe","", "Mbelu"));
        stud = StudentFactory.build("Hlombe@yahoo.ac.za", NameFactory.build("hlombe", "", "Mbelu"));
        service.save(student);

    }

    @Test
    void save() {
        assertNotNull(service.save(student));
        System.out.println("Save Result: " + service.getAll());
    }

    @Test
    void read() {
        Optional<Student> read = service.read(stud.getStudentId());
        assertNotNull(read);
        System.out.println("Value: " + read);
    }

    @Test
    void delete() {
        service.delete(student);
        System.out.println("Delete Result: " + service.getAll());
    }
}