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

    public void makeShot(Coordinates coordinates) {

    }

    public void addOneShip(int[] arr) {


    }

    public void addShips() {
        printMessage(name + " enter ship position");
//        printMessage("Enter 4, 1-deck ship");
//        requestShipCoordinate(4);
        printMessage("Enter 3, 2-deck ship");
        requestShipCoordinate(3);
        printMessage("Enter 2, 3-deck ship");
        requestShipCoordinate(2);
        printMessage("Enter 1, 4-deck ship");
        requestShipCoordinate(1);
    }

    private void requestShipCoordinate(int numOfShips) {
        for (int i = 0; i < numOfShips; i++) {
            while (true) {
                printMessage("Enter: " + (i + 1) + " ship , in format '5,5'");
                String[] split = scr.nextLine().strip().split(" ");
                if (split.length < 2) {
                    System.out.println("Empty input!!!");
                    break;
                }
                int[] intStream = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
                int numOfCooord = numOfShips < 4 ? 4 : 2;
                if (split.length == numOfCooord && Coordinates.isValid(intStream)) {
                    if (battleField.addShip(intStream)) {
                        break;
                    }
                }
                System.out.println("Input data must be 'x,x' your data " + Arrays.toString(split));
            }

        }
    }

    private int[] parseArrToCoordinates(int[] arr) {
        if (arr.length == 2) {
            int x0 = arr[0];
            int y0 = arr[1];

            return new int[]{x0, y0};
        } else if (arr.length == 4) {
            int x0 = arr[0];
            int y0 = arr[1];
            int x1 = arr[2];
            int y1 = arr[3];
            return new int[]{x0, y0, x1, y1};
        }
        return new int[]{};

    }


    private void printMessage(String string) {
        System.out.println(String.format("===== %s =====", string));
    }

}
