package finalProject;

import finalProject.entity.Coordinates;
import finalProject.entity.Player;
import finalProject.entity.Ship;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Scanner scr = new Scanner(System.in);
    private Player plr1 = new Player();
    private Player plr2 = new Player();

    public void init() {
        printMessage("Game Sea Buttle");

        printMessage("Play in game? [Da=1] [Net= ] another input");
        if (!"1".equals(scr.nextLine().strip())) return;
        printMessage("Enter name first player");
        plr1.setName(scr.nextLine());
        printMessage("Enter name second layer");
        plr2.setName(scr.nextLine());
        printMessage(String.format("Hello \"%s\" and \"%s\" lets play in game", plr1.getName(), plr2.getName()));



    }



    public void start() {
    }


    private void printMessage(String string) {
        System.out.println(String.format("===== %s =====", string));
    }
}