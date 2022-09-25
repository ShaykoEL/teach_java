package by.step.teach_java.classwork.classwork_290822_classes_constructor.task2;

import by.step.teach_java.classwork.classwork_290822_classes_constructor.task1.People;

import java.util.Scanner;

public class City {
    private Scanner scanner = new Scanner(System.in);
    private String cityName;
    private String regionName;
    private String countryName;
    private int numberOfInhabitantsInTheCity;
    private int cityPostalCode;
    private int telephoneAreaCode;
    private People [] peoples;

    public City(String cityName, String regionName, String countryName) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
    }
    public City(String cityName, String regionName, String countryName, int numberOfInhabitantsInTheCity, int cityPostalCode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.numberOfInhabitantsInTheCity = numberOfInhabitantsInTheCity;
        this.cityPostalCode = cityPostalCode;
    }
    public City(String cityName,
                String regionName,
                String countryName,
                int numberOfInhabitantsInTheCity,
                int cityPostalCode,
                int telephoneAreaCode,
                People [] peoples) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.numberOfInhabitantsInTheCity = numberOfInhabitantsInTheCity;
        this.cityPostalCode = cityPostalCode;
        this.telephoneAreaCode = telephoneAreaCode;
        this.peoples = peoples;
    }
}
