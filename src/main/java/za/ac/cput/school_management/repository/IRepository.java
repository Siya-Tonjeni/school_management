package za.ac.cput.school_management.repository;

public interface IRepository<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    T delete(T t);
}
