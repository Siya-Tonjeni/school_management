/**
 * EmployeeService.java
 * Service implementation for Employee
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 16 June 2022
 */

package za.ac.cput.school_management.service.impl.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.user.Employee;
//import za.ac.cput.school_management.repository.EmployeeRepository;
import za.ac.cput.school_management.repository.impl.user.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {


    private IEmployeeRepository repository;
    //private static EmployeeService service;

    @Autowired private EmployeeService(IEmployeeRepository repository){this.repository = repository;}

//    public static EmployeeService getService(){
//        if(service == null){
//            service = new EmployeeService();
//        }
//        return service;
//    }

    @Override
    public Employee save(Employee employee) {
        return this.repository.save(employee);
    }

    @Override
    public Optional<Employee> read(String s) {
        return this.repository.findById(s);
    }

    @Override
    public void delete(Employee employee) {
         this.repository.delete(employee);
    }

    @Override
    public List<Employee> getAll() {
        return this.repository.findAll();
    }

    //get employeename given email
    public List<Employee> getEmployeeNameByEmail(String givenEmail){
        List<Employee> result = new ArrayList<>();
        List<Employee> employee = getAll();
        for(Employee e: employee){
            if(e.getEmail().equals(givenEmail)){
                result.add(e);

                //result = result.getName();
            }
        }
        return result;



    }

//    public String getNameById(String givenEmail){
//        String result = null;
//        List<Employee> employee = getAll();
//        for(Employee e: employee){
//            if(e.getEmail().equals(givenEmail)){
//                //result
//            }
//        }
//    }
}
