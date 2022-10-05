package by.step.teach_java.homework.nestedLoops.Task5;

import java.util.Scanner;

public class Empty {
    public static void main(String[] args) {
        System.out.print("Enter h the figure ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int j = 0; j < 2 * h-1; j++) {
            if (j >= h-1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 1; i < h - 1; i++) {
            for (int j = 0; j < 2 * h-i; j++) {
                if (j == h - i - 1 || j == (2 * h) - i - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int j = 1; j < 2 * h; j++) {
            if (j <= h) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}
