package by.step.teach_java.homework.homework_1.pr1_4;

public class Pr1_4_main {
    public static void main(String[] args) {
        Spaceship s1 = new Spaceship();
        s1.name = "Prometheus";
        s1.speed = 300;

        Spaceship s2 = new Spaceship();
        s2.name = "Enterprise";
        s2.speed = 500;

        System.out.println("Spaceship name: " + s1.name + ", speed: " + s1.speed);
        System.out.println("Spaceship name: " + s2.name + ", speed: " + s2.speed);

        s1.showSpaceShipName();
        s1.showSpaceshipSpeed();

        s2.showSpaceShipName();
        s2.showSpaceshipSpeed();
    }
}
