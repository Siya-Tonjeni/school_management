/**
 * Name.java
 * Entity class for Name
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 June 2022
 */

package za.ac.cput.school_management.domain;

public class Name {

    private String fistName;
    private String middleName;
    private String lastName;

    //getters

    public String getFistName(){
        return fistName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "fistName='" + fistName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    private Name(Builder builder){
        this.fistName = builder.fistName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    public static class Builder{
        private String fistName;
        private String middleName;
        private String lastName;

        public Builder setFirstName(String firstName){
            this.fistName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Name name){
            this.fistName = name.fistName;
            this.middleName = name.middleName;
            this.lastName = name.lastName;
            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }
}
