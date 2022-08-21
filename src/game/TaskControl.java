package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskControl {
    public void moveVersion (TaskMap map){
        int move = getDirection();
        switch (move) {
            case (4): {
                map.goToTheLeft();
                break;
            }
            case (6): {
                map.goToTheRight();
                break;
            }
            case (2): {
                map.goToTheDown();
                break;
            }
            case (8): {
                map.goToTheUp();
                break;
            }
            default: {
                System.out.println("You entered the wrong number");
            }
        }

    }
    private int getDirection(){
        int direction = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            direction = Integer.parseInt(br.readLine());
        }
        catch (IOException ex) {
            System.out.println("Input error");
        }
        return (direction);
    }
}
