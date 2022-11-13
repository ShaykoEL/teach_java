package by.step.teach_java.classwork.classwork_031122.Task1;

import java.util.*;

public class Collection {
    private List<Integer> list = new ArrayList<>();
    private Map <Integer, String> menu = new HashMap<>();
    private boolean endFlag = true;

    public static void main(String[] args) {
        Collection task1 =new Collection();

        task1.list.add(task1.getNumberFromConsole());
        task1.list.add(task1.getNumberFromConsole());
        task1.list.add(task1.getNumberFromConsole());

        task1.generationMenu();
       // task1.showMenu();
       // task1.controllerOfProgram();

        do {
            task1.controllerOfProgram();
        } while (task1.endFlag);
    }
    public void showMenu(){
        for (int i = 1; i < menu.size(); i++) {
            System.out.println(i + ". " + menu.get(i));

        }

    }
    public void showMenu2(){


        }
        public void controllerOfProgram (){
        showMenu();
        int menuPoint = getMenuPoint();
        switch (menuPoint) {
            case 1: {
                int newNumber = getNumberFromConsole();
                list.add(newNumber);
                break;
            }
            case 2: {
                int removedNumber = getNumberFromConsole();
                deleteNumberFromList(removedNumber);
                showListEntries();
                break;
            }
            case 3: {
                showListEntries();
                break;
            }
            case 4: {

            }

            case 6: {
                endFlag = false;
            }
        }


        }
        public void deleteNumberFromList(int number){
        list.remove(Integer.valueOf(number));
        }
        public void showListEntries(){
        for (Integer number: list) {
            System.out.println(number +", ");
        }
            System.out.println();
        }
        public int getMenuPoint(){
            System.out.println("Input number menu: ");
            return new Scanner(System.in).nextInt();
        }

    public int getNumberFromConsole (){
        System.out.println("Input a number: ");
        return new Scanner(System.in).nextInt();
    }
    public void generationMenu(){
        menu.put(1,"Add element in the list");
        menu.put(2,"Delete element from the list");
        menu.put(3,"Show elements in the list");
        menu.put(4,"Check value in the list");
        menu.put(5,"Replace value in  the list");
        menu.put(6,"Exit");


    }
}
