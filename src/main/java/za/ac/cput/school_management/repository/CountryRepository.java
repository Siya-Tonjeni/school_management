package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Country;

import java.util.*;
import java.util.Optional;

public class CountryRepository implements ICountryRepository{
    private static CountryRepository repository = null;
    private List<Country> countryDB = null;

    private CountryRepository(){
        countryDB = new ArrayList<>();
            }

    public static CountryRepository getRepository() {
        if (repository == null)
            repository = new CountryRepository();
        return repository;
    }

    @Override
    public Country save(Country country) {
        Optional<Country> read = read(country.getId());
        if(read.isPresent()){
            delete(read.get());
        }
        this.countryDB.add(country);
        return country;
    }

    @Override
    public Optional<Country> read(String id) {
        return this.countryDB.stream()
                .filter(s->s.getId().equalsIgnoreCase(id))
                .findFirst();
    }

    @Override
    public void delete(Country country) {
    this.countryDB.remove(country);
    }

    @Override
    public List<Country> getAll() {
        return countryDB;
    }
}
