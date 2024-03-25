package gb.sem1.levl3.les3;

public class Box<T extends Number> {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(new Integer[]{10,20,30});
        Box<Double> box2 =  new Box<>(new Double[]{10.0,20.0,30.0});
        System.out.println(box.getAvg());
        System.out.println(box2.getAvg());
    }
    private T[] t;

    public void setT(T[] t) {
        this.t = t;
    }

    public Box(T[] t) {
        this.t = t;
    }

    public double getAvg(){
        double d = 0.0;
        for (int i = 0; i < t.length; i++) {
            d+=t[i].doubleValue();
        }
        return d;
    }
}
