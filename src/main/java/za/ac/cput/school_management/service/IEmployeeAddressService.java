
/*
EmployeeAddress.java
Interface for EmployeeAddressService
Student: Nikiwe Mkontshwana
Student Number: 214236714
Date: 15 June 2022
*/
package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.EmployeeAddress;
import za.ac.cput.school_management.service.IService;
import java.util.List;

public interface IEmployeeAddressService extends IService <EmployeeAddress, String> {

    List<EmployeeAddress>getAll(String staffId);
        void deleteById (String staffId);

}
