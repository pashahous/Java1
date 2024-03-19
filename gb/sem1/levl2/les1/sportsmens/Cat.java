package gb.sem1.levl2.les1.sportsmens;

import java.util.Random;

public class Cat extends ObjectSprinter implements JumpRunnable {

    @Override
    public int run() {
        return getMaxRun();
    }

    @Override
    public int jump() {
        return getMaxJump();
    }
}
