package Strings010822;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        System.out.print("Input string  ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();

        Task7 obj = new Task7();
        obj.replays(chars);
        obj.changeNumberTo(chars);
        obj.showArray(chars);
    }

    public void replays(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
    }
        public void changeNumberTo(char[] chars) {
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (Character.isDigit(c)) {
                    chars[i] = '_';
                }
            }
        }
        public void showArray(char [] chars){
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
        }
}




