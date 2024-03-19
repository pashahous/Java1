package gb.sem1.levl2.les1.obstacle;

import gb.sem1.levl2.les1.sportsmens.JumpRunnable;

import java.util.Random;

public class Wall implements Obstacle {
    private  static int count = 0;
    private int id;


    public int getId() {
        return id;
    }

    private static int MIN_HEIGHT = 1;
    private static int MAX_HEIGHT = 3;
    private int height;

    public Wall() {
        this.id = count++;
        Random random = new Random();
        height = random.nextInt(MAX_HEIGHT - MIN_HEIGHT + 1) + MIN_HEIGHT;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "id=" + id +
                ", height=" + height +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public Wall(int from, int to) {
        Random random = new Random();
        height = random.nextInt(to - from) + to + MIN_HEIGHT;
    }

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(JumpRunnable sprinter) {
        //проверка может ли спринтер преодолеть данное препятствие

        if (sprinter.jump() > this.getHeight()) {
            System.out.println(sprinter + " is jump");
            return true;
        } else
        {
            System.out.println(sprinter + " Cant jump!!!");
            return false;

        }

    }
}
