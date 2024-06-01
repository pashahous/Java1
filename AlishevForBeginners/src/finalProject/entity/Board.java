package finalProject.entity;

import java.util.*;

public class Board {
    private static final int MAX_X = 10;
    private static final int MAX_Y = 10;

    HashMap<Cell, TypeCell> mapCell = new HashMap<>();
    List<Ship> listOfShips = new ArrayList<>();
    Map<Cell,TypeCell> listOfShots = new HashMap<>();
//todo доделать отображение поля с выстрелами и подбитвыми кораблями
    public boolean shot(int [] cellCoord) {
        Cell cell = new Cell(cellCoord[0], cellCoord[1]);
        mapCell.put(cell,TypeCell.SHOT);
        for (Ship ship : listOfShips) {
            if(ship.shipDecks.containsKey(cell)){
                ship.shipDecks.put(cell,true);
                return true;
            }
        }
        return false;
    }

    public boolean addShip(int[] arr, int sizeShip) {
        List<Cell> cellOfShip = generateCoordOfShip(arr); // get cellOfShip;
        if (cellOfShip.size() != sizeShip) {
            System.out.println("Wrong coord to generate " + sizeShip + "-deck ship");
            return false;
        }
        List<Cell> cellsOfOreol = getGenerateOreols(cellOfShip);// get oreolList;
        for (Cell cell : cellOfShip) {
            if (mapCell.containsKey(cell)) {// проверяем есть ли в mapCell объект с такими же коориднатами,
                // сравнение клеток только по координатам
                System.out.println("This cell occupied");
                return false;
            }
        }
        for (Cell oreolCell : cellsOfOreol) {// add oreol list
            mapCell.put(oreolCell, TypeCell.OREOL);
        }

        for (Cell cell : cellOfShip) {// add ship in mapCell TODO дублирование типа клетки как в МАП так и в свойствах самой клетки
            mapCell.put(cell, TypeCell.SHIP);
        }

        listOfShips.add(new Ship(cellOfShip));
        return true;
    }

    private List<Cell> getGenerateOreols(List<Cell> cellListOfShip) {
        List<Cell> oreolList = new ArrayList<>();
        int[][] dirrection = {{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};
        for (Cell cell : cellListOfShip) {
            int x = cell.x;
            int y = cell.y;
            for (int[] ints : dirrection) {
                int yDir = y + ints[1];
                int xDir = x + ints[0];
                if (Cell.isValid(new int[]{xDir, yDir})) {
                    oreolList.add(new Cell(xDir, yDir));
                }
            }
        }
        return oreolList;
    }

    public void render() {
        System.out.println("  0123456789");
        for (int y = 0; y < MAX_Y; y++) {
            System.out.print(y + "|");
            for (int x = 0; x < MAX_X; x++) {
                TypeCell typeCell = mapCell.get(new Cell(x, y));
                System.out.print(Objects.requireNonNullElse(typeCell, TypeCell.EMPTY).getRepresentation());
            }
            System.out.println();
        }

    }

    private List<Cell> generateCoordOfShip(int[] arr) {
        List<Cell> listCoord = new ArrayList<>();
        if (arr.length == 4) {
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
        } else if (arr.length == 2) {
            listCoord.add(new Cell(arr[0], arr[1]));
        }
        return listCoord;
    }
}
