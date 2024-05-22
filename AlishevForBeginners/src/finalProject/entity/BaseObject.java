package finalProject.entity;

import finalProject.Coordinates;

abstract public class BaseObject {
    Coordinates coordinates;

    public BaseObject(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}