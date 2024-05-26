package finalProject;

import finalProject.entity.Cell;
import finalProject.entity.Coordinates;
import finalProject.entity.Ship;

import java.util.HashMap;

public class BattleField {
    private static int MAX_X = 10;
    private static int MAX_Y = 10;

    HashMap<Coordinates, Cell> mapCell = new HashMap<>();
    HashMap<Coordinates, Ship> listOfShips = new HashMap<>();

    void addShip(Coordinates [] coordShip) {

    }

}
