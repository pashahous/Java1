package finalProject.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ship {
    public static String representation = TypeCell.SHIP.getRepresentation();
    public Map<Coordinates, Boolean> shipDecks;

    public Ship(List<Coordinates> coordinates) {
        // add coord of deck in Ship class with parameter True, this mean what deck of ship is not  damage
        this.shipDecks = new HashMap<>();
        for (Coordinates coordinate : coordinates) {
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
