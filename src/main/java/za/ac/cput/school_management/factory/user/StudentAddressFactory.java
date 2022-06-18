/**
 * StudentFactory.java
 * Factory class for StudentAddress
 * Author:Zintle Zothe(216130565)
 * Date:  10 June 2022
 */
package za.ac.cput.school_management.factory.user;
import za.ac.cput.school_management.domain.geography.Address;
import za.ac.cput.school_management.domain.user.StudentAddress;
import za.ac.cput.school_management.util.helper;

public class StudentAddressFactory {
    public static StudentAddress createStudentAddress(String studentId, Address address){
        helper.checkStringParam("studentId", studentId);

        //check if address is null
        if(address==null)
            throw new IllegalArgumentException("Please insert address: ");

        return new StudentAddress.Builder().studentId(studentId)
                .address(address)
                .build();

    }
}
