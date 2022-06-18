/**
 * CityController.java
 * controller for City
 * Author: Zintle Zothe(216130565)
 * Date: 14 June 2022
 */
package za.ac.cput.school_management.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.service.CityService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("school-management/City/")

public class CityController {
    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService){
        this.cityService=cityService;
    }

   @GetMapping("cities/{id}")
   //get a list of cities in a country given countryId
   public ResponseEntity<List<City>> getCitiesGivenACountryId(@PathVariable String countryId){
        List<City> cities=this.cityService.getCitiesGivenACountryId(countryId);
        return ResponseEntity.ok(cities);
   }
}
