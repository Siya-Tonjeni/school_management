/**
 * CityRepository.java
 * class for CityRepository
 * Author: Zintle Zothe(216130565)
 * Date: 14 June 2022
 */
package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.City;

import java.util.ArrayList;
import java.util.List;

public class CityRepository implements ICityRepository {

    private static CityRepository repository = null;
    private List<City> cityDB = null;

    private CityRepository() {
        cityDB = new ArrayList<>();
    }

    public static CityRepository getRepository() {
        if (repository == null) {
            repository = new CityRepository();
        }
        return repository;
    }


    @Override
    public City save(City city) {
        City saveCity = read(city.getId());
        if (saveCity != null) {
            cityDB.remove(saveCity);
            cityDB.add(city);
        } else{
            cityDB.add(city);
            return city;
        }
        return null;
    }


    @Override
    public City read (String id){
        City city = this.cityDB.stream()
                .filter(c -> c.getId().equals(id))
                .findAny()
                .orElse(null);

        return city;
    }

   @Override
    public City delete (City city){
        this.cityDB.remove(city);
        return null;
    }

    @Override
    public List<City> getAll () {
        return this.cityDB;
    }
}
