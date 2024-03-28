package gb.sem1.levl3.les3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swap {

    public static void main(String[] args) {
        String[] arrStr = {"1", "2", "3", "4", "5", "6", "7"};
        Integer[] arrInt = {1, 2, 3, 4, 5, 6, 7};
        List[] arr = {new ArrayList<>() {
            {
                add("1");
                add("2");
                add("3");
            }},
               new ArrayList<>()
            {
                {
                    add("4");
                    add("5");
                    add("6");
                }
            },
        new ArrayList<>()
            {
                {
                    add("7");
                    add("8");
                    add("9");
                }
            }
        };
        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arr));

        int spawIndDest = 2;
        swap(arrStr, 0, spawIndDest);
        swap(arrInt, 0, spawIndDest);
        swap(arr, 0, spawIndDest);

        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arr));

    }

        public static <T> void swap (T[]t,int indxSrc, int indDest){
            T temp;
            if ( indxSrc>= t.length && indDest >= t.length )
                throw new ArrayIndexOutOfBoundsException("Wrong input index");
            temp = t[indxSrc];
            t[indxSrc] = t[indDest];
            t[indDest] = temp;
        }

    }
