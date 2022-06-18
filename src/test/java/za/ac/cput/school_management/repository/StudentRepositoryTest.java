package za.ac.cput.school_management.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.user.Student;
import za.ac.cput.school_management.factory.user.StudentFactory;
import za.ac.cput.school_management.factory.user.NameFactory;
import za.ac.cput.school_management.repository.impl.user.StudentRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {

private Student student;
private StudentRepository stud;

    @BeforeEach void setup() {
        this.student = StudentFactory.build("Hlombe@yahoo.com",
                NameFactory.build("Hlombe", "", "Mbelu"));
        this.stud = StudentRepository.getStudent_Repository();
    }

    @Test
    void save() {
       Student saved = this.stud.save(this.student);
       assertNull(saved);
       assertSame(this.student ,saved);
    }

    @Test
    void read() {
        Optional<Student> read = this.stud.read(this.student.getStudentId());
        assertAll(
                () -> assertTrue(read.isPresent()),
               () -> assertSame(this.student , read.get())
        );
    }

    @Test
    void delete() {
        this.stud.delete(this.student);
        List<Student> studentList = this.stud.getAll();
        assertEquals(0 , studentList.size());

    }

    @Test
    void getAll() {
        List<Student> studentList = this.stud.getAll();
        assertEquals(1, studentList);
    }
}