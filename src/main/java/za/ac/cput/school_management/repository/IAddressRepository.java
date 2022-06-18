/*
 * IAddressRepository.java
 * Interface Repository class for Address class
 * Author: Siyamtanda Tonjeni(217107958)
 * Date: 11 June 2022
 */
package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Address;
import java.util.List;


public interface IAddressRepository extends IRepository<Address, String> {
    List<Address> getAll();
}
