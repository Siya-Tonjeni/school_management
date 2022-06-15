package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Name;
import java.util.List;

public interface INameRepository extends IRepository<Name, Name.NameId>{

    public List<Name> getAll();


}
