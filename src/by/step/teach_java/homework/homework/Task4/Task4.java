package by.step.teach_java.homework.homework.Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Input coordinate x:  ");
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        System.out.print("Input coordinate y:  ");
        Scanner sc2 = new Scanner(System.in);
        int y = sc2.nextInt();

        if (x >= 0 && y >= 0) {
            System.out.println("I");
        }  else if (x < 0 && y >= 0) {
            System.out.println("II");
        } else if (x < 0 && y < 0) {
            System.out.println("III");
        } else if (x >= 0 && y < 0) {
            System.out.println("IV");
        }

    }
}