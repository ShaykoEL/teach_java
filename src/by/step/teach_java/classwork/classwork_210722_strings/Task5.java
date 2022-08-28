package by.step.teach_java.classwork.classwork_210722_strings;

import java.util.Scanner;

public class Task5 {
    public int numbersOfWords(String s) {
        int numbersOfLetter = 0;
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() % 2 == 0) {
               numbersOfLetter++;
            }
        }
        return numbersOfLetter;
    }
    public static void main (String[]args){
        Task5 obj = new Task5();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the string:  ");
        String st = sc.nextLine();
        System.out.println("Numbers of words " + obj.numbersOfWords(st));
    }
}

