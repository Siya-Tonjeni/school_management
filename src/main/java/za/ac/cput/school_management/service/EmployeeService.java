/**
 * EmployeeService.java
 * Service implementation for Employee
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 16 June 2022
 */

package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService{


    private EmployeeRepository repository;
    private static EmployeeService service;

    private EmployeeService(){this.repository = EmployeeRepository.getRepository();}

    public static EmployeeService getService(){
        if(service == null){
            service = new EmployeeService();
        }
        return service;
    }

    @Override
    public Employee save(Employee employee) {
        return this.repository.save(employee);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Employee delete(Employee employee) {
        return this.repository.delete(employee);
    }

    @Override
    public List<Employee> getAll() {
        return this.repository.getAll();
    }
}
