package by.step.teach_java.homework.homework_2.pr2_4;

public class ArithmeticMean {

    private int count = 0;
    private int sumOfNumbers = 0;

    private int getRandomNumber (int from, int till) {
        return (int) (from + Math.random() * till);
    }
    public double arithmeticMeanTwoValues (int sumOfNumbers, int count) {
        return sumOfNumbers / count;
    }


    public static void main(String[] args) {
       ArithmeticMean arMean = new ArithmeticMean();
       int currentValue = 0;
       System.out.println("Generate number: ");
       do {
           currentValue = arMean.getRandomNumber(0, 10);

           if (currentValue != 0) {
               System.out.println(" " + currentValue);
           }
           arMean.count++;
           arMean.sumOfNumbers += currentValue;
       } while (currentValue != 0);

       arMean.count--;
        System.out.println();
        System.out.println("Count " + arMean.count);
        System.out.println("Sum of numbers " + arMean.sumOfNumbers);

        System.out.println("Arithmetic mean: " + arMean.arithmeticMeanTwoValues(arMean.sumOfNumbers, arMean.count));
    }
}

