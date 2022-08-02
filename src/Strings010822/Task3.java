package Strings010822;

import java.util.Scanner;

public class Task3 {
    public void averageWordLength(String s) {
        String[] arOfString = s.split(" ");
        double sumOfWordLength = 0;
        for (int i = 0; i < arOfString.length; i++) {
            sumOfWordLength += arOfString[i].length();
        }
        System.out.print("Average word length  " + sumOfWordLength / arOfString.length);
    }

    public static void main(String[] args) {
        Task3 obj = new Task3();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the string: ");
        String string = sc.nextLine();
        obj.averageWordLength(string);
    }
}
