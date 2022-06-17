/**
 * NameService.java
 * Test class for NameService
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 16 June 2022
 */
//package za.ac.cput.school_management.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import za.ac.cput.school_management.domain.Name;
//import za.ac.cput.school_management.repository.INameRepository;
////import za.ac.cput.school_management.repository.NameRepository;
//
//import java.util.ArrayList;
//import java.util.List;
//@Service
//public class NameService implements INameService{
//
//    private final INameRepository repository ;
//
//    //private static NameService service;
//
//    @Autowired private NameService(INameRepository repository){
//        this.repository = repository;
//    }
//
////    public static NameService getRepository(){
////        if(service == null){
////            service = new NameService();
////        }
////        return service;
////    }
//
//    @Override
//    public Name save(Name name) {
//        return this.repository.save(name);
//    }
//
//    @Override
//    public Name read(Name.NameId nameId) {
//        return this.repository.getById(nameId);
//    }
//
//    @Override
//    public void delete(Name name) {
//        this.repository.delete(name);
//    }
//
//    @Override
//    public List<Name> getAll() {
//        return this.repository.findAll();
//    }
//}
