/**
 * IStudentAddressRepository.java
 * Interface for StudentAddress
 * Author: Zintle Zothe(216130565)
 * Date: 14 June 2022
 */
package za.ac.cput.school_management.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.user.StudentAddress;

import java.util.List;

@Repository
public interface IStudentAddressRepository extends JpaRepository<StudentAddress,String> {
    List<StudentAddress> getAll();
    List<StudentAddress> findStudentAddressByStudentId(String studentId);

}
