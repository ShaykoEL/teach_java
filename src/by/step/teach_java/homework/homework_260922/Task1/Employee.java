package by.step.teach_java.homework.homework_260922.Task1;

import by.step.teach_java.homework.homework_260922.Task2.Payment;

public class Employee {
    String FIO;
    Payment typeOfPayment;    //тип оплаты
    int payment;              //Оплата
    int countOfWorkingDay;    //Количество рабочих дней
    int countOfHours;         //Количество часов
    double totalPayment;      //Всего к оплате
    double prize;             //Премия
    int countOfChildren;      //Количество детей

    public void getPaymentMinusTax() {
        if (countOfWorkingDay != 0) {
            this.totalPayment = prize + (typeOfPayment.calculateOfPaymentWithoutTax(payment * countOfWorkingDay));
        } else {
            totalPayment = prize + typeOfPayment.calculateOfPaymentWithoutTax(payment);
        }
            if (countOfWorkingDay > 0) {
                this.totalPayment = prize + typeOfPayment.calculateOfPayment(payment * countOfWorkingDay);
            } else {
                totalPayment = prize + typeOfPayment.calculateOfPayment(payment);

            }
        }

    }


