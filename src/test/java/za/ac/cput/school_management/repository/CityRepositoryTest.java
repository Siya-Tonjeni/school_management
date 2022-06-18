/**
 * CityRepositoryTest.java
 * test for cityRepository
 * Author: Zintle Zothe(216130565)
 * Date: 15 June 2022
 */
package za.ac.cput.school_management.repository;

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
class CityRepositoryTest {


        private static ICityRepository repository=null;
    // private static CityRepository repository=CityRepository.getRepository();
        private static City city= CityFactory.createCity("City-200","Cape Town", CountryFactory.build( "Country-200","South Africa"));



        @Test
        void b_save(){
            City saved = repository.save(city);
            assertNotNull(saved);
            assertEquals(saved.getId(),city.getId());
            System.out.println("Saved: "+'\n'+saved);

        }
        @Test
        void c_read() {
            City saved=repository.save(city);
           // Optional<City> read= repository.read(saved.getId());
            Optional<City> read= repository.findById(saved.getId());
            assertAll(
                    ()-> assertTrue(read.isPresent()),
                    ()->assertSame(saved, read.get())
            );
            System.out.println("read "+'\n'+read.get());
        }

        @Test
        void a_delete() {
            City saved = repository.save(city);
            List<City> cityDB=repository.getAll();
            assertEquals(1,cityDB.size());
            repository.delete(saved);
            System.out.println("cities on the list "+'\n'+cityDB);
            cityDB= repository.getAll();
            assertEquals(0,cityDB.size());
        }



        @Test
        void d_findAll() {
            System.out.println("Show all cities");
            System.out.println(repository.getAll());
        }



   @Test
    void e_findCityById(){
        City city1= CityFactory.createCity("City-400","Cairo",CountryFactory.build("Country-400","Egypt"));
        City city2= CityFactory.createCity("City-500","Nairobi",CountryFactory.build("Country-500","Kenya"));

        City save = repository.save(city1);
        City save1 = repository.save(city2);


        List<City>  cities=repository.findCityById("City-500");
        System.out.println(cities);
        System.out.println("city with this id "+'\n'+cities);
    }


    }