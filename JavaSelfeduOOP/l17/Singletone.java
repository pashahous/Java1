package JavaSelfeduOOP.l17;

public class Singletone {
    private static Singletone singletone = null;

    private Singletone() {
    }

    public static Singletone getInstance() {
        if (singletone == null) {
            singletone = new Singletone();
            return singletone;
        }
        return singletone;
    }
}