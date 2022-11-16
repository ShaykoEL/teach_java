package by.step.teach_java.homework.homework_2.pr2_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SpeedCalculation {
    private static final float Distance() {
        System.out.print("Input the distance in km  ");
        Scanner sc1 = new Scanner(System.in);
        float getDistance = sc1.nextFloat();
        return getDistance;
    }

    private static final float Time() {
        System.out.print("Input the the travel time in hours ");
        Scanner sc2 = new Scanner(System.in);
        float getTime = sc2.nextFloat();
        return getTime;
    }

    public static void main(String[] args) {
        float velocity = (Distance() / Time());
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.print("The speed is " + df.format(velocity) + " km/h");
    }
}
