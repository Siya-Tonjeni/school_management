/**
 * Name.java
 * Entity class for Name
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 15 June 2022
 */

package za.ac.cput.school_management.domain.user;

import javax.persistence.Embeddable;
import java.util.Objects;
//@Entity
//@IdClass(Name.NameId.class)
@Embeddable
public class Name {

    //@NotNull
    // @Id
    private String fistName, lastName;

    //@NotNull
    private String middleName;


    //getters

    protected Name(){}

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

//    public Name(String firstName, String lastName, String middleName){
//        this.fistName = firstName;
//        this.lastName = lastName;
//        this.middleName = middleName;
//    }

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

//    public static class NameId implements Serializable {
//        @Id private String fistName;
//        @Id private String lastName;
//
//        protected NameId(){}
//
//        public NameId(String fistName, String lastName) {
//            this.fistName = fistName;
//            this.lastName = lastName;
//        }
//
//        public String getFistName() {
//            return fistName;
//        }
//
//        public String getLastName() {
//            return lastName;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            NameId nameId = (NameId) o;
//            return fistName.equals(nameId.fistName) && lastName.equals(nameId.lastName);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(fistName, lastName);
//        }
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return fistName.equals(name.fistName) && middleName.equals(name.middleName) && lastName.equals(name.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, middleName, lastName);
    }
}
