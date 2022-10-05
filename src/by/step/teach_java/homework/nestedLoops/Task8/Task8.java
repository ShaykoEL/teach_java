package by.step.teach_java.homework.nestedLoops.Task8;

import java.util.Scanner;

public class Task8 {
    public static final String ANSI_BLUE = "\u001B[31m"; ;
    public static final String ANSI_RED = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.print("Enter number ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num = num1;
        int count = 0;
        for ( ; num1 != 0 ; num1 /= 10) {
            ++count;}
        System.out.println("Количество цифр: "+ANSI_BLUE+count+ANSI_RESET);
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Сумма цифр: "+ANSI_RED+sum);
    }
}
    