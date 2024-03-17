package gb.sem1.levl2.les1;

import java.util.Random;

public class Wall implements Obstacle {
    private static int MIN_LENGHT = 1;
    private int length;

    public Wall() {
        Random random = new Random();
        length = random.nextInt(10) + MIN_LENGHT;
    }

    public int getLength() {
        return length;
    }

    public Wall(int from, int to) {
        Random random = new Random();
        length = random.nextInt(to - from) + to + MIN_LENGHT;
    }

    public Wall(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + length +
                '}';
    }

    @Override
    public boolean overcome(JumpRunnable sprinter) {
        return sprinter.jump() >= getLength();
    }
}
