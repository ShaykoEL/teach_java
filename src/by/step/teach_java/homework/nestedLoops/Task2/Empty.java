package by.step.teach_java.homework.nestedLoops.Task2;

import java.util.Scanner;

public class Empty {
    public static void main(String[] args) {
        System.out.println("Enter h the figure ");
        Scanner sc1 = new Scanner(System.in);
        int h = sc1.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j1 = h; j1 > i; j1--) {
                if (j1 == h || j1 == i + 1 || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

