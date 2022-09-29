package by.step.teach_java.classwork.classwork_290922_daysOfTheWeek.Task3;

import by.step.teach_java.classwork.classwork_290922_daysOfTheWeek.Task1.DaysOfTheWeek;
import by.step.teach_java.classwork.classwork_290922_daysOfTheWeek.Task2.DisplayNameWeek;

public class CheckingDay implements DisplayNameWeek {
    @Override
    public void DisplayNameWeek(DaysOfTheWeek day) {
        switch (day) {
            case FIFTH_DAY:
                if (day.getName().eguals ("Monday")){
                    System.out.println(day.getName);
                }
        }

    }
}
