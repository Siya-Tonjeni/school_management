package za.ac.cput.school_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.service.CountryService;
import java.util.List;


    @RestController
    @RequestMapping("school-management/country/")
    public class CountryController {

        private CountryService countryService;

        @Autowired
        public CountryController(CountryService countryService){
            this.countryService = countryService;
        }

        @PostMapping("save")
        public ResponseEntity<Country> save(Country country){
            Country save = countryService.save(country);
            System.out.println("save");
            return ResponseEntity.ok(save);
        }

        @GetMapping("read/{id}")
        public ResponseEntity<Country> read(@PathVariable Country id){
            Country read = countryService.read(String.valueOf(id)).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
            return ResponseEntity.ok(read);
        }

        @DeleteMapping("delete")
        public ResponseEntity<Void> delete(Country country){
            this.countryService.delete(country);
            return ResponseEntity.noContent().build();
        }

        @GetMapping("all")
        public ResponseEntity<List<Country>> getAll(){
            List<Country> country = this.countryService.getAll();
            return ResponseEntity.ok(country);
        }
    }



