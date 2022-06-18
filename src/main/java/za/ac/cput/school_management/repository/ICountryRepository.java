package za.ac.cput.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.school_management.domain.Country;
import java.util.List;

public interface ICountryRepository extends JpaRepository<Country, String> {
    List<Country> getAll();
}
