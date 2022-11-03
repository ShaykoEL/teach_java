package by.step.teach_java.classwork.classwork_031122.Task1;

import java.util.*;

public class Collection {
    private List<Integer> list = new ArrayList<>();
    private Map <Integer, String> menu = new HashMap();

    public static void main(String[] args) {
        Collection task1 =new Collection();

        task1.list.add(task1.getNumberFromConsole());
        task1.list.add(task1.getNumberFromConsole());
        task1.list.add(task1.getNumberFromConsole());

        task1.generationMenu();
        task1.showMenu();
        task1.controllerFromProgram();

        do {
            task1.controllerFromProgram();
        }while
    }
    public void showMenu(){
        for (int i = 1; i < menu.size(); i++) {
            System.out.println(i + ". " + menu.get(i));

        }

    }
    public void showMenu2(){


        }
        public void controllerFromProgram (){
        showMenu();
        int menuPoint = getMenuPoint();
        switch (menuPoint) {
            case 3: {
               showTask1
                break;
            }case 6: {
                endFlag = false;
            }
        }


        }
        public int getMenuPoint(){
            System.out.println("Input number menu: ");
            return new Scanner(System.in).nextInt();
        }

    public int getNumberFromConsole (){
        System.out.println("Input number: ");
        return new Scanner(System.in).nextInt();
    }
    public void generationMenu(){
        menu.put(1,"Add element in list");
        menu.put(2,"Delete element in list");
        menu.put(3,"Show element in list");
        menu.put(4,"Check element in list");
        menu.put(5,"Replace element in list");
        menu.put(6,"Exit");


    }
}
