///*
// * AddressFactoryTest.java
// * Factory Test class for Address class
// * Author: Siyamtanda Tonjeni(217107958)
// * Date: 11 June 2022
// */
//package za.ac.cput.school_management.factory;
//
//import org.junit.jupiter.api.Test;
//import za.ac.cput.school_management.domain.Address;
//import za.ac.cput.school_management.domain.Country;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class AddressFactoryTest {
//
//    @Test
//    public void build(){
//        Address address = AddressFactory.buildAddress("B12","Palms",
//                "28","Long","8001",
//                CityFactory.build("217","Cape Town", CountryFactory.build("South Africa")));
//        System.out.println(address);
//        assertNotNull(address);
//    }
//
//    @Test
//    public void buildWithError(){
//        Exception exception = assertThrows(IllegalArgumentException.class, () ->
//                AddressFactory.buildAddress(" ","Palms","28",
//                        "Long","987",CityFactory.build("217","Cape Town",
//                                CountryFactory.build("South Africa"))));
//        String exceptionMessage = exception.getMessage();
//    }
//}
