package by.step.teach_java.homework.nestedLoops.Task2;

import java.util.Scanner;

public class Filled {
    public static void main(String[] args) {
        System.out.print("Enter h the figure ");
        Scanner sc1 = new Scanner(System.in);
        int h = sc1.nextInt();
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = h; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
