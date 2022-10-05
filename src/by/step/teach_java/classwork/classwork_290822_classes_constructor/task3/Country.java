package by.step.teach_java.classwork.classwork_290822_classes_constructor.task3;

import by.step.teach_java.classwork.classwork_290822_classes_constructor.task2.City;

public class Country {

    private String theNameOfTheCountry;
    private String nameOfTheContinent;
    private int numberOfInhabitantsInTheCountry;
    private String nameOfTheCapital;
    private String nameOfCitiesInTheCountry;
    private City [] cities;

    public Country(String theNameOfTheCountry, String nameOfTheContinent, int numberOfInhabitantsInTheCountry) {
        this.theNameOfTheCountry = theNameOfTheCountry;
        this.nameOfTheContinent = nameOfTheContinent;
        this.numberOfInhabitantsInTheCountry = numberOfInhabitantsInTheCountry;
    }
    public Country(String theNameOfTheCountry, String nameOfTheContinent, int numberOfInhabitantsInTheCountry, String nameOfTheCapital) {
        this.theNameOfTheCountry = theNameOfTheCountry;
        this.nameOfTheContinent = nameOfTheContinent;
        this.numberOfInhabitantsInTheCountry = numberOfInhabitantsInTheCountry;
        this.nameOfTheCapital = nameOfTheCapital;
    }
    public Country(String theNameOfTheCountry, String nameOfTheContinent, int numberOfInhabitantsInTheCountry, String nameOfTheCapital, String nameOfCitiesInTheCountry, City [] cities) {
        this.theNameOfTheCountry = theNameOfTheCountry;
        this.nameOfTheContinent = nameOfTheContinent;
        this.numberOfInhabitantsInTheCountry = numberOfInhabitantsInTheCountry;
        this.nameOfTheCapital = nameOfTheCapital;
        this.nameOfCitiesInTheCountry = nameOfCitiesInTheCountry;
        this.cities = cities;
    }
}
