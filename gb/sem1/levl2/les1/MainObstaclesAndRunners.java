package gb.sem1.levl2.les1;

import gb.sem1.levl2.les1.obstacle.Obstacle;
import gb.sem1.levl2.les1.obstacle.Track;
import gb.sem1.levl2.les1.obstacle.Wall;
import gb.sem1.levl2.les1.sportsmens.Cat;
import gb.sem1.levl2.les1.sportsmens.Human;
import gb.sem1.levl2.les1.sportsmens.JumpRunnable;
import gb.sem1.levl2.les1.sportsmens.Robot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainObstaclesAndRunners {
    public static void main(String[] args) {
        List<Obstacle> listObst = new ArrayList<>();
        listObst.addAll(Arrays.asList(new Wall(), new Track()));
        List<JumpRunnable> sportsmens = new LinkedList<>();
        sportsmens.addAll(Arrays.asList(new Cat(), new Cat()));
        sportsmens.addAll(Arrays.asList(new Robot(), new Robot()));
        sportsmens.addAll(Arrays.asList(new Human(), new Human()));


        List<Obstacle> obstacles = CreaterObstacle.сreateObst(listObst, new int[]{2, 3});// создаем припятствия
        System.out.println("Create Obstacle ------");

        for (Obstacle obstacle : obstacles) {
            System.out.println(obstacle);
            for (int i = 0; i < sportsmens.size(); i++) {
                if (!obstacle.overcome(sportsmens.get(i))) {
                    System.out.println("=====Sportsmen LOSE " + sportsmens.get(i)+"========");
                    sportsmens.remove(i);
                }
            }
        }
        for (JumpRunnable sportsmen : sportsmens) {
            System.out.println(sportsmen + " WINNER");
        }

    }


}
