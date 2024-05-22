package finalProject;

public class Coordinates {
    int x;
    int y;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinates that)) return false;

        if (x != that.x) return false;
        return y == that.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

