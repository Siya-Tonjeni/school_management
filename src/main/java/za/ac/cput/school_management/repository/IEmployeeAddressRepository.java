
/*
   EmployeeAddress.java
   Interface for EmployeeAddress
   Student: Nikiwe Mkontshwana
   Student Number: 214236714
   Date: 14 June 2022
*/
package za.ac.cput.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.EmployeeAddress;
import java.util.List;

@Repository
public interface IEmployeeAddressRepository extends JpaRepository<EmployeeAddress, String> {

    List<EmployeeAddress> getAll(String staffId);
}
