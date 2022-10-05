package by.step.teach_java.homework.homework_pr3.Task4;

import java.util.Scanner;

public class PrimeNumbers {
    private int[] arrayOfTask(int n) {
        int[] a = new int[n + 1];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        return a;
    }
    public void displayArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    private int[] primeNumbers(int[] a) {

        int count = 0;
        a[1] = 0;
        for (int i = 2; i * i <= a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] % i == 0 && a[j] != i) {
                    a[j] = 0;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) count++;
        }

        int[] b = new int[count];

        for (int i = 0, j = 0; i < a.length; i++) {

            if (a[i] != 0) {
                b[j] = a[i];
                j++;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        PrimeNumbers obj = new PrimeNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length: ");
        int n = sc.nextInt();

        int[] arrOfNumbers = obj.arrayOfTask(n);
        obj.displayArray(arrOfNumbers);
        int[] primeNumbers = obj.primeNumbers(arrOfNumbers);
        System.out.println();
        obj.displayArray(primeNumbers);
    }
}