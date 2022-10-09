package by.step.teach_java.homework.homework_260922.Task6;

import by.step.teach_java.homework.homework_260922.Task1.Employee;
import by.step.teach_java.homework.homework_260922.Task2.Payment;
import by.step.teach_java.homework.homework_260922.Task3.Stavka;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Payment pay = new Stavka();
        employee1.name = "Иванов С.И.";
        employee1.payment = 300;
        employee1.countOfChildren = 0;
        employee1.getPrize();
        pay.setChildrenTax(employee1.countOfChildren);
        if (employee1.countOfHours > 0) {
            employee1.getPaymentMinusTaxForHourly();
            System.out.println(employee1.toStringHourlyMethod());
        } else if (employee1.countOfWorkingDay > 0) {
            employee1.getPaymentMinusTax();
            System.out.println(employee1.toString());
        } else {employee1.getPaymentMinusTax();
            System.out.println(employee1.toStringPieceWorkMethod());
    }
}
