package by.step.teach_java.classwork.classwork_290922_daysOfTheWeek.task3;

import by.step.teach_java.classwork.classwork_290922_daysOfTheWeek.task1.DaysOfTheWeek;
import by.step.teach_java.classwork.classwork_290922_daysOfTheWeek.task2.DisplayNameWeek;

public class CheckingDay implements DisplayNameWeek {
    @Override
    public void DisplayNameWeek(DaysOfTheWeek day) {
        switch (day) {
            case FIRST_DAY:
                if (day.getName().equals ("Monday")){
                    System.out.println(day.getName () + " - Text correct");
                } else {
                    System.out.println(day.getName () + " - Text no correct");
                }
                break;
            case SECOND_DAY:
                if (day.getName().equals ("Tuesday")){
                    System.out.println(day.getName () + " - Text correct");
                } else {
                    System.out.println(day.getName () + " - Text no correct");
                }
                break;
            case THIRD_DAY:
                if (day.getName().equals ("Wednesday")){
                    System.out.println(day.getName () + " - Text correct");
                } else {
                    System.out.println(day.getName () + " - Text no correct");
                }
                break;
            case FOURTH_DAY:
                if (day.getName().equals ("Thursday")){
                    System.out.println(day.getName () + " - Text correct");
                } else {
                    System.out.println(day.getName () + " - Text no correct");
                }
                break;
            case FIFTH_DAY:
                if (day.getName().equals ("Friday")){
                    System.out.println(day.getName () + " - Text correct");
                } else {
                    System.out.println(day.getName () + " - Text no correct");
                }
                break;
            case SIXTH_DAY:
                if (day.getName().equals ("Saturday")){
                    System.out.println(day.getName () + " - Text correct");
                } else {
                    System.out.println(day.getName () + " - Text no correct");
                }
                break;
            case SEVENS_DAY:
                if (day.getName().equals ("Sunday")){
                    System.out.println(day.getName () + " - Text correct");
                } else {
                    System.out.println(day.getName () + " - Text no correct");
                }
                break;
            default:
                System.out.println("No day");

        }

    }
}
