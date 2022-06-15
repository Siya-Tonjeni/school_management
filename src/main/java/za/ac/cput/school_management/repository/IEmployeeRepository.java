/**
 * IEmployeeRepository.java
 * Interface for EmployeeRepository.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 15 June 2022
 */
package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.domain.Name;

import java.util.List;
import java.util.Optional;

public interface IEmployeeRepository extends IRepository<Employee, String>{

    public List<Employee> getAll();


}
