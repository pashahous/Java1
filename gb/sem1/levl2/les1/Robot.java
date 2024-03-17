package gb.sem1.levl2.les1;

import java.util.Random;

public class Robot extends ObjectSprinter implements JumpRunnable{
    public Robot() {
        Random rnd = new Random();
        canJump = rnd.nextBoolean();
        canJump = rnd.nextBoolean();
    }
}
