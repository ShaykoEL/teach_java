package by.step.teach_java.classwork.classwork_210722_strings;

import java.util.Scanner;

public class Task4_1 {
    public void words(String s) {
        String[] arOfString = s.split(" ");
        for (int i = 0; i < arOfString.length; i++) {
            if (arOfString[i].matches("^[aeiouyAEIOUY].+") && arOfString[i].matches(".+[bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ]$")) {
                System.out.print(arOfString[i] + " ");
            }
        }
    }
        public static void main (String[]args){
            Task4_1 obj = new Task4_1();
            Scanner sc = new Scanner(System.in);
            System.out.print("Input the string:  ");
            String st = sc.nextLine();
            obj.words(st);
        }
    }
