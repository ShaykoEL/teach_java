package by.step.teach_java.homework.homework_2.pr2_1_2;

public class Storage1 {
    public static void main(String[] args) {
        Storage1 st = new Storage1();
        System.out.println("Length \"Hello World!\" string x 2 = " + st.storage ("Hello world!"));
    }
    public int storage (String s) {
        return s.length() * 2;
    }
}
