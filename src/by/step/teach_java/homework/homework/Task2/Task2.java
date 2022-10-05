package by.step.teach_java.homework.homework.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input the time");
        int time = sc.nextInt();
        if (time >= 0 && time < 6) {
            System.out.println("Good night");
        }
        else if (time >= 6 && time < 12) {
            System.out.println("Good morning");
        }
        else if (time >= 12 && time < 17) {
            System.out.println("Good afternoon");
        }
        else if (time >= 17 && time < 23) {
            System.out.println("Good evening");
        }
        else if (time > 24 || time < 0 ) {
            System.out.println("How are yuo?");
        }
    }
}
