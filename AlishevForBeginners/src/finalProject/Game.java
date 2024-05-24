package finalProject;

import finalProject.entity.Coordinates;
import finalProject.entity.Player;

import java.util.Scanner;

public class Game {
    private Scanner scr = new Scanner(System.in);
    private Player plr1 = new Player();
    private Player plr2 = new Player();

    public void init() {
        print("Game Sea Buttle");

        print("Play in game? [Da=1] [Net= ] another input");
        if (!"1".equals(scr.nextLine().strip())) return;
        print("Enter name first player");
        plr1.setName(scr.nextLine());
        print("Enter name second layer");
        plr2.setName(scr.nextLine());
        print(String.format("Hello \"%s\" and \"%s\" lets play in game", plr1.getName(), plr2.getName()));
        print("Player =1= enter ship position");
        print("Enter 4 one deck ship");
        for (int i = 0; i < 4; i++) {
            plr1.battleField.addShip(getCoordFromConsole());

        }


    }

    private Coordinates getCoordFromConsole() {
        String s = scr.nextLine();
    }

    public void start() {
    }


    private void print(String string) {
        System.out.println(String.format("===== %s =====", string));
    }
}