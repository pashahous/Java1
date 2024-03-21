package gb.sem1.levl2.les3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class SortInHashMap {
    public static void main(String[] args) {
        testSortHashMap(1000);

    }

    public static void testSortHashMap(int length) {
        Map<Integer, String> intStrHashMap = new HashMap<>(1000);
        Random rnd = new Random();

        for (int i = 0; i < length; i++) {
            intStrHashMap.put(rnd.nextInt(1000), generateWord(5));
        }
        intStrHashMap.forEach((k, v) -> System.out.println(k + " " + v));
//        TreeMap<Integer,String> sortedTreeMap = new TreeMap<>((a,b)-> intStrHashMap.get(a)  intStrHashMap.get(b));
//TODO sort hashmap - string value
    }

    public static String generateWord(int length) {
        String charsString = "абвгдеёжзиклмнопрстухцчшщыюя";
        Random rnd = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(charsString.charAt(rnd.nextInt(charsString.length())));
        }
        return stringBuilder.toString();
    }
}
