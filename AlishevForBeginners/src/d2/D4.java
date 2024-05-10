package d2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class D4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
//            task1(new Random().nextInt(25) + 25);
            task2();
        }

    }

    private static void task2() {

        Random rnd = new Random();
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1001);
        }
        int maxEl=0;
        int minEl=Integer.MAX_VALUE;
        int countElEndWithZero=0;
        int sumOfElEndWithZero=0;

        for (int el:arr) {
           if (el>maxEl) maxEl = el;
           if(el<minEl) minEl = el;
           if (el%10 == 0)countElEndWithZero++;
           if ( el%10 == 0) sumOfElEndWithZero+=el;

        }
        System.out.printf("Max el %d\n Min el %d\ncountElEndWithZero = %d" +
                "\nsumOfElEndWithZero = %d\n",maxEl,minEl,countElEndWithZero,sumOfElEndWithZero);
    }

    private static void task1(int size) {
        Random rnd = new Random();
        System.out.println("Input size of array");

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(11);
        }
        System.out.println("Все числа");
        Arrays.stream(array).mapToObj(String::valueOf).map(str -> str + " ").forEach(System.out::print);
        System.out.println();
        System.out.println("Numbers > 8");
        Arrays.stream(array).filter(n -> n > 8).forEach(System.out::println);
        long count = Arrays.stream(array).filter(n -> n == 1).count();
        System.out.println("Count equals num 1: " + count);
        long even = Arrays.stream(array).filter(i -> i % 2 == 0).count();
        System.out.println("Count of even nums: " + even);

        long countOdd = Arrays.stream(array).filter(i -> i % 2 != 0).count();
        System.out.println("Count of odd nums: " + countOdd);

        int sumOfNums = Arrays.stream(array).sum();
        System.out.println("sum of all numd " + sumOfNums);

    }
    public static void task3(){

    }
}
