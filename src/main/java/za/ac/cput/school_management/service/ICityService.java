/**
 * ICityService.java
 * interface for CityService
 * Author: Zintle Zothe(216130565)
 * Date: 14 June 2022
 */
package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.City;

import java.util.List;

public interface ICityService extends IService<City,String> {
    List<City> getAll();
    public List<City> getCitiesGivenACountryId (String countryId);
    public List<City> findCityById(String cityId);
}
