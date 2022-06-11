/**
 * StudentAddress.java
 * Entity class for StudentAddress
 * Author:Zintle Zothe(216130565)
 * Date:  9 June 2022
 */
package za.ac.cput.school_management.domain;

import java.util.Objects;

public class StudentAddress {
    private String studentId;
    private Address address;



    private StudentAddress(){
    }

    private StudentAddress(Builder builder){
        this.studentId=builder.studentId;
        this.address=builder.address;
    }

    //getters
    public String getStudentId() {
        return studentId;
    }

    public Address getAddress() {
        return address;
    }

    //builder
    public static class Builder{
        private String studentId;
        private Address address;

        public Builder studentId(String studentId){
            this.studentId=studentId;
            return this;
        }

        public Builder address(Address address){
            this.address=address;
            return this;
        }

        public StudentAddress build(){
            return new StudentAddress(this);
        }

        public Builder copy(StudentAddress studentAddress){
            this.studentId=studentAddress.studentId;
            this.address=studentAddress.address;
            return this;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentAddress that = (StudentAddress) o;
        return studentId.equals(that.studentId) && address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, address);
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "studentId='" + studentId + '\'' +
                ", address=" + address +
                '}';
    }

}
