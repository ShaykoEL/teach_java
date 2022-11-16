package by.step.teach_java.homework.homework_2.pr2_3_2;

public class SpeedCalculation2 {
    private final double distance = 20.5;
    private final double time = 5;

    public static void main(String[] args) {
        SpeedCalculation2 sp2 = new SpeedCalculation2();
        System.out.println("Velocity = " + (sp2.distance / sp2.time));
    }
}
