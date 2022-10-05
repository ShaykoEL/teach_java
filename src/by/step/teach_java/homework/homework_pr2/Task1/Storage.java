package by.step.teach_java.homework.homework_pr2.Task1;

import java.util.Scanner;

public class Storage {
    public int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Storage obj = new Storage();

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        System.out.println("Your string: " + string);

        int lengthOfString = obj.storage(string);

        System.out.println("String storage is " + lengthOfString);
    }
}
