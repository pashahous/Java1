package finalProject;

import finalProject.entity.Coordinates;
import finalProject.entity.Ship;
import finalProject.entity.TypeCell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Board {
    private static int MAX_X = 10;
    private static int MAX_Y = 10;

    HashMap<Coordinates, TypeCell> mapCell = new HashMap<>();
    List<Ship> listOfShips = new ArrayList<>();

    public boolean addShip(int[] arr) {
        List<Coordinates> coordinates = generateCoordAndAddShip(arr);
        for (Coordinates coordinate : coordinates) {
            if (mapCell.containsKey(coordinate)) {
                System.out.println("This coordinate exists");
                return false;
            }
            mapCell.put(coordinate, TypeCell.SHIP);
        }
        listOfShips.add(new Ship(coordinates));
        return true;


    }

    public void render() {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        System.out.println("  -------------------");
        for (int y = 0; y < MAX_Y; y++) {
            System.out.print(y + "|");
            for (int x = 0; x < MAX_X; x++) {
                TypeCell typeCell= mapCell.get(new Coordinates(x, y));
                if (typeCell == null) {
                    System.out.print("⬜");
                } else
                System.out.print(typeCell.getRepresentation());
            }
            System.out.println("");

        }

    }


    private List<Coordinates> generateCoordAndAddShip(int[] arr) {
        List<Coordinates> listCoord = new ArrayList<>();
        if (arr.length == 4) {
            int xStart = arr[0];
            int yStart = arr[1];
            int xEnd = arr[2];
            int yEnd = arr[3];
            if (xStart == xEnd) {//vertikal
                for (int y = yStart; y <= yEnd; y++) {
                    listCoord.add(new Coordinates(xStart, y));
                }
            } else if (yStart == yEnd) {
                //horizontal
                for (int x = xStart; x <= xEnd; x++) {
                    listCoord.add(new Coordinates(x, yStart));
                }

            }
        } else if (arr.length == 2) {
            listCoord.add(new Coordinates(arr[0], arr[1]));

        }
        return listCoord;
    }

}
