/**
 * IService.java
 * Interface  for EmployeeFactory
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 15 June 2022
 */
package za.ac.cput.school_management.service;

public interface IService<T, ID> {

    T save(T t);
    T read(ID id);

    T delete(T t);

}
