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
import java.util.Optional;

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
        Optional<StudentAddress> read = read(studentAddress.getStudentId());
        if(read.isPresent()){
            delete(read.get());
        }
        this.studentAddressDB.add(studentAddress);
        return studentAddress;
    }


    @Override
    public Optional<StudentAddress> read(String id){
        return this.studentAddressDB.stream()
                .filter(s-> s.getStudentId().equalsIgnoreCase(id))
                .findFirst();
    }

    @Override
    public void delete(StudentAddress studentAddress){
        this.studentAddressDB.remove(studentAddress);
    }


    @Override
    public List<StudentAddress> getAll() {
        return studentAddressDB;
    }

}

