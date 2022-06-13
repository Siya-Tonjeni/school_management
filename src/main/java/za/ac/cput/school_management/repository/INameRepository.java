package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Name;
import java.util.List;

public interface INameRepository extends IRepository<Name, String>{

    public List<Name> getAll();

    //public Name read(String string, String string1);
}
