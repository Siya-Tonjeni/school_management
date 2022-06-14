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

public class AddressRepository implements IAddressRepository {

    private static AddressRepository repository = null;
    private List<Address> addressList = null;

    private AddressRepository(){
        addressList = new ArrayList<>();
    }

    public static AddressRepository getRepository(){
        if(repository == null)
            repository = new AddressRepository();
        return repository;
    }

    public Address create(Address address){
        boolean success = addressList.add(address);
        if(success)
            return null;
        return address;
    }

    public Address read(String streetName){
        Address address = null;
        for(Address address1: addressList){
            if(address1.getStreetName().equalsIgnoreCase(streetName)){
                address = address1;
                break;
            }
        }
        return address;
    }

    public Address update(Address address){
        Address address1 = read(address.getStreetNumber());
        if(address1!= null){
            addressList.remove(address1);
            addressList.add(address1);
        }
        return address1;
    }

    @Override
    public Address delete(Address address) {
        Address address1 = read((address.getPostalCode()));
        if(address1 != null){
            addressList.remove((address));
        }
        return null;
    }

    @Override
    public List<Address> getAll() {
        return addressList;
    }
}
