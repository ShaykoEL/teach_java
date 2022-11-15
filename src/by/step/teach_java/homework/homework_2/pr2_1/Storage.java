package by.step.teach_java.homework.homework_2.pr2_1;

import java.util.Scanner;

public class Storage {
    public static void main(String[] args) {
        Storage obj = new Storage();

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        System.out.println("Your string: " + string);

        int lengthOfString = obj.storage(string);

        System.out.println("String storage is " + lengthOfString);
    }
    public int storage(String s) {
        return s.length() * 2;
    }
}
