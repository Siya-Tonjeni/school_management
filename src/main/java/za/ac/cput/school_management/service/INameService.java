package za.ac.cput.school_management.service;
import za.ac.cput.school_management.domain.Name;

import java.util.List;

public interface INameService extends IService<Name, Name.NameId>{

    List<Name> getAll();
}
