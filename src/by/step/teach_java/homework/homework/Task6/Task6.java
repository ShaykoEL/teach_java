package by.step.teach_java.homework.homework.Task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Enter year:  ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        int count1 = year % 400;
        int count2 = year % 100;
        int count3 = year % 4;

        if (count3 < 1 && count2 >= 1){
            System.out.println("366");}
        else if (count1 < 1){
            System.out.println("366");}
        else {
            System.out.println("365");
        }

    }
}

