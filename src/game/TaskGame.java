package game;

public class TaskGame {
    public static void main(String[] args) {
        TaskGame game = new TaskGame();
        TaskMap map = new TaskMap();
        game.createMap(map);
        game.addStone(map);
        game.displayMap(map);
    }
    public char [][] createMap(TaskMap map) {
        map.map = new char[10][10];

        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = '_';
            }
        }
        return map.map;

    }
    public void displayMap(TaskMap map) {
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                System.out.print(map.map [i][j] + " ");
            }
            System.out.println();
        }
    }
    public void addStone (TaskMap map) {
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                if (isStone()) {
                    map.map [i][j] = 'S';
                }
            }
        }
    }
       public boolean isStone() {
        int random = (int) (Math.random() * 100);
        return random >= 80;
    }
}
