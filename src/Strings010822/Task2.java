package Strings010822;

import java.util.Scanner;

public class Task2 {
    private String stringOfNumber() {
        String s = "";
        for (int i = 1; i < 1000; i++) {
            if (s.length() >=1000){
                break;
            }
            else {
                s = s + i;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Task2 task = new Task2();
        String s = task.stringOfNumber();
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        System.out.print("Input index  ");
        int index = sc.nextInt();
        System.out.println("На данной позиции число " + s.charAt(index));
    }


}
