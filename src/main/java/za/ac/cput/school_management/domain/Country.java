package za.ac.cput.school_management.domain;

/**
 * Country.java
 * Entity class for Country
 * Author: Abongile Tshopi (214254151)
 * Date Created: 9 June 2022
 *
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
//import javax.util.Object;
@NotNull
@Entity
public class Country {
   // @NotNull @Id private String id;

    //Add the @Entity ontop of the class and add @NotNull to String id and name

    @Id private String id;
     private String name;

    protected Country() {
    }


    public String getId(){
        return id;
    }

public String getName(){
        return name;
    }

private Country(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
    }

 @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name=" + name +
                '}';
    }

// Builder class

    public static class Builder{
        private String id;
        private String name;

        public Builder setId(String id){
            this.id = id;
            return this;
        }

 	public Builder setName(String name){
            this.name = name;
            return this;
        }

public Builder copy(Country country){
            this.id = country.id;
            this.name = country.name;
            return this;
        }

   public Country build(){
            return new Country(this);
    }
  }
}
