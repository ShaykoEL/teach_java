package by.step.teach_java.homework.homework_260922.Task4;

import by.step.teach_java.homework.homework_260922.Task2.Payment;

public class HourlyWorker extends Payment {
    public HourlyWorker() {
        super.tax = 20;

        super.paymentTypeName = "Почасовая";

    }

    @Override
    public double calculateOfPayment(int payment) {
        double taxTotal = (double) payment * (tax + childrenTax) / 100;
        return payment - taxTotal;
    }
}
