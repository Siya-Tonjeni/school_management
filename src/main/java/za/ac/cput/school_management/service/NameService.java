package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.repository.NameRepository;

import java.util.ArrayList;
import java.util.List;

public class NameService implements INameService{

    private final NameRepository repository ;

    private static NameService service;

    private NameService(){
        this.repository = NameRepository.getRepository();
    }

    public static NameService getRepository(){
        if(service == null){
            service = new NameService();
        }
        return service;
    }

    @Override
    public Name save(Name name) {
        return this.repository.save(name);
    }

    @Override
    public Name read(Name.NameId nameId) {
        return this.repository.read(nameId);
    }

    @Override
    public Name delete(Name name) {
        return this.repository.delete(name);
    }

    @Override
    public List<Name> getAll() {
        return this.repository.getAll();
    }
}
