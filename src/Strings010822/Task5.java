package Strings010822;

import java.util.Scanner;

public class Task5 {
    public String [] getArrayWords(String str) {
        return str.split( " ");
    }
    public String [] getAllWordsWichChetn (String [] array, char [] chetn){
        String resultWordsChetn = "";
    }
}
    public static void main(String[] args) {
        Task5 object = new Task5();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String [] words = object.getArrayWords(str);



}
