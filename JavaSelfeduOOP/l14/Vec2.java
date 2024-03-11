package JavaSelfeduOOP.l14;

import JavaSelfeduOOP.l13.Point;

public class Vec2 {
    private final static Integer MAX_VAL = 1000;
    Point a;
    Point b;

    {
        this.a.setY(0);
        this.a.setX(0);
        this.b.setX(0);
        this.b.setY(0);
    }

    public Vec2() {
    }

    public Vec2 sum(Vec2 vec2){

        return new Vec2();
    }
    public Vec2(Point a, Point b) {
        if (isValid(a)) this.a = a;
        if (isValid(b)) this.b = b;

    }

    private boolean isValid(Point a) {
        return -MAX_VAL <= a.getX() && a.getX() <= MAX_VAL && -MAX_VAL <= a.getY() && a.getY() <= MAX_VAL;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        if (isValid(a))
            this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        if(isValid(b))
        this.b = b;
    }


}
