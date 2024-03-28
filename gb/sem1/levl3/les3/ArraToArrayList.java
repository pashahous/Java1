package gb.sem1.levl3.les3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraToArrayList {


    public static void main(String[] args) {
        String[] arrStr = {"1", "2", "3"};
        Integer[] arrInt = {1, 2, 3};
        ArrayList<String> stringArrayList = arrToArrList(arrStr);
        ArrayList<Integer> integerArrayList = arrToArrList(arrInt);

        System.out.println(stringArrayList);
        System.out.println(integerArrayList);

    }

    public static <T> ArrayList<T> arrToArrList(T[] t) {
        ArrayList<T> arr = new ArrayList<>();
        arr.addAll(0, Arrays.asList(t));
        return arr;
    }
}
