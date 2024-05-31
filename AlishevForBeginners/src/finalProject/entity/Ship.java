package finalProject.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ship {
    public static String representation = TypeCell.SHIP.getRepresentation();
    public Map<Cell, Boolean> shipDecks;

    public Ship(List<Cell> cell) {
        // add coord of deck in Ship class with parameter True, this mean what deck of ship is not  damage
        this.shipDecks = new HashMap<>();
        for (Cell coordinate : cell) {
            this.shipDecks.put(coordinate, true);
        }
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "shipDecks=" + shipDecks.keySet() +
                '}';
    }

    public boolean isAlive() {
         return shipDecks.values().stream().allMatch(v->!v);
     }
}
