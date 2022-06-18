/**
 * CityService.java
 * class for CityService
 * Author: Zintle Zothe(216130565)
 * Date: 14 June 2022
 */
package za.ac.cput.school_management.service;

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.City;
//import za.ac.cput.school_management.repository.CityRepository;
import za.ac.cput.school_management.repository.ICityRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class CityService implements ICityService{
    private final ICityRepository repository;

    public CityService(ICityRepository repository){
        this.repository= repository;
    }

//    private static CityService service=null;
//    private CityRepository repository;
//
//    private CityService(){
//        this.repository= CityRepository.getRepository();
//    }
//    public static CityService getService(){
//        if(service==null){
//            service=new CityService();
//        }
//        return service;
//    }
    @Override
    public City save(City city) {
        return this.repository.save(city);
    }

//    @Override
//    public Optional<City> read(String id) {
//        return this.repository.read(id);
//    }
    @Override
    public Optional<City> read(String id) {
        return this.repository.findById(id);
    }

    @Override
    public void delete(City city) {
        this.repository.delete(city);
    }

    @Override
    public List<City> getAll() {
        return this.repository.getAll();
    }

    @Override
    public List<City> getCitiesGivenACountryId(String countryId) {
        List<City> citiesInGivenCountryId = new ArrayList<>();
        List<City> cities = getAll();

        cities.sort(Comparator.comparing(City::getName));

        for (City city : cities) {
            if (city.getCountry().getId().equals(countryId)) {
                citiesInGivenCountryId.add(city);
                System.out.println(city.getName());
            }
        }
        return citiesInGivenCountryId;
    }

    @Override
    public List<City> findCityById(String cityId) {
        return this.repository.findCityById(cityId);
    }

}
