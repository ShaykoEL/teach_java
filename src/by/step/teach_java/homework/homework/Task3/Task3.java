package by.step.teach_java.homework.homework.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Input an animal");
        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine();
        switch (animal) {
            case ("cat"): {
                System.out.println("Meow");
                break;
        }
            case ("dog"): {
                System.out.println("Woof");
                break;
            }
            case ("snake"): {
                System.out.println("ShShSh");
                break;
            }
            case ("cow"): {
                System.out.println("Moo");
                break;
            }
            case ("pig"): {
                System.out.println("Grunt");
                break;
            }
            case ("mouse"): {
                System.out.println("PiPiPi");
                break;
            }
            case ("hens"): {
                System.out.println("cluck");
                break;
            }
            case ("duck"): {
                System.out.println("quack");
                break;
            }
            case ("ship"): {
                System.out.println("ba-a-ba-a");
                break;
            }
            case ("crow"): {
                System.out.println("Caw-caw");
                break;
            }
    }
}}
