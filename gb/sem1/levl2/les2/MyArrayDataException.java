package gb.sem1.levl2.les2;

public class MyArrayDataException extends  NumberFormatException{
 int x;
 int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public MyArrayDataException(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyArrayDataException(String s, int x, int y) {
        super(s);
        this.x = x;
        this.y = y;
    }
}
