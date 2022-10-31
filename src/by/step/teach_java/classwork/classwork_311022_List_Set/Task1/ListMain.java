package by.step.teach_java.classwork.classwork_311022_List_Set.Task1;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(5);
        list.add(157);
        list.add(null);
        showArray(list);



    }
    public static <E> void showArray(List <E> list){
        for (E val: list) {
            System.out.println(val);
        }
    }
    public static <E> void Sum(List <E> list) {

    }
}
