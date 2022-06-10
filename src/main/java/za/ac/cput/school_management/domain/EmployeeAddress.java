/*
    EmployeeAddress.java
    Entity class for EmployeeAddress
    Student: Nikiwe Mkontshwana
    Student Number: 214236714
    Date: 09 June 2022
 */

package za.ac.cput.school_management.domain;

public class EmployeeAddress {

    private String staffId;


    public EmployeeAddress() {
    }

    private EmployeeAddress(Builder builder) {

        this.staffId = builder.staffId;

    }

    public String getStaffId() {
        return staffId;
    }


    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "staffId='" + staffId + '\'' +

                '}';
    }

    public static class Builder {

        private String staffId;

        public Builder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }


        public Builder copy(EmployeeAddress employeeAddress) {
            this.staffId = employeeAddress.staffId;


            return this;
        }

        public EmployeeAddress build() {
            return new EmployeeAddress(this);
        }
    }
}
