package gb.sem1.levl2.les5;

import java.util.Arrays;

public class SumOfArray {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;


    public static void main(String[] args) {
        sumOfArray();
        sumOfArrayThread();

    }

    public static void sumOfArray() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long start = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread "+ (System.currentTimeMillis() - start));
        System.out.println(arr[SIZE-1]);
    }

    public static void sumOfArrayThread() {
        float[] src = new float[SIZE];
        for (int i = 0; i < src.length; i++) {
            src[i] = 1.0f;
        }
        float[] dst1  = new float[HALF];
        float[] dst2  = new float[SIZE - HALF];

        long start = System.currentTimeMillis();

        System.arraycopy(src,0,dst1,0,dst1.length);
        System.arraycopy(src,dst2.length,dst2,0,dst2.length);

        Thread thr1 = new Thread(
                () -> {
                    for (int i = 0; i < dst1.length; i++) {
                        dst1[i] = (float) (dst1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                                Math.cos(0.4f + i / 2));
                    }
                }
        );
        Thread thr2 = new Thread(
                () ->{
                    for (int i = 0; i < dst2.length; i++) {
                        int i1 = i + SIZE - HALF;
                        dst2[i] = (float) (dst2[i] * Math.sin(0.2f + i1  / 5) * Math.cos(0.2f + i1/ 5) *
                                Math.cos(0.4f + i1 / 2));
                    }
                }
        );

        thr1.start();
        thr2.start();

        try {
            thr1.join();
            thr2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.arraycopy(dst1,0,src,0,HALF);
        System.arraycopy(dst2,0,src,SIZE- HALF,HALF);
        System.out.println("With 2 threads "+(System.currentTimeMillis() - start));
        System.out.println(src[SIZE-1]);

    }

}
