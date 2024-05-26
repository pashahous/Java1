package finalProject.entity;

import finalProject.BattleField;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player {
    private BattleField battleField;
    private String name;
    private Scanner scr;

    public Player() {
        Scanner scr = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeShot(Coordinates coordinates) {

    }

    public void addShips() {
        printMessage(name + " enter ship position");
        printMessage("Enter 4 single-deck ship");
        for (int i = 0; i < 4; i++) {
            String[] split;
            while (true) {
                printMessage("Enter: " + i + 1 + " ship , in format '5,5'");
                split = scr.nextLine().split(",");
                if (split.length == 2) {
                    break;
                }
                System.out.println("Input data must be 'x,x' your data " + split.toString());
            }
            parseStrToCoordinates(split);

        }
    }

    private int[] parseStrToCoordinates(String[] inputDataString) {
        if (inputDataString.length == 1) {
            int x0 = Integer.parseInt(inputDataString[0].strip());
            int y0 = Integer.parseInt(inputDataString[1].strip());

            return new int[]{x0, y0};
        } else {
            int x0 = Integer.parseInt(inputDataString[0].strip());
            int y0 = Integer.parseInt(inputDataString[2].strip());
            String[] str = inputDataString[0].split(" ");
            int x1 = Integer.parseInt(str[0].strip());
            int y1 = Integer.parseInt(str[1].strip());
            return new int[]{x0, y0, x1, y1};
        }

    }

    private void generateCoordAndAddShip(int[] arr) {
        List<Coordinates> listCoord = new ArrayList<>();
        if (arr.length > 2) {
            int xStart = arr[0];
            int yStart = arr[1];
            int xEnd = arr[2];
            int yEnd = arr[3];
            if (xStart == xEnd) {//vertikal
                for (int y = yStart; y <= yEnd; y++) {
                    listCoord.add(new Coordinates(xStart, y));
                }
                battleField.a
            } else if (yStart == yEnd) {
                //horizontal
                for (int x = xStart; x <= xEnd; x++) {
                    listCoord.add(new Coordinates(x, yStart));
                }

            }
        } else {

        }
    }


    private void printMessage(String string) {
        System.out.println(String.format("===== %s =====", string));
    }

}
