/**
 * StudentRepository.java
 * Author: Hlombekazi Mbelu (209024666)
 * Date: 15 June 2022
 */
package za.ac.cput.school_management.repository.impl.user;

import za.ac.cput.school_management.domain.user.Student;
import za.ac.cput.school_management.repository.IRepository;

import java.util.List;
import java.util.Optional;

public class StudentRepository implements IRepository<Student ,String> {

    private static StudentRepository Student_Repository;
    private static List<Student> getStudentList;

    public StudentRepository(List<Student> getStudentList) {
        this.getStudentList = getStudentList;
    }

    public static StudentRepository getStudent_Repository(){
      if(Student_Repository ==getStudentList)
           Student_Repository = new StudentRepository(getStudentList);
      return Student_Repository;
  }

    @Override
    public Student save(Student student) {
        Optional<Student> read = read(student.getStudentId());
           if(read.isPresent()){
               delete(read.get());
           }
           this.getStudentList.add(student);
           return student;
     }



    @Override
    public Optional<Student> read(String  studentId) {
        return this.getStudentList.stream().filter(g -> g.getStudentId().equalsIgnoreCase(studentId))
                .findFirst();
    }

    @Override
    public void delete(Student student) {
      this.getStudentList.remove(student);

    }

    public List<Student> getAll(){
      return getStudentList;
 }
}
