package JavaSelfeduOOP.l13;

public class Triangle {
    Integer x1,y1,x2,y2,x3,y3;
    {
        x1=x2=x3=y1=y2=y3=0;
    }
    Triangle(){}

    public Triangle(Integer x1, Integer y1, Integer x2, Integer y2, Integer x3, Integer y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", x3=" + x3 +
                ", y3=" + y3 +
                '}';
    }
}
