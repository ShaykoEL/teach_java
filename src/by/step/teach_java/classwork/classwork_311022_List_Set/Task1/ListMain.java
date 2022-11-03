package by.step.teach_java.classwork.classwork_311022_List_Set.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(5);
        list.add(157);
        list.add(null);
        showArray(list);
        sum(list);



    }
    public static <E> void showArray(List <E> list){
        for (E val: list) {
            System.out.println(val);
        }
    }
    public static <E> void sum(List <E> list) {
        int sum = 0;
        for (E s: list) {
            try {
                sum += (Integer) s;
            } catch (NullPointerException e) {
                System.out.println("Есть null значения");
            }
        }
        System.out.println("Сумма допустимых чисел = " + sum);
        System.out.println();

    }
    public static void showSet(Set<Integer> set1) {
        for (Integer s : set1) {
            System.out.println(s);
        }
    }
}
