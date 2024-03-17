package gb.sem1.levl2.les1;

import java.util.Random;

public class Track  implements Obstacle {
    private int lenght;
    private static int MIN_LENGHT = 1;

    public int getLenght() {
        return lenght;
    }

    public Track() {
        Random rnd = new Random();
        lenght = rnd.nextInt(20);
    }

    public Track(int lenght) {
        this.lenght = lenght;
    }

    public Track(int from, int to) {
        //to generation a range of values
        Random rnd = new Random();
        lenght = rnd.nextInt(to - from) + to + MIN_LENGHT;
    }

    @Override
    public String toString() {
        return "Track{" +
                "lenght=" + lenght +
                '}';
    }

    @Override
    public boolean overcome(JumpRunnable sprinter) {
        return sprinter.run() > this.getLenght();
    }
}
