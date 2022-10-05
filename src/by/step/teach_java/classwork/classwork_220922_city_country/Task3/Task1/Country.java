package by.step.teach_java.classwork.classwork_220922_city_country.Task3.Task1;

import java.util.Objects;

public class Country {
    private String name;
    private String continent;

    public void setName(String name){
        this.name = name;
    }

    public void setContinent(String continent) {
       this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name) && Objects.equals(continent, country.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, continent);
    }

    @Override
    public String toString() {
        return "Country: " + name + ", continent= " + continent;
    }
}
