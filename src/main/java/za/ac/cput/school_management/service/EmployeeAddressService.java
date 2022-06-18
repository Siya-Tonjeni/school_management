
/*
EmployeeAddress.java
EmployeeAddressService
Student: Nikiwe Mkontshwana
Student Number: 214236714
Date: 17 June 2022
*/
/*package za.ac.cput.school_management.service;

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.repository.IEmployeeRepository;
import za.ac.cput.school_management.service.EmployeeAddressService.IEmploymentAddressService;
import za.ac.cput.school_management.domain.EmployeeAddress;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeAddressService implements IEmployeeAddressService{
    private IEmployeeAddressRepository repository;

    public EmployeeAddressService(IEmployeeAddressRepository repository)
    {
        this.repository = repository;
    }

    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) throws IllegalArgumentException
    {
        return repository.save(employeeAddress);
    }

    @Override
    public Optional<EmployeeAddress> read(String staffId)
    {
        return repository.findById(staffId);
    }

    @Override
    public List<EmployeeAddress> findAll()
    {
        return repository.findAll();
    }

    @Override
    public void deleteById(String staffId)
    {
        Optional<EmployeeAddress> employeeAddress = read(staffId);
        employeeAddress.ifPresent(this::delete);
    }

    @Override
    public void delete(EmployeeAddress object)
    {
        repository.delete(object);
    }

}
*/






