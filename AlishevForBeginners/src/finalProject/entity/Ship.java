package finalProject.entity;

import finalProject.Coordinates;

public class Ship {
    static String representation  = Tile.SHIP.getRepresentation();
    Coordinates [] coordinates;

    public Ship(Coordinates[] coordinates) {
        this.coordinates = coordinates;
    }

}
