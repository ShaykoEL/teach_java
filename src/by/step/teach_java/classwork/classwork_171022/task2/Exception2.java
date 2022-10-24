package by.step.teach_java.classwork.classwork_171022.task2;

import java.util.Scanner;

public class Exception2 {
    Integer number = 0;

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.getCorrectNumberFromConsole();
        exception2.verifyRange();
        System.out.println(exception2.number + " number in range");
    }

    public void getCorrectNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String s = null;
        try {
            System.out.println("Please input a number");
            s = scanner.nextLine();
            number = Integer.parseInt(s, 2);
        } catch (NumberFormatException e) {
            System.out.println(s + " is not a number");
            getCorrectNumberFromConsole();
        }
    }

    public void verifyRange() {
        try {
            verifyInputedNumber();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            getCorrectNumberFromConsole();
            verifyRange();
        }
    }

    public void verifyInputedNumber() throws IllegalArgumentException {
        if (number < -5 || number > 5) {
            throw new IllegalArgumentException("Not in range from -5 to 5");
        }
    }
}
