package by.step.teach_java.homework.homework_2.pr2_1_2;

public class Storage2 {
    public static void main(String[] args) {
        Storage2 st = new Storage2();
        System.out.println("Length \"Hello World!\" string x 2 = " + st.storage ("Hello world!"));
    }
    public int storage (String s) {
        return s.length() * 2;
    }
}
