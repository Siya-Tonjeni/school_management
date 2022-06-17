package za.ac.cput.school_management.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.factory.CityFactory;
import za.ac.cput.school_management.factory.CountryFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
class CityRepositoryTest {

        private static CityRepository repository=CityRepository.getRepository();
        private static City city= CityFactory.createCity("City-200","Cape Town", CountryFactory.build( "South Africa"));



        @Test
        void a_save(){
            City saved = repository.save(city);
            assertNotNull(saved);
            assertEquals(saved.getId(),city.getId());
            System.out.println("Saved: "+'\n'+saved);

        }
        @Test
        void b_read() {
            City read= repository.read(city.getId());
            assertNotNull(read);
            assertEquals(read.getId(),city.getId());
            System.out.println("Read: "+'\n'+ read);
        }

        @Test
        void d_delete() {
            List<City> cityDB = repository.getAll();
            City deleted= repository.delete(city);
            assertNull(deleted);
            assertEquals(0,cityDB.size());

            System.out.println("list after delete"+'\n'+cityDB);
        }



        @Test
        void c_findAll() {
            System.out.println("Show all cities");
            System.out.println(repository.getAll());
        }



    }