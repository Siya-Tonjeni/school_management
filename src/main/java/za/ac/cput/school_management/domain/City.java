/**
 * City.java
 * Entity class for City
 * Author:Zintle Zothe(216130565)
 * Date:  9 June 2022
 */
package za.ac.cput.school_management.domain;

import java.util.Objects;

public class City {
    private String id;
    private String name;
    private Country country;

    private City(){

    }

    private City(Builder builder){
        this.id=builder.id;
        this.name=builder.name;
        this.country=builder.country;
    }

    //getters

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    //builder
    public static class Builder{
        private String id;
        private String name;
        private Country country;

        public Builder setId(String id){
            this.id=id;
            return this;
        }
        public Builder setName(String name){
            this.name=name;
            return this;
        }
        public Builder setCountry(Country country){
            this.country=country;
            return this;
        }

        public City build(){
            return new City(this);
        }

        public Builder copy(City city){
            this.id=city.id;
            this.name=city.name;
            this.country=city.country;
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return id.equals(city.id) && name.equals(city.name) && country.equals(city.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country);
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}
