package by.step.teach_java.classwork.classwork_220922_city_country.Task3;

import by.step.teach_java.classwork.classwork_220922_city_country.Task3.Task1.Country;
import by.step.teach_java.classwork.classwork_220922_city_country.Task2.City;

public class Main {
    public static void main (String[] arg) {
        City vitebsk = new City();
        vitebsk.setName("Vitebsk ");
        vitebsk.setCountry("Belarus");
        vitebsk.setCountOfPeople(15000);

        City newYork = new City();
        newYork.setName("New York ");
        newYork.setCountry("USA");
        newYork.setCountOfPeople(32000);

        City moscow = new City();
        moscow.setName("Moscow ");
        moscow.setCountry("Russia");
        moscow.setCountOfPeople(2000000);

        Country russia = new Country();
        russia.setContinent("Eurasia ");
        russia.setName("Russia");

        Country usa = new Country();
        usa.setName("USA");
        usa.setContinent("America ");

        System.out.println(vitebsk.toString());
        System.out.println(newYork.toString());
        System.out.println(moscow.toString());
        System.out.println(russia);
        System.out.println(usa.toString());

    }
}
