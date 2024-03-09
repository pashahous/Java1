package JavaSelfeduOOP.l12;

public class Line {
   int x,y;

    public Line(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printCoords(){

        System.out.printf("x=%d%ny=%d%n",x,y);
    }

    @Override
    public String toString() {
        return "Line{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
