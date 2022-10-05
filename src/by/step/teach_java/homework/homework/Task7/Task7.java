package by.step.teach_java.homework.homework.Task7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter symbol:  ");
        String symbol = scanner1.nextLine();
        Pattern patlatletter = Pattern.compile("[a-zA-Z]{1}");
        Matcher matlatletter = patlatletter.matcher(symbol);
        Pattern patkirletter = Pattern.compile("[а-яА-Я]{1}");
        Matcher matkirletter = patkirletter.matcher(symbol);
        Pattern patnumber = Pattern.compile("[0-9]{1}");
        Matcher matnumber = patnumber.matcher(symbol);
        if (matlatletter.matches()) {
            System.out.println("Lat");
        }
        else if (matkirletter.matches()) {
            System.out.println("Cyr");
        }
        else if (matnumber.matches()) {
            System.out.println("Number");
        } else {
            System.out.println("Impossible to determine");
        }
    }
}
