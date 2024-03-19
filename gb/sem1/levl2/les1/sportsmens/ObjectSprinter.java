package gb.sem1.levl2.les1.sportsmens;

import java.util.Random;

abstract class ObjectSprinter {
    private static int count = 0;
    private int id = 0;
    private int maxJump;
    private int maxRun;

    @Override
    public String toString() {
        return "ObjectSprinter{" +
                "id=" + id +
                ", maxJump=" + maxJump +
                ", maxRun=" + maxRun +
                '}';
    }

    public ObjectSprinter() {
        this.id = count++;
        Random rnd = new Random();
        maxRun = rnd.nextInt(10)+1;
        maxJump = rnd.nextInt(5)+1;
    }

    public static int getCount() {
        return count;
    }


    public int getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }
}
