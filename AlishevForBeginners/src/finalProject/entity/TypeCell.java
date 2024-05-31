package finalProject.entity;

public enum TypeCell {
    EMPTY("."),
    SHIP("o"),
    SHOT("x"),
    OREOL ("\"");

    private TypeCell(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }

    private  String representation;

}
