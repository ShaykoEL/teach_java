package by.step.teach_java.homework.homework.Task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Enter flat number:  ");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        System.out.print("Enter flat quantity per floor:  ");
        Scanner sc2 = new Scanner(System.in);
        int m = sc2.nextInt();
        System.out.println("Pod'ezd "+(n/(9*m)+1));
    }
}
