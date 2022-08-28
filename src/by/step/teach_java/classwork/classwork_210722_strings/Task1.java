package by.step.teach_java.classwork.classwork_210722_strings;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Input string  ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("Input one symbol  ");
        String s1 = sc.nextLine();
        char [] ar = s.toCharArray();
        char symbol = s1.charAt(0);
        Task1 t = new Task1();

        int result = t.countSymbols(ar, symbol);

        System.out.println("Количество вхождений " + result);
    }
    public int countSymbols (char[] arr, char symbol) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == symbol) {
                count++;
            }

        }
        return count;
    }

}
