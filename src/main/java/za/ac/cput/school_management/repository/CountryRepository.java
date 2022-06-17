package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Country;

import java.util.*;
import java.util.Optional;

public class CountryRepository implements ICountryRepository{
    public static CountryRepository repository = null;
    private List<Country> countryDB = null;

    private CountryRepository(){
        countryDB = new ArrayList<>();
            }

    public static CountryRepository getRepository() {
        if (repository == null) {
            repository = new CountryRepository();
        }
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

    //@Override
    public Country create(Country country) {
        this.countryDB.add(country);
        return country;
    }


    //@Override
    public Optional<Country> read(String id) {
        for (Country ctr : countryDB){
            if (ctr.getId().equals(id)){
                return Optional.of(ctr);
            }
        }
        return null;
    }

    //@Override
    public void delete(Country country) {

    }

   // @Override
    public Country update(Country country) {
        Optional<Country> ctr1 = read(country.getId());
        if (ctr1 != null){
            countryDB.remove(ctr1);
            countryDB.add(country);
            return country;
        }
        return null;
    }

    //@Override
    public void delete(String id) {
        Optional<Country> deleteCountry = read((id));
        if (deleteCountry == null)
            System.out.println("Country is null");
            countryDB.remove(deleteCountry);
    }

    //@Override
    public List<Country> getAll() {
        return countryDB;
    }
}
