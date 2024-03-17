package gb.sem1.levl2.les1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainObstaclesAndRunners {
    public static void main(String[] args) {
        List<Obstacle> listObst = new ArrayList<>();
        listObst.addAll(Arrays.asList(new Wall(),new Track()));
        List<JumpRunnable> sportsmen = ArrayList()


        List<Obstacle> obstacles = CreaterObstacle.сreateObst(listObst, new int[]{2, 3});// создаем припятствия
        System.out.println("Create Obstacle ------");
        for (Obstacle obstacle : obstacles) {
            System.out.println(obstacle);
        }
        for (Obstacle obst : obstacles) {

        }
    }
}
