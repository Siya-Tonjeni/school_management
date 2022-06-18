/**
 * NameRepository.java
 * Repository for Name
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 15 June 2022
 */
//package za.ac.cput.school_management.repository;
//
//import za.ac.cput.school_management.domain.Name;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class NameRepository implements INameRepository{
//
//
//    public static NameRepository repository = null;
//
//    private List<Name> nameDB = null;
//
//    private NameRepository(){
//        nameDB = new ArrayList<>();
//    }
//
//    public static NameRepository getRepository(){
//        if(repository == null){
//            repository = new NameRepository();
//        }
//        return repository;
//    }
//
////    @Override
////    public Name create(Name name) {
////        nameDB.add(name);
////        return name;
////    }
//
//    @Override
//    public Name save(Name name){
//
//        Name.NameId nameId = new Name.NameId(name.getFistName(), name.getLastName());
//        Name readName = (read(nameId));
//        if (readName != null){
//            nameDB.remove(readName);
//            nameDB.add(name);
//        }
//        this.nameDB.add(name);
//        return name;
//    }
//    @Override
//    public Name read(Name.NameId nameId) {
//        Name readName = nameDB.stream().filter(n -> n.getFistName().equals(nameId.getFistName()))
//                .filter(n -> n.getLastName().equals(nameId.getLastName()))
//                .findFirst()
//                .orElse(null);
//        return readName;
//
//    }
//
////    public Name update(Name name){
////        Name oldName = read(name.getFistName());
////        if(oldName != null){
////            nameDB.remove(oldName);
////            nameDB.add(name);
////
////        }
////        return null;
////    }
//
//    @Override
//    public Name delete(Name name) {
//        Name.NameId nameId = new Name.NameId(name.getFistName(), name.getLastName());
//        Name deleteName = (read(nameId));
//        //Name deleteName = read(name.getFistName());
//        if(deleteName != null){
//            nameDB.remove(deleteName);
//        }
//        return null;
//    }
//
//    @Override
//    public List<Name> getAll() {
//        return nameDB;
//    }
//}
