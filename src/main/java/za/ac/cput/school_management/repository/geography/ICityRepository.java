/**
 * ICityRepository.java
 * Interface for CityRepository
 * Author: Zintle Zothe(216130565)
 * Date: 14 June 2022
 */
package za.ac.cput.school_management.repository.geography;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.geography.City;


import java.util.List;

@Repository
public interface ICityRepository extends JpaRepository<City,String> {
    List<City> getAll();
    //public List<City> getCitiesGivenACountryId (String countryId);
    public List<City> findCityById(String cityId);

}