/**
 * Author: Hlombekazi Mbelu (209024666)
 * Date: 16 June 2022
 */
package za.ac.cput.school_management.service.impl.user;

import service.IService;
import za.ac.cput.school_management.domain.user.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService extends IService<Student, String> {
    Student save(Student student);

    Optional<Student> read(String s);

    void delete(Student student);

    List<Student> getAll();
}
