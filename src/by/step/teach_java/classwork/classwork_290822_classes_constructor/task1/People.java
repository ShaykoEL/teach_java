package by.step.teach_java.classwork.classwork_290822_classes_constructor.task1;

import java.time.LocalDate;
import java.util.Scanner;

public class People {
    private Scanner scanner = new Scanner(System.in);
    private String fio;
    private LocalDate dateOfBird;
    private int phone;
    private String city;
    private String country;
    private String homeAddress;

    public People(String fio, LocalDate dateOfBird, int phone){
        this.fio = fio;
        this.dateOfBird = dateOfBird;
        this.phone = phone;
    }
    public People(String fio, LocalDate dateOfBird, int phone, String city, String country){
        this.fio = fio;
        this.dateOfBird = dateOfBird;
        this.phone = phone;
        this.city = city;
        this.country = country;
    }
    public People(String fio, LocalDate dateOfBird, int phone, String city, String country, String homeAddress){
        this.fio = fio;
        this.dateOfBird = dateOfBird;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }
}
