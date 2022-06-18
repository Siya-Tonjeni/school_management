package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Address;

import java.util.List;

public interface IAddressService extends IService<Address, String>{
    List<Address> getAll();
}
