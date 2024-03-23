package gb.sem1.levl2.les5;

public class SumOfArray {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];

    public static void main(String[] args) {

    }

    public static void sumOfArray() {
        long start = System.currentTimeMillis();



        System.out.println(System.currentTimeMillis() -start);
    }

    public static void sumOfArrayThread() {
        long start = System.currentTimeMillis();


        System.out.println(System.currentTimeMillis() -start);

    }

}
