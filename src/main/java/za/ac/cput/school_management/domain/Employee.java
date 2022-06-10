/**
 * Employee.java
 * Entity class for Employee
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 June 2022
 */
package za.ac.cput.school_management.domain;

public class Employee {

    private String staffId;
    private String email;
    private Name name;

    //getters

    public String getStaffId(){
        return staffId;
    }

    public String getEmail(){
        return email;
    }

    public Name getName(){
        return name;
    }

    private Employee(Builder builder){
        this.staffId = builder.staffId;
        this.email = builder.email;
        this.name = builder.name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "staffId='" + staffId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                '}';
    }

    // Builder class

    public static class Builder{
        private String staffId;
        private String email;
        private Name name;

        public Builder setStaffId(String staffId){
            this.staffId = staffId;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setName(Name name){
            this.name = name;
            return this;
        }

        public Builder copy(Employee employee){
            this.staffId = employee.staffId;
            this.email = employee.email;
            this.name = employee.name;
            return this;
        }

        public Employee build(){
            return new Employee(this);}
    }
}
