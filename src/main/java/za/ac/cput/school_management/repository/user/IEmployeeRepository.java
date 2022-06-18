/**
 * IEmployeeRepository.java
 * Interface for EmployeeRepository.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 15 June 2022
 */
package za.ac.cput.school_management.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.user.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, String> {

    //public List<Employee> getAll();


}
