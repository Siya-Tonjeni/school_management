package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.repository.AddressRepository;

import java.util.List;
import java.util.Optional;

public class AddressService implements IAddressService{
    private final AddressRepository repository;
    private static AddressService SERVICE;

    private AddressService(){
        this.repository = AddressRepository.getRepository();
    }

    public static AddressService getSERVICE(){
        if(SERVICE == null)
            SERVICE = new AddressService();
        return SERVICE;
    }

    public Address save(Address address){
        return this.repository.save(address);
    }

    @Override
    public Optional<Address> read(String streetName) {
        return this.repository.read(streetName);
    }

    public void delete(Address address){
        this.repository.delete(address);
    }

    public List<Address> getAll(){
        return this.repository.getAll();
    }
}
