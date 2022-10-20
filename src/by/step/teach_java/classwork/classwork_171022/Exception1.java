package by.step.teach_java.classwork.classwork_171022;

import java.util.Scanner;

public class Exception1 {
    Integer number = 0;

    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.getCorrectNumberFromConsole();
        exception1.verifyRange();
        System.out.println(exception1.number + " number in range");
    }

    public void getCorrectNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String s = null;
        try {
            System.out.println("Please input a number");
            s = scanner.nextLine();
            number = Integer.parseInt(s);
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
        if (number < 0 || number > 9) {
            throw new IllegalArgumentException("Not in range from  0 to 9");
        }
    }


}
