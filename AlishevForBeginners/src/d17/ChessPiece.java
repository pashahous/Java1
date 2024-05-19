package d17;

public enum ChessPiece {


    BLACK_KING("♔", 100),
    BLACK_QUEEN("♕", 9),
    BLACK_ROOK("♖", 5),
    BLACK_BISHOP("♗", 3.5),
    BLACK_KNIGHT("♘", 3),
    BLACK_PAWN("♙", 1),
    WHITE_KING("♚", 100),
    WHITE_QUEEN("♛", 9),
    WHITE_ROOK("♜", 5),
    WHITE_BISHOP("♝", 3.5),
    WHITE_KNIGHT("♞", 3),
    WHITE_PAWN("♟", 1),
    EMPTY(" ", -1);

    private String repretentation;
    private double pricePiece;

    private ChessPiece(String strName, double pricePiece) {
        this.repretentation = strName;
        this.pricePiece = pricePiece;
    }

    public String getRepretentation() {
        return repretentation;
    }

    public double getPricePiece() {

        return pricePiece;
    }

}
