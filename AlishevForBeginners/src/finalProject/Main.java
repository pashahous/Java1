package finalProject;

import finalProject.entity.Cell;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       Game game = new Game();
        game.init();
        game.start();
    }

    private static List<Cell> generateCoordOfShip(int[] arr) {
        List<Cell> listCoord = new ArrayList<>();
        if (arr.length == 0) throw new IllegalArgumentException("Wrong input");
        if (arr.length > 2) {
            int xStart = arr[0];
            int yStart = arr[1];
            int xEnd = arr[2];
            int yEnd = arr[3];
            if (xStart == xEnd) {//vertikal
                for (int y = yStart; y <= yEnd; y++) {
                    listCoord.add(new Cell(xStart, y));
                }
            } else if (yStart == yEnd) {
                //horizontal
                for (int x = xStart; x <= xEnd; x++) {
                    listCoord.add(new Cell(x, yStart));
                }
            }
        }
        return listCoord;
    }
}
