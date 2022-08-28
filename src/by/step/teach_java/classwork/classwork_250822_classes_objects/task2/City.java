package by.step.teach_java.classwork.classwork_250822_classes_objects.task2;

import java.util.Scanner;

public class City {
    private Scanner scanner = new Scanner(System.in);
    private String cityName;
    private String regionName;
    private String countryName;
    private String numberOfInhabitantsInTheCity;
    private String cityPostalCode;
    private String telephoneAreaCode;

    public String getCityName() {
        return cityName;
    }

    public void setCityName() {
        System.out.print("Input city name");
        this.cityName = scanner.nextLine();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName() {
        System.out.print("Input region name");
        this.regionName = scanner.nextLine();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName() {
        System.out.println("Input country name");
        this.countryName = scanner.nextLine();
    }

    public String getNumberOfInhabitantsInTheCity() {
        return numberOfInhabitantsInTheCity;
    }

    public void setNumberOfInhabitantsInTheCity() {
        System.out.println("Input number of inhabitants in the city");
        this.numberOfInhabitantsInTheCity = scanner.nextLine();
    }

    public String getCityPostalCode() {
        return cityPostalCode;
    }

    public void setCityPostalCode() {
        System.out.println("Input city postal code");
        this.cityPostalCode = scanner.nextLine();
    }

    public String getTelephoneAreaCode() {
        return telephoneAreaCode;
    }

    public void setTelephoneAreaCode() {
        System.out.println("Input telephone area code");
        this.telephoneAreaCode = scanner.nextLine();
    }
}
