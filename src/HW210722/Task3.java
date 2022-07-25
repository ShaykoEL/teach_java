package HW210722;

import java.util.Scanner;

import static java.lang.Math.random;

public class Task3 {
    public static void main(String[] args) {
        Task3 arrayMethod = new Task3();
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = arrayMethod.creatArray(length);
    }

    private int[] creatArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
           array[i] = ((int) (random() * 10 + 1));
        }
        return array;
    }

}

