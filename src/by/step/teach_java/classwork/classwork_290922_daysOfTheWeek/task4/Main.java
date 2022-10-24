package by.step.teach_java.classwork.classwork_290922_daysOfTheWeek.task4;

import by.step.teach_java.classwork.classwork_290922_daysOfTheWeek.task1.DaysOfTheWeek;
import by.step.teach_java.classwork.classwork_290922_daysOfTheWeek.task3.CheckingDay;

public class Main {
    public static void main(String[] args) {
        CheckingDay startCheck = new CheckingDay();
        DaysOfTheWeek[] array = DaysOfTheWeek.values();
        for ( DaysOfTheWeek  day : array) {
            startCheck.DisplayNameWeek(day);
        }

    }
}
