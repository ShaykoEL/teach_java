package by.step.teach_java.homework.homework_2.Task4;

import java.util.Random;

public class ArithmeticMean {
    public int sequence(){
        Random ran = new Random();

        int num = 0;
        int sum = 0;
        int i = 1;
        while ((num = ran.nextInt()) != 0){
            //System.out.print(number);
            sum += num;
            i++;
        }
        return sum / i;
    }

    public static void main(String[] args) {
        Random ran = new Random();
        ArithmeticMean obj = new ArithmeticMean();
        System.out.println(" Arithmetic mean is: " + obj.sequence());
    }
}
