package gb.sem1.levl2.les1;

import java.util.ArrayList;
import java.util.List;

public class CreaterObstacle {
    //генерация препрепятствий

    public static List<Obstacle> сreateObst(List<Obstacle> obstacle, int[] numOfEachType) {
        // создаем припятствия
        List<Obstacle> obstacleList = new ArrayList<>();
        for (int i = 0; i < obstacle.size(); i++) {
            for (int j = 0; j < numOfEachType[i]; j++) {
                Obstacle e;
                try {
                    /* FIXME  посмотреть другие варинты рещения*/
                    e = obstacle.get(i).getClass().getDeclaredConstructor().newInstance();

                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

                obstacleList.add(e);
            }
        }
        return obstacleList;
    }

    private CreaterObstacle() {

    }

}
