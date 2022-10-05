package by.step.teach_java.homework.nestedLoops.Task5.Task4;

import java.util.Scanner;

public class Task4_empty {
    public static void main(String[] args) {
        System.out.print("Enter 1/2 h the figure ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int i = 0; i < h-1; i++) {
            //верх пусто слева
            for (int j = h-1; j > i; j--) {
                System.out.print(" ");
            }
            //левый верхний треугольник
            for (int k = 0; k < i; k++) {
                if (k == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //правый верхний треугольник
            for (int j = 0; j < i + 1; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //верх пусто справа
            for (int j = h; j > i; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = h-1; i >= 0; i--) {
            //низ пусто слева
            for (int j = h-1; j > i; j--) {
                System.out.print(" ");
            }
            //левый нижний треугольник
            for (int k = 0; k <= i; k++) {
                if (k == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //правый нижний треугольник
            for (int j = 1; j < i + 1; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //низ пусто справа
            for (int j = h; j > i; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

