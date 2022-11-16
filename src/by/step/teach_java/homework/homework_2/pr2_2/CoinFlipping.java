package by.step.teach_java.homework.homework_2.pr2_2;

public class CoinFlipping {
    public static void main(String[] args) {
        CoinFlipping cf = new CoinFlipping();

        for (int i = 0; i < 10; i++) {
            cf.coinFlip();

        }
    }
    private int getRandomNumber(int from, int till) {
        return (int) (from + Math.random() * till);
    }
    public void coinFlip() {
        if (getRandomNumber(1, 100) <= 50) {
            System.out.println("Tails");
        } else {
            System.out.println("Heads");
        }
    }
}



