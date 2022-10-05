package by.step.teach_java.homework.nestedLoops.Task1;

import java.util.Scanner;

public class Empty {
    public static void main(String[] args) {
        System.out.print("Enter h the figure  ");
        Scanner sc1 = new Scanner(System.in);
        int h = sc1.nextInt();
        for (int i = 0; i < h; i++) {
            for (int x = h; x > i; x--) {
                System.out.print(" ");
            }
            for (int j1 = 0; j1 < i + 1; j1++) {
                if (j1 == 0 || j1 == i || i == h - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}