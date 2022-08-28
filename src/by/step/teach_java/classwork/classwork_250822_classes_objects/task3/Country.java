package by.step.teach_java.classwork.classwork_250822_classes_objects.task3;

import java.util.Scanner;

public class Country {
    private Scanner scanner = new Scanner(System.in);

    private String theNameOfTheCountry;
    private String nameOfTheContinent;
    private String numberOfInhabitantsInTheCountry;
    private String nameOfTheCapital;
    private String nameOfCitiesInTheCountry;

    public String getTheNameOfTheCountry() {
        return theNameOfTheCountry;
    }

    public void setTheNameOfTheCountry() {
        System.out.println("Input the name of the country");
        this.theNameOfTheCountry = scanner.nextLine();
    }

    public String getNameOfTheContinent() {

        return nameOfTheContinent;
    }

    public void setNameOfTheContinent() {
        System.out.println("Input name of the continent");
        this.nameOfTheContinent = scanner.nextLine();
    }

    public String getNumberOfInhabitantsInTheCountry() {

        return numberOfInhabitantsInTheCountry;
    }

    public void setNumberOfInhabitantsInTheCountry() {
        System.out.println("Input number of inhabitants in the country");
        this.numberOfInhabitantsInTheCountry = scanner.nextLine();
    }

    public String getNameOfTheCapital() {
        return nameOfTheCapital;
    }

    public void setNameOfTheCapital() {
        System.out.println("Input name of the capital");
        this.nameOfTheCapital = scanner.nextLine();
    }

    public String getNameOfCitiesInTheCountry() {
        return nameOfCitiesInTheCountry;
    }

    public void setNameOfCitiesInTheCountry() {
        System.out.println("Input name of cities in the country");
        this.nameOfCitiesInTheCountry = scanner.nextLine();
    }
}
