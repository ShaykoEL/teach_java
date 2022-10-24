package by.step.teach_java.classwork.classwork_171022.task4;

import java.util.Scanner;

public class Exception3 {
    String s = " ";
    String[] splited;

    public static void main(String[] args) {
        Exception3 exception3 = new Exception3();
        exception3.getString();
        exception3.splited = exception3.spitPlus();
        exception3.validOfSplitArray();
        int sum = 0;
        for (String num : exception3.splited) {
            sum += Integer.parseInt(num);
        }
        System.out.println("summa " + sum);

    }

    public void getString() {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
    }

    public String[] spitPlus() {
        return splited = s.split("\\+");

    }

    public void validOfSplitArray() throws IllegalArgumentException {
        for (String num : splited) {

                try {
                    Integer.parseInt(num);
                } catch (IllegalArgumentException e) {
                    System.out.println("Wrong number");
                    getString();
                    spitPlus();
                    validOfSplitArray();
                }
            }
        }

    }
