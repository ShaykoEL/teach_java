package by.step.teach_java.classwork.classwork_210722_hw;

import java.util.Scanner;

import static java.lang.Math.random;

public class Task3 {
    public static void main(String[] args) {
        Task3 arrayMethod = new Task3();
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = arrayMethod.createArray(length);
    }

    private int[] createArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
           array[i] = ((int) (random() * 10 + 1));
        }
        return array;
    }

}

