package finalProject;

import finalProject.entity.Coordinates;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(generateCoordOfShip(new int[]{1, 3, 3, 3}));
        System.out.println(generateCoordOfShip(new int[]{0, 0, 3, 0}));
        System.out.println(generateCoordOfShip(new int[]{0, 0, 0, 3}));
        System.out.println(generateCoordOfShip(new int[]{0, 0, 0, 1}));
        Game game = new Game();
        game.init();
        game.start();
    }

    private static List<Coordinates> generateCoordOfShip(int[] arr) {
        List<Coordinates> listCoord = new ArrayList<>();
        if (arr.length == 0) throw new IllegalArgumentException("Wrong input");
        if (arr.length > 2) {
            int xStart = arr[0];
            int yStart = arr[1];
            int xEnd = arr[2];
            int yEnd = arr[3];
            if (xStart == xEnd) {//vertikal
                for (int y = yStart; y <= yEnd; y++) {
                    listCoord.add(new Coordinates(xStart, y));
                }
            } else if (yStart == yEnd) {
                //horizontal
                for (int x = xStart; x <= xEnd; x++) {
                    listCoord.add(new Coordinates(x, yStart));
                }
            }
        }
        return listCoord;
    }
}
