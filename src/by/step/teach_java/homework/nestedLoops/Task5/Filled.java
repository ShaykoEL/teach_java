package by.step.teach_java.homework.nestedLoops.Task5;

import java.util.Scanner;

public class Filled {
    public static void main(String[] args) {
        System.out.print("Enter h the figure ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= h; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
