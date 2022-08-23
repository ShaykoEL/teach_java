package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskControl {
    int direction = 0;
    public void moveVersion (TaskMap map){
        int move = getDirection();
        switch (move) {
            case (4): {
                map.goToTheLeft();
                map.displayMap();
                break;
            }
            case (6): {
                map.goToTheRight();
                map.displayMap();
                break;
            }
            case (2): {
                map.goToTheDown();
                map.displayMap();
                break;
            }
            case (8): {
                map.goToTheUp();
                map.displayMap();
                break;
            }
            default: {
                System.out.println("You entered the wrong number");
            }
        }
    }
    private int getDirection(){

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            direction = Integer.parseInt(br.readLine());
        }
        catch (Exception ex) {
            System.out.println("Input error");
            getDirection();
        }
        return (direction);
    }
}
