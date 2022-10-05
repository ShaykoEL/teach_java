package by.step.teach_java.homework.nestedLoops.Task1;

import java.util.Scanner;

public class Filled {
    public static void main(String[] args) {
        System.out.print("Enter h the figure ");
        Scanner sc1 = new Scanner(System.in);
        int h = sc1.nextInt();
        for (int i = 0; i <= h; i++) {
            for (int j = h; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}


