/**
 * Author: Hlombekazi Mbelu (209024666)
 * Date: 16 June 2022
 */
package za.ac.cput.school_management.service.impl.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.user.Student;
import za.ac.cput.school_management.repository.impl.user.IStudentRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {


    private IStudentRepository repository;


    @Autowired
    private StudentService(IStudentRepository repository) {
        this.repository = repository;
    }


    @Override
    public Student save(Student student) {
        return this.repository.save(student);
    }

    @Override
    public Optional<Student> read(String s) {
        return this.repository.findById(s);
    }

    @Override
    public void delete(Student student) {
        this.repository.delete(student);
    }

    @Override
    public List<Student> getAll() {
        return this.repository.findAll();
    }


    public List<Student>  getEmail(String givenEmail) {
        List<Student> result = new ArrayList<>();
        List<Student> student = getAll();
        for (Student e : student) {
            if (e.getEmail().equals(givenEmail)) {
                result.add(e);

            }
        }
        return result;


    }
}