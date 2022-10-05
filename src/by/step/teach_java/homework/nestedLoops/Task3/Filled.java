package by.step.teach_java.homework.nestedLoops.Task3;

import java.util.Scanner;

public class Filled {
    public static void main(String[] args) {
        System.out.print("Enter h the figure  ");
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        //Вывести равнобедренный треугольник
        for (int i = 0; i <= h; i++) {
            //пусто слева
            for (int j = 0; j <= h - i; j++) {
                System.out.print(" ");
            }
            //распределение *
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}


