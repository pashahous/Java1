package gb.sem1.levl2.les1.obstacle;

import gb.sem1.levl2.les1.sportsmens.JumpRunnable;

import java.util.Random;

public class Track implements Obstacle {
    private static int count = 0;
    private int length;
    private static int MIN_LENGTH = 1;
    private static int MAX_LENGTH = 5;
    private int id;

    public int getId() {
        return id;
    }


    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Track{" +
                "length=" + length +
                ", id=" + id +
                '}';
    }

    public Track() {
        this.id = count++;
        Random rnd = new Random();
        length = rnd.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
    }

    public Track(int length) {
        this.length = length;
    }

    public Track(int from, int to) {
        //to generation a range of values
        Random rnd = new Random();
        length = rnd.nextInt(to - from) + to + MAX_LENGTH;
    }

    @Override
    public boolean overcome(JumpRunnable sprinter) {
        //проверка может ли спринтер преодолеть данное препятствие
        if (sprinter.run() > this.getLength()) {
            System.out.println(sprinter + " is run");
            return true;
        }else
        {
            System.out.println(sprinter + " Cant run!!!");
            return false;

        }
    }
}
