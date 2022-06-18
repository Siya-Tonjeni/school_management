/**
 * CityServiceTest.java
 * test for CityService
 * Author: Zintle Zothe(216130565)
 * Date: 15 June 2022
 */
package za.ac.cput.school_management.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.factory.CityFactory;
import za.ac.cput.school_management.factory.CountryFactory;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CityServiceTest {
    private static final CityService service=null;
    private static City city= CityFactory.createCity("City-204","Bloemfontein", CountryFactory.build("Country-200","South Africa"));



    @Test
    void b_save(){
        City saved = service.save(city);
        assertNotNull(saved);
        assertEquals(saved.getId(),city.getId());
        System.out.println("Saved: "+'\n'+saved);

    }
    @Test
    void c_read() {
        City saved=service.save(city);
        Optional<City> read= service.read(saved.getId());
        assertAll(
                ()-> assertTrue(read.isPresent()),
                ()->assertSame(saved, read.get())
        );
        System.out.println("read "+'\n'+read.get());
    }

    @Test
    void a_delete() {
        City saved = service.save(city);
        List<City> cityDB=service.getAll();
        assertEquals(1,cityDB.size());
        service.delete(saved);
        System.out.println("cities on the list "+'\n'+cityDB);
        cityDB=service.getAll();
        assertEquals(0,cityDB.size());
    }



    @Test
    void d_findAll() {
        System.out.println("Show all cities");
        System.out.println(service.getAll());
        System.out.println();
    }

    @Test
    void f_getCitiesGivenACountryId(){
        City city1= CityFactory.createCity("City-205","Pretoria",CountryFactory.build("Country-200","South Africa"));
        City city2= CityFactory.createCity("City-201","Durban",CountryFactory.build("Country-200","South Africa"));
        City city3= CityFactory.createCity("City-400","Cairo",CountryFactory.build("Country-400","Egypt"));

        City save = service.save(city1);
        City save1 = service.save(city2);
        City save2 = service.save(city3);

        System.out.println("List of cities in this Country: ");
        List<City>  cityList=service.getCitiesGivenACountryId("Country-200");



        }

    @Test
    void e_findCityById(){
        City city1= CityFactory.createCity("City-400","Cairo",CountryFactory.build("Country-400","Egypt"));
        City city2= CityFactory.createCity("City-500","Nairobi",CountryFactory.build("Country-","Kenya"));

        City save = service.save(city1);
        City save1 = service.save(city2);

        List<City>  cities=service.findCityById("City-400");
        System.out.println(cities);
        System.out.println();
    }
}