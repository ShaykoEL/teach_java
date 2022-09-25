package by.step.teach_java.classwork.classwork_220922.Task3;

import by.step.teach_java.classwork.classwork_220922.Task1.Country;
import by.step.teach_java.classwork.classwork_220922.Task2.City;

public class Main {
    public static void main (String[] arg) {
        City vitebsk = new City();
        vitebsk.setName("Vitebsk");
        vitebsk.setCountry("Belarus");
        vitebsk.setCountOfPeople(15000);
        vitebsk.toString();

        City london = new City();
        london.setName("London");
        london.setCountry("USA");
        london.setCountOfPeople(32000);
        london.toString();

        City moscow = new City();
        moscow.setName("Moscow");
        moscow.setCountry("Russia");
        moscow.setCountOfPeople(2000000);
        moscow.toString();


        Country russia = new Country();
        russia.setContinent("Eurasia");
        russia.setName("Russia");
        russia.toString();

        Country usa = new Country();
        usa.setName("USA");
        usa.setContinent("America");
        usa.toString();
        System.out.println();

    }
}
