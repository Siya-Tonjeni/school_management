package za.ac.cput.school_management.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.factory.AddressFactory;
import za.ac.cput.school_management.factory.CityFactory;
import za.ac.cput.school_management.factory.CountryFactory;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AddressServiceTest {
    private Address address;

    @Autowired private AddressService addressService;

    @BeforeEach void setUp(){
        address = AddressFactory.buildAddress("B12", "Palms","28",
                "Long","8001", CityFactory.build("2172","Cape Town",
                        CountryFactory.build("South Africa")));
        addressService.save(address);
    }

    @Test void save(){
        assertNotNull(addressService.save(address));
        System.out.println("Saved: " +addressService.getAll());
    }

    @Test
    void read(){
        Optional<Address> read = addressService.read(address.getStreetName());
        assertNotNull(read);
        System.out.println("Read: " +read);
    }

    @Test
    void delete(){
        addressService.delete(address);
        System.out.println("Deleted " +addressService.getAll());
    }
}
