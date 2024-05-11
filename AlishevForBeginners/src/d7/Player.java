package d7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private static int maxPlayersInField = 6;
    private String name;

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            players.add(new Player(10));
            players.get(0).info();
        }
        players.get(0).info();
        players.add(new Player(new Random().nextInt(100 + 1)));
        players.get(1).info();
        for (int i = 0; i < 100; i++) {
            int index = new Random().nextInt(players.size());
            players.get(index).run();
            players.get(index).info();
            Player.info();
        }
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {

            countPlayers++;
        };
        this.name = String.valueOf(countPlayers);
    }

    @Override
    public String toString() {
        return "Player{" +
                "stamina=" + stamina +
                ", name='" + name + '\'' +
                '}';
    }

    public void run() {
        if (stamina == 0) {
            return;}

        this.stamina--;
        if (this.stamina == 0) countPlayers--;
    }

    public static void info() {
        if (countPlayers < maxPlayersInField)
            System.out.println("Commands not complete. On field have " + (maxPlayersInField - countPlayers) + " places");
        else System.out.println("Commands complete");
    }

}
