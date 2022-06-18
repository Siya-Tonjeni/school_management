/**
 * IService.java
 * Interface  for EmployeeFactory
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 15 June 2022
 */
package za.ac.cput.school_management.service;

import java.util.Optional;

public interface IService<T, ID> {

    T save(T t);
    Optional<T> read(ID id);

    void delete(T t);

}
