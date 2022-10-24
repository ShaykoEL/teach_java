package by.step.teach_java.classwork.classwork_171022.task3;

import java.util.Arrays;

public class ArrayException {
    public static void main(String[] args) {
        int [] numbers = {167, 5, 655};
        int [] numbers2 = {167, -2, 3};
        ArrayException ar = new ArrayException();
        ar.compareArr(numbers, 1,0, numbers2, 1,2);
        ar.compareArr(numbers, 1, 4, numbers2, 1,2);
        ar.compareArr(null, 1,4, numbers2, 1,2);

    }
    public void compareArr(int[] a, int aFromIndex, int aToIndex,
                           int[] b, int bFromIndex, int bToIndex) {
        try {
            Arrays.compare(a, aFromIndex, aToIndex, b, bFromIndex, bToIndex);

            }catch (IllegalArgumentException e) {
            System.out.println("Hello from IllegalArgumentException");
        }catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Hello from ArrayIndexOutOfBoundsException");
        }catch (NullPointerException e2) {
            System.out.println("Hello from NullPointerException");
        }
    }

}
