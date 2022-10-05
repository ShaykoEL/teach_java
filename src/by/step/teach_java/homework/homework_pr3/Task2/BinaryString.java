package by.step.teach_java.homework.homework_pr3.Task2;

public class BinaryString {
    public static void main(String[] args) {
        Bin b = new Bin();

        b.a= 0*230;
        b.b= 0*231;

        System.out.println("a = " + Integer.toBinaryString(b.a));
        System.out.println("b = " + Integer.toBinaryString(b.b));
        System.out.println("a | b = " + Integer.toBinaryString(b.a | b.b));
        System.out.println("a & b = " + Integer.toBinaryString(b.a & b.b));
        System.out.println("a ^ b = " + Integer.toBinaryString(b.a ^ b.b));
        System.out.println(" b.a>> 1  = " + Integer.toBinaryString(b.a >>1));
        System.out.println(" b.a<<1 = " + Integer.toBinaryString(b.a <<1));
        System.out.println("-b.a >>>1 = " + Integer.toBinaryString(-b.a>>>1));
    }
}
class Bin {
    int a;
    int b;

}
