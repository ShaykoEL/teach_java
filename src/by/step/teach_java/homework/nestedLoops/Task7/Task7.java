package by.step.teach_java.homework.nestedLoops.Task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to expand");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        while (number != 0) {
            count = count * 10 + (number % 10);
            number = number / 10;
        }
        System.out.println(count);
    }
}
