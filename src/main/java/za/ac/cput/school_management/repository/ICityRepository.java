/**
 * ICityRepository.java
 * Interface for CityRepository
 * Author: Zintle Zothe(216130565)
 * Date: 14 June 2022
 */
package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.City;


import java.util.List;

public interface ICityRepository extends IRepository<City,String> {
    List<City> getAll();
}