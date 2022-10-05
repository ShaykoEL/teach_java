package by.step.teach_java.homework.homework.Task11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("ax^2 + bx + c = 0");
        System.out.print("Enter A ");
        Scanner scanner1 = new Scanner(System.in);
        double a = scanner1.nextDouble();
        System.out.print("Enter B ");
        Scanner scanner2 = new Scanner(System.in);
        double b = scanner2.nextDouble();
        System.out.print("Enter C ");
        Scanner scanner3 = new Scanner(System.in);
        double c = scanner3.nextDouble();
        double D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Roots: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Yas one root : x = " + x);
        }
        else {
            System.out.println("No roots");
        }
    }
}
