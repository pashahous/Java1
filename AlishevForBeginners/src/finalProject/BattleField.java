package finalProject;

import finalProject.entity.Cell;
import finalProject.entity.Coordinates;
import finalProject.entity.Ship;
import finalProject.entity.TypeCell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BattleField {


    HashMap<Coordinates, Cell> mapCell = new HashMap<>();
    List<Ship> listOfShips = new ArrayList<>();

    public void addShip(int [] arr) {
        List<Coordinates> coordinates = generateCoordAndAddShip(arr);
        for (Coordinates coordinate : coordinates) {
            mapCell.put(coordinate, new Cell(TypeCell.SHIP));
        }
        listOfShips.add(new Ship(coordinates));


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
