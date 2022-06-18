/*
 * AddressRepository.java
 * Repository class for Address class
 * Author: Siyamtanda Tonjeni(217107958)
 * Date: 11 June 2022
 */
package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AddressRepository implements IAddressRepository {

    private static AddressRepository repository = null;
    private List<Address> addressList;

    private AddressRepository(){
        addressList = new ArrayList<>();
    }

    public static AddressRepository getRepository(){
        if(repository == null)
            repository = new AddressRepository();
        return repository;
    }

    public Address save(Address address){
        Optional<Address> read = read(address.getStreetName());
        if(read.isPresent()){
            delete(read.get());
        }
        this.addressList.add(address);
        return address;
    }

    public Optional<Address> read(String streetName){
        return this.addressList.stream().filter(g -> g.getStreetName()
                .equalsIgnoreCase(streetName)).findFirst();
    }

    @Override
    public void delete(Address address) {
        this.addressList.remove(address);
    }

    @Override
    public List<Address> getAll() {
        return addressList;
    }
}
