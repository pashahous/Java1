package finalProject.entity;

import java.util.List;
import java.util.Map;

public class Ship {
    public static String representation = Type.SHIP.getRepresentation();
    public Map<Coordinates, Boolean> shipDecks;

    public Ship(List<Coordinates> coordinates) {
        // add coord of deck in Ship class with parametr True, this mean what deck of ship is note damage
        for (Coordinates coordinate : coordinates) {
            this.shipDecks.put(coordinate, true);
        }

    }

    public boolean isAlive() {
         return shipDecks.values().stream().allMatch(v->!v);
     }
    public static String getRepresentation() {
        return representation;
    }

}
