package finalProject.entity;

public enum Type {
    EMPTY("⬜"),
    SHIP("\\uD83D\\uDEE5"),
    SHOT("\\uD83D\\uDFE5"),
    OREOL ("\\uD83D\\uDFE6 )");

    private Type(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }

    private  String representation;

}
