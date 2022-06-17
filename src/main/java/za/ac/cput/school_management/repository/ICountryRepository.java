package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Country;
import java.util.List;

public interface ICountryRepository extends IRepository<Country, String>{
    Country create(Country country);

    Country update(Country country);

    void delete(String id);

    List<Country> getAll();
}
