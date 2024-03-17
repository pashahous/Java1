package gb.sem1.levl2.les1;

public interface JumpRunnable {
    int maxJump = 0;
    int maxRun = 0;
    boolean canJump = false;
    boolean canRun = false;

    public default int run(){
            if (canRun) {
        System.out.println(this.getClass().getName() + " is jump");
        return maxRun;
    }
        return 0;}
    public  default int jump(){
        if(canJump) {
            System.out.println(this.getClass().getName() + " is jump");
            return maxJump;
        }
        return 0;
            }
}
