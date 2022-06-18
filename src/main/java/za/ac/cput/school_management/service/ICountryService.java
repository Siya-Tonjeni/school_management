package za.ac.cput.school_management.service;


import za.ac.cput.school_management.domain.Country;

import java.util.List;

public interface ICountryService extends IService<Country, String>{
        List<Country> getAll();
}
