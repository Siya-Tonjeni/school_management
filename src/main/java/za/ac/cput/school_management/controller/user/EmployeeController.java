/**
 * EmployeeController.java
 * Controller class for Employee
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 16 June 2022
 */
package za.ac.cput.school_management.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.school_management.domain.user.Employee;
import za.ac.cput.school_management.service.impl.user.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("school-management/employee/")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("save")
    public ResponseEntity<Employee> save(@RequestBody Employee employee){
        Employee save = employeeService.save(employee);
        System.out.println("save");
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{s}")
    public ResponseEntity<Employee> read(@PathVariable String s){
        Employee read = employeeService.read(s).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(Employee employee){
        this.employeeService.delete(employee);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<Employee>> getAll(){
        List<Employee> employee = this.employeeService.getAll();
        return ResponseEntity.ok(employee);
    }
}
