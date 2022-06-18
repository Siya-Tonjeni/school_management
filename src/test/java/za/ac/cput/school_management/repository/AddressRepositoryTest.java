///*
// * AddressRepositoryTest.java
// * Repository Test class for Address class
// * Author: Siyamtanda Tonjeni(217107958)
// * Date: 13 June 2022
// */
//package za.ac.cput.school_management.repository;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import za.ac.cput.school_management.domain.Address;
//import za.ac.cput.school_management.factory.AddressFactory;
//import za.ac.cput.school_management.factory.CityFactory;
//import za.ac.cput.school_management.factory.CountryFactory;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class AddressRepositoryTest {
//    private AddressRepository addressRepository;
//    private Address address;
//
//   @BeforeEach
//   void setUp(){
//       this.address = AddressFactory.buildAddress("B12","Palms","8001",
//               "Long","8001", CityFactory.build("2345","Cape Town",
//                       CountryFactory.build("South Africa")));
//       this.addressRepository = AddressRepository.getRepository();
//       Address saved = this.addressRepository.save(this.address);
//       assertSame(this.address, saved);
//   }
//
//   @AfterEach
//   void tearDown(){
//       this.addressRepository.delete(this.address);
//       List<Address> addressList = this.addressRepository.getAll();
//       assertEquals(0, addressList.size());
//   }
//
//    @Test
//    public void read(){
//        Optional<Address> read = this.addressRepository.read(this.address.getStreetName());
//        assertAll(
//                () -> assertTrue(read.isPresent()),
//                () -> assertSame(this.address, read.get())
//        );
//    }
//
//
//    @Test
//    public void getAll(){
//       List<Address> addressList = this.addressRepository.getAll();
//       assertEquals(1,addressList.size());
//        //System.out.println("Show the whole address: " + addressRepository.getAll());
//    }
//
//
//}
