package JavaSelfeduOOP.l13;

public class Rect {
    Integer x1, y1, x2, y2;
    {
        x1=0; y1=0; x2=0; y2 = 0;
    }

    public Rect() {
    }

    public Rect(Point p1, Point p2) {
        this.x1 = p1.getX();
        this.y1 = p1.getY();
        this.x2 = p2.getX();
        this.x2 = p2.getY();
    }

    public Rect(Integer x1, Integer y1, Integer width, Integer height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }
}
