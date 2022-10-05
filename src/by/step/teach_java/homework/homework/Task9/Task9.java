package by.step.teach_java.homework.homework.Task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.print("Enter starting X coordinate ");
        Scanner scanner1 = new Scanner(System.in);
        int x1 = scanner1.nextInt();
        System.out.print("Enter starting Y coordinate ");
        Scanner scanner2 = new Scanner(System.in);
        int y1 = scanner2.nextInt();
        System.out.print("Enter ending X coordinate ");
        Scanner scanner3 = new Scanner(System.in);
        int x2 = scanner1.nextInt();
        System.out.print("Enter ending Y coordinate ");
        Scanner scanner4 = new Scanner(System.in);
        int y2 = scanner2.nextInt();
        if (x2 > x1 && y2 > y1) {
            System.out.println("Climb");
        } else if (x2 > x1 && y2 < y1) {
            System.out.println("Descent");
        } else if (x2 >= x1 && y2 == y1) {
            System.out.println("Smooth road");
        } else if (x2 < x1) {
            System.out.println("Steep road");
        }
    }
}
