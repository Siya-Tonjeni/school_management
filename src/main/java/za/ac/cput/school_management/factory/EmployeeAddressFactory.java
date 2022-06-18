
/*
EmployeeAddress.java
Entity class for EmployeeAddress
Student: Nikiwe Mkontshwana
Student Number: 214236714
Date: 11 June 2022
*/

package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.EmployeeAddress;
import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.util.helper;

public class EmployeeAddressFactory {
    public static EmployeeAddress build(Address address) {

        String staffId = helper.generateUUID();
        return new EmployeeAddress.Builder()
                .setStaffId(staffId)
                .setAddress(address)
                .build();
    }

    }


