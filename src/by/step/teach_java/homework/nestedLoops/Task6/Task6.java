package by.step.teach_java.homework.nestedLoops.Task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Enter h the ladder ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        for (int i = 1; i <= h; ++i) {

            for (int j = 1; j < i; ++j) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 3; ++j) {
                System.out.print("*");
            }
            System.out.println("");
            for (int j = 1; j < i + 1; ++j) {
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println("");
        }
    }
}

