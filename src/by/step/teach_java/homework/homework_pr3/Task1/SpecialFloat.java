package by.step.teach_java.homework.homework_pr3.Task1;

public class SpecialFloat {
    public static void main(String[] args) {
        float infinityFloat = 1f/0f;
        float negativeInfinityFloat = -1f/0f;
        float negativeZeroFloat = -1f/infinityFloat;
        float nanFloat = 0f/0f;
        System.out.println("Float special values:\n" + infinityFloat + "\n" + negativeInfinityFloat + "\n" + negativeZeroFloat + "\n" + nanFloat);

        System.out.println();
        double infinity = 1d/0d;
        double negativeInfinity = -1d/0d;
        double negativeZero = -1d/infinity;
        double nan = 0d/0d;
        System.out.println("Double special values:\n" + infinity + "\n" + negativeInfinity + "\n" + negativeZero + "\n" + nan);

        System.out.println();
        if (negativeInfinity < negativeZero){
            System.out.println("-infinity < -0.0");
        }
        if (0.0 == negativeZero){
            System.out.println("-0.0 == 0.0");
        } else System.out.println("-0.0 != 0.0");

        if (0.0 < infinity){
            System.out.println("0 < infinity");
        }
    }
}
