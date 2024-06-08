package finalProject;

import finalProject.entity.Player;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player plr1;
    private Player plr2;
    private Scanner scr = new Scanner(System.in);

    public void init() {
        printMessage("Game Sea Buttle");
        plr1 = new Player();
        plr2 = new Player();
        printMessage("Enter name first player");
        plr1.setName(scr.nextLine());
        printMessage("Enter name second layer");
        plr2.setName(scr.nextLine());
        printMessage(String.format("Hello \"%s\" and \"%s\" lets play in game", plr1.getName(), plr2.getName()));
        plr1.setapShips();
        plr2.setapShips();
    }


    public void start() {
        Random rnd = new Random();
        printMessage("Random choice who shot first");

        boolean isFirstPlayerTurn = rnd.nextBoolean();
        while (true) {
            if (isFirstPlayerTurn) {
                boolean isHit = plr1.makeShot(plr2.battleField);
                if (plr2.isGameOver()) {
                    printMessage(plr1.getName() + "  WIIIN!!!");
                    return;
                }
                if (isHit) {
                    printMessage(" HIT THE SHIP, YOU CAN SHOT AGAIN");
                } else {
                    printMessage("You MISSED");
                    isFirstPlayerTurn = false;
                }
            } else {
                boolean isHit = plr2.makeShot(plr1.battleField);
                if (plr1.isGameOver()) {
                    printMessage(plr2.getName() + "  WIIIN!!!");
                    return;
                }

                if (isHit) {
                    printMessage(" HIT THE SHIP, YOU CAN SHOT AGAIN");
                } else {
                    printMessage("You MISSED");
                    isFirstPlayerTurn = true;
                }
            }
        }
    }

    private void printMessage(String string) {
        System.out.println(String.format("===== %s =====", string));
    }
}