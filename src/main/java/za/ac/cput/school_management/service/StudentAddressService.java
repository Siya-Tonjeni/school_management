/**
 * StudentAddressService.java
 * class for StudentAddressService
 * Author: Zintle Zothe(216130565)
 * Date: 14 June 2022
 */
package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.StudentAddress;
import za.ac.cput.school_management.repository.CityRepository;
import za.ac.cput.school_management.repository.StudentAddressRepository;

import java.util.List;
import java.util.Optional;

public class StudentAddressService implements IStudentAddressService{
    private final StudentAddressRepository repository;
    private static StudentAddressService service;

    private StudentAddressService(){
        this.repository= StudentAddressRepository.getRepository();
    }

    public static StudentAddressService getService(){
        if(service==null){
            service=new StudentAddressService();
        }
        return service;
    }

    @Override
    public StudentAddress save(StudentAddress studentAddress) {
        return this.repository.save(studentAddress);
    }

    @Override
    public Optional<StudentAddress> read(String studentId) {
        return this.repository.read(studentId);
    }

    @Override
    public void delete(StudentAddress studentAddress) {
        this.repository.delete(studentAddress);
    }

    @Override
    public List<StudentAddress> getAll() {
        return this.repository.getAll();
    }

    @Override
    public List<StudentAddress> findStudentAddressByStudentId(String studentId) {
        return this.repository.findStudentAddressByStudentId(studentId);
    }


}
