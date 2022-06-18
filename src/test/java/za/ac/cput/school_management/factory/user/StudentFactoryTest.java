package za.ac.cput.school_management.factory.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.user.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    @DisplayName("Test all specs")
    public void testCreate(){
        Student student = StudentFactory.build("hlombe@yahoo.ac.za",
                NameFactory.build("Hlombe","Hlombekazi","Mbelu"));

        assertNotNull(student);
        System.out.println(student.toString());
    }


    @Test
    @DisplayName("No middle name ")
    public void testNotSame(){

        Student stud = StudentFactory.build("hlomb@gmail.com",
                NameFactory.build("Hlombe","","Mbelu"));

        Student student = new Student.Builder().copy(stud).build();
        assertNotSame(stud, student);
        System.out.println(stud);
        System.out.println(student);
    }


}