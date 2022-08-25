package by.step.teach_java.classwork.classwork_250822.task1;

import java.util.Scanner;

public class People {
    private Scanner scanner = new Scanner(System.in);
    private String fio;
    private String dateOfBird;
    private String phone;
    private String city;
    private String country;
    private String homeAddress;


    public String getFio() {
        return fio;
    }

    public void setFio() {
        System.out.print("Input FIO");
        this.fio = scanner.nextLine();
    }

    public String getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird() {
        System.out.println("Input date of bird");
        this.dateOfBird = scanner.nextLine();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        System.out.println("Input phone");
        this.phone = scanner.nextLine();
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        System.out.println("Input city");
        this.city = scanner.nextLine();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry() {
        System.out.println("Input country");
        this.country = scanner.nextLine();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress() {
        System.out.println("Input home address");
        this.homeAddress = scanner.nextLine();
    }
}
