package by.step.teach_java.homework.homework_pr7.task1;

public class Compare {
    public static void main(String[] args) {
        Compare compare = new Compare();
        long millis_startTime = System.currentTimeMillis();
        long millis_endTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            compare.intSum();
            compare.IntegerSum();

        }
        System.out.println("Time taken in milli seconds:" + (millis_endTime - millis_startTime));
        for (int i = 0; i < 1000000; i++) {
            compare.IntegerSum();

        }
    }
    public void intSum(){
        int a = 5;
        int b = 34;
        System.out.println(a + b);
    }
    public void IntegerSum(){
        Integer a = 5;
        Integer b = 34;
        System.out.println(a+b);
    }

}
