package by.step.teach_java.homework.homework_pr1.Task4;

public class Spaceship {
    String nameSpaceship1 = "Prometheus";
    String nameSpaceship2 = "Enterprise";

    public void spaceShip1() {
        Spaceship ss1 = new Spaceship();
        System.out.println("The name of the first spaceship is: ");
        System.out.println(ss1.nameSpaceship1);
    }

    public void spaceShip2() {
        Spaceship ss2 = new Spaceship();
        System.out.println("The name of the second spaceship is: ");
        System.out.println(ss2.nameSpaceship2);
    }

    public static void main(String[] args) {
        Spaceship nameView = new Spaceship();
        nameView.spaceShip1();
        nameView.spaceShip2();

    }
}
