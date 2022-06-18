package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Country;
import za.ac.cput.school_management.repository.CountryRepository;

import java.util.List;
import java.util.Optional;



public class CountryService  implements ICountryService{

    private static CountryService countryService;
    private CountryRepository repository ;

    private CountryService(){
        this.repository = CountryRepository.getRepository();
    }

    public static CountryService getCountryService(){
        if(countryService == null )
            countryService = new CountryService();
        return countryService;
    }

    public Country save(Country country){
        return this.repository.save(country);
    }

    public Optional<Country>read(String id){
        return this.repository.read(id);
    }

    public void delete(Country country){
        this.repository.delete(country);
    }

    public List<Country> getAll(){
        return this.repository.getAll();
    }
}