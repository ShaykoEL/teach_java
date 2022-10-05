package by.step.teach_java.homework.homework.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Day ");
        Scanner scanner1 = new Scanner(System.in);
        int day = scanner1.nextInt();
        if (day <= 0 || day >= 32) {
            System.err.println("Incorrect day input");
            System.exit(1);
        }
        System.out.print("Month  ");
        Scanner scanner2 = new Scanner(System.in);
        int month = scanner2.nextInt();

        System.out.print("Year  ");
        Scanner scanner3 = new Scanner(System.in);
        int year = scanner2.nextInt();
        int yeartype =year%12;

        if (day >= 20 && day <= 31 && month == 1) {
            System.out.println("Sign: Aquarius");
        } else if (day >=1 && day <= 18 && month == 2) {
            System.out.println("Sign: Aquarius");
        } else if (day >=19 && day <=29 && month == 2) {
            System.out.println("Sign: Pisces");
        } else if (day>=1 && day<=20 && month ==3){
            System.out.println("Sign: Pisces");
        } else if (day >=21 && day <=31 && month == 3) {
            System.out.println("Sign: Aries");
        } else if (day>=1 && day<=19 && month ==4){
            System.out.println("Sign: Aries");
        } else if (day >=20 && day <=30 && month == 4) {
            System.out.println("Sign: Taurus");
        } else if (day>=1 && day<=20 && month ==5){
            System.out.println("Sign: Taurus");
        } else if (day >=21 && day <=31 && month == 5) {
            System.out.println("Sign: Gemini");
        } else if (day>=1 && day<=21 && month ==6){
            System.out.println("Sign: Gemini");
        } else if (day >=22 && day <=30 && month == 6) {
            System.out.println("Sign: Cancer");
        } else if (day>=1 && day<=22 && month ==7){
            System.out.println("Sign: Cancer");
        } else if (day >=23 && day <=31 && month == 7) {
            System.out.println("Sign: Leo");
        } else if (day>=1 && day<=22 && month ==8){
            System.out.println("Sign: Leo");
        } else if (day >=23 && day <=31 && month == 8) {
            System.out.println("Sign: Virgo");
        } else if (day>=1 && day<=22 && month ==9){
            System.out.println("Sign: Virgo");
        } else if (day >=23 && day <=30 && month == 9) {
            System.out.println("Sign: Libra");
        } else if (day>=1 && day<=22 && month ==10){
            System.out.println("Sign: Libra");
        } else if (day >=23 && day <=31 && month == 10) {
            System.out.println("Sign: Scorpio");
        } else if (day>=1 && day<=21 && month ==11){
            System.out.println("Sign: Scorpio");
        } else if (day >=22 && day <=30 && month == 11) {
            System.out.println("Sign: Sagittarius");
        } else if (day>= 1 && day<=21 && month ==12){
            System.out.println("Sign: Sagittarius");
        } else if (day >=22 && day <=31 && month == 12) {
            System.out.println("Sign: Capricorn");
        } else if (day>=1 && day<=19 && month ==1){
            System.out.println("Sign: Capricorn");
        }
        switch (yeartype) {
            case 0: {
                System.out.println("Year: Monkey");
                break;
            }
            case 1: {
                System.out.println("Year: Rooster");
                break;
            }
            case 2: {
                System.out.println("Year: Dog");
                break;
            }
            case 3: {
                System.out.println("Year: Pig");
                break;
            }
            case 4: {
                System.out.println("Year: Rat");
                break;
            }
            case 5: {
                System.out.println("Year: Bull");
                break;
            }
            case 6: {
                System.out.println("Year: Tiger");
                break;
            }
            case 7: {
                System.out.println("Year: Rabbit");
                break;
            }
            case 8: {
                System.out.println("Year: Dragon");
                break;
            }
            case 9: {
                System.out.println("Year: Snake");
                break;
            }
            case 10: {
                System.out.println("Year: Horse");
                break;
            }
            case 11: {
                System.out.println("Year: Goat");
                break;
            }
            default: {
                System.out.println("Error");
            }
        }

    }
}