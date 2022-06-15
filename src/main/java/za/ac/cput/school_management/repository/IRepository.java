package za.ac.cput.school_management.repository;

public interface IRepository<T, ID> {


    T save(T t);
    T read(ID id);

    T delete(T t);
}
