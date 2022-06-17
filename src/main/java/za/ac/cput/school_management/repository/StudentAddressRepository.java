/**
 * StudentAddressRepository.java
 * class for StudentAddress
 * Author: Zintle Zothe(216130565)
 * Date: 14 June 2022
 */
package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.StudentAddress;

import java.util.ArrayList;
import java.util.List;

public class StudentAddressRepository implements IStudentAddressRepository {

    private static StudentAddressRepository repository = null;
    private List<StudentAddress> studentAddressDB = null;

    private StudentAddressRepository() {
        studentAddressDB = new ArrayList<>();
    }

    public static StudentAddressRepository getRepository() {
        if (repository == null) {
            repository = new StudentAddressRepository();
        }
        return repository;
    }


    @Override
    public StudentAddress save(StudentAddress studentAddress) {
        StudentAddress saveStudentAddress = read(studentAddress.getStudentId());
        if (saveStudentAddress != null) {
            studentAddressDB.remove(saveStudentAddress);
            studentAddressDB.add(studentAddress);
        } else {
            studentAddressDB.add(studentAddress);
            return studentAddress;
        }
        return null;

    }


    @Override
    public StudentAddress read(String studentId) {
        StudentAddress studentAddress = this.studentAddressDB.stream()
                .filter(s -> s.getStudentId().equals(studentId))
                .findAny()
                .orElse(null);

        return studentAddress;
    }

    @Override
    public StudentAddress delete(StudentAddress studentAddress) {
        this.studentAddressDB.remove(studentAddress);
        return null;
    }


    @Override
    public List<StudentAddress> getAll() {
        return studentAddressDB;
    }

}

