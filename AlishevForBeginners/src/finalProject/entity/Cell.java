package finalProject.entity;

public class Cell {
    private static int MAX_X = 10;
    private static int MAX_Y = 10;
    public int x;
    public int y;
    TypeCell typeCell;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public static boolean isValid(int[] arr) {
        //проверка что координаты не выходят за границы поля
        if (arr.length == 2) {// check coordinate
            if (arr[0] < MAX_X && arr[0] >= 0 && arr[1] < MAX_Y && arr[1] >= 0) return true;
        } else if (arr.length == 4) {
            if (arr[0] < MAX_X && arr[0] >= 0 && arr[1] < MAX_Y && arr[1] >= 0
                    || arr[2] < MAX_X && arr[2] >= 0 && arr[3] < MAX_Y && arr[3] >= 0
            ) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cell)) return false;

        Cell that = (Cell) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}

