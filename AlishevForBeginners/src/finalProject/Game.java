package finalProject;

import finalProject.entity.Player;

import java.util.Random;

public class Game {
    private Player plr1;
    private Player plr2;

    public void init() {
        printMessage("Game Sea Buttle");

        printMessage("Play in game? [Da=1] [Net=\" \"] another input");
        plr1 = new Player("1111");
        plr2 = new Player("2222");
//        if (!"1".equals(scr.nextLine().strip())) return;
//        printMessage("Enter name first player");
//        plr1.setName(scr.nextLine());
//        printMessage("Enter name second layer");
//        plr2.setName(scr.nextLine());
//        printMessage(String.format("Hello \"%s\" and \"%s\" lets play in game", plr1.getName(), plr2.getName()));
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
                if (!isHit) {
                    printMessage(" HIT THE SHIP, YOU CAN SHOT AGAIN");
                } else {
                    printMessage("You MISSED");
                    isFirstPlayerTurn = false;
                }
            } else {
                boolean isHit = plr2.makeShot(plr1.battleField);
                if (plr1.isGameOver()) {
                    printMessage(plr1.getName() + "  WIIIN!!!");
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