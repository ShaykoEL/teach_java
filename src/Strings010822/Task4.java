package Strings010822;

import java.util.Scanner;

public class Task4 {
    public String[] getArrayWords(String str) {
        return str.split(" ");
    }
    public String[] getAllWordsWhichStartFromGlasnye(String[] array, char[] glasnye) {
        String resultWordsGlasnye = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < glasnye.length; j++) {
                if (array[i].charAt(0) == glasnye[j]) {
                    resultWordsGlasnye = resultWordsGlasnye + array[i] + " ";
                }
            }
        }
        return resultWordsGlasnye.split(" ");
    }

    public String[] getAllWordsWhichTillSoglasnye(String[] array, char[] soglasnye) {
        String resultWordsSoglasnye = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < soglasnye.length; j++) {
                if (array[i].charAt(array[i].length() - 1) == soglasnye[j]) {
                    resultWordsSoglasnye = resultWordsSoglasnye + array[i] + " ";
                }
            }
        }
        return resultWordsSoglasnye.split(" ");
    }

    public String getFinalWords(String[] array) {
        String finalWords = "";
        for (int i = 0; i < array.length; i++) {
            finalWords = finalWords + array[i] + " ";
        }
        return finalWords;
    }

    public static void main(String[] args) {
        Task4 object = new Task4();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();

        String[] words = object.getArrayWords(str);

        char[] glassnye = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е',  'a', 'e', 'i', 'o', 'u', 'y'};
        char[] soglasnye = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p',  'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};

        String[] filterOnGlasnye = object.getAllWordsWhichStartFromGlasnye(words, glassnye);
        String[] filterOnSoglasnye = object.getAllWordsWhichTillSoglasnye(filterOnGlasnye, soglasnye);

        System.out.println(object.getFinalWords(filterOnSoglasnye));
    }
}