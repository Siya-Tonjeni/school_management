/**
 * NameFactory.java
 * Factory class for Name class
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 June 2022
 */
package za.ac.cput.school_management.factory;
import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.util.helper;

public class EmployeeFactory {
    public static Employee build( String email, Name name){

        String staffId = helper.generateUUID();
        return new Employee.Builder()
                .setStaffId(staffId)
                .setEmail(email)
                .setName(name)
                .build();
    }
}
