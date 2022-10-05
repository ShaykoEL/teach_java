package by.step.teach_java.homework.nestedLoops.Task3;

import java.util.Scanner;

public class Empty {
    public static void main(String[] args) {
        System.out.print("Enter h the figure ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        //Вывести равнобедренный треугольник
        for (int i = 0; i < h; i++) {
            //Пусто слева
            for (int j = h; j > i; j--) {
                System.out.print(" ");
            }
            //левый треугольник
            for (int j1 = 0; j1 < i; j1++) {
                if (j1 == 0 || i == h - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //правый треугольник
            for (int j = 0; j < i + 1; j++) {
                if (j == i || i == h - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
                    }
    }
}
