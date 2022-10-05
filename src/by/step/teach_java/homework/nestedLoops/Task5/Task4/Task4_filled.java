package by.step.teach_java.homework.nestedLoops.Task5.Task4;

import java.util.Scanner;

public class Task4_filled {
    public static void main(String[] args) {
        System.out.print("Enter 1/2 h the figure  ");
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        //печатаем верхнюю половину
        for (int i = 1; i <= h ; i++) {
            for (int j = i; j < h ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //печатаем нижнюю половину
        for (int i = h - 1; i >= 1 ; i--) {
            for (int j = h; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


