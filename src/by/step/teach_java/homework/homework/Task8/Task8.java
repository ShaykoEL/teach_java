package by.step.teach_java.homework.homework.Task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("Enter X ");
        Scanner scanner1 = new Scanner(System.in);
        int x = scanner1.nextInt();
        System.out.print("Enter Y ");
        Scanner scanner2 = new Scanner(System.in);
        int y = scanner2.nextInt();
        int a = x % 2;
        int b = y % 2;

        if (a > 0 && b > 0){
            System.out.println("YES");
        }
        else if (a == 0 && b == 0){
            System.out.println("YES");
        }
        else {
            System.out.println("");
        }

    }
}

