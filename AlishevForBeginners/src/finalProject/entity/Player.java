package finalProject.entity;

import finalProject.Board;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    public Board battleField;
    private String name;
    private final Scanner scr;

    public Player() {
        this.scr = new Scanner(System.in);
        this.battleField = new Board();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeShot(Cell cell) {

    }

    public void addOneShip(int[] arr) {


    }

    public void setapShips() {
        battleField.render();
        printMessage(name + " enter ship position");
//        printMessage("Enter four , 1-deck ship");
//        requestShipCoordinate(4);
        printMessage("Enter three, 2-deck ship");
        requestShipCoordinate(3);
        printMessage("Enter two, 3-deck ship");
        requestShipCoordinate(2);
        printMessage("Enter one, 4-deck ship");
        requestShipCoordinate(1);
    }

    private void requestShipCoordinate(int numOfShips) {
        //request coordinate for new Ship
        for (int i = 0; i < numOfShips; i++) {
            while (true) {
                printMessage(numOfShips == 4 ? numberToOrdinal(i + 1) + " ship , in format (x y)" : numberToOrdinal(i + 1) + " ship in format (x y x y)");
                String[] split = scr.nextLine().strip().split(" ");
                if (split.length < 2) {
                    System.out.println("Empty input!!!");
                    break;
                }
                int[] intStream = null;
                try {
                    intStream = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
                } catch (NumberFormatException e) {
                    System.out.println("Input data must be" + (numOfShips == 4 ?
                            "  in format 'x y' " : " in format 'x y x y' ") + " your data " + Arrays.toString(split));
                    break;
                }
                int numOfCooord = numOfShips < 4 ? 4 : 2;
                if (split.length == numOfCooord && Cell.isValid(intStream)) {
                    int sizeShip = 5 - numOfShips;
                    if (battleField.addShip(intStream, sizeShip)) {
                        battleField.render();
                        break;
                    }
                }
                System.out.println("Input data must be" + (numOfShips == 4 ?
                        "  in format 'x y' " : " in format 'x y x y' ") + " your data " +
                        Arrays.toString(split));
            }

        }
    }

    private String numberToOrdinal(int i) {
        switch (i) {
            case 1:
                return "First(1)";
            case 2:
                return "Second(2)";
            case 3:
                return "Third(3)";
            case 4:
                return "Fourth(4)";
        }
        return "";

    }

    private void printMessage(String string) {
        System.out.println(String.format("===== %s =====", string));
    }
}
