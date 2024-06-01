package finalProject.entity;

public enum TypeCell {
    EMPTY("."),
    SHIP("\u25CB"),
    SHOT("x"),
    OREOL ("-");

    private TypeCell(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }

    private  String representation;

}
