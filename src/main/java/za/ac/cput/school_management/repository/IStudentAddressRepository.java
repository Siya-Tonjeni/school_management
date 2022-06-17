/**
 * IStudentAddressRepository.java
 * Interface for StudentAddress
 * Author: Zintle Zothe(216130565)
 * Date: 14 June 2022
 */
package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.StudentAddress;

import java.util.List;

public interface IStudentAddressRepository extends IRepository<StudentAddress,String> {
    List<StudentAddress> getAll();
}
