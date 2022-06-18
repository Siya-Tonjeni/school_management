/**
 * IStudentAddressService.java
 * interface for StudentAddressService
 * Author: Zintle Zothe(216130565)
 * Date: 14 June 2022
 */
package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.user.StudentAddress;

import java.util.List;

public interface IStudentAddressService extends IService<StudentAddress,String>{
    List<StudentAddress> getAll();
   // List<StudentAddress> findStudentAddressByStudentId(String studentId);
}
