package za.ac.cput.school_management.repository.impl.user;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.user.Student;

@Repository
public interface IStudentRepository  extends JpaRepository<Student, String> {

}