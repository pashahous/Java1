package JavaSelfeduOOP;

import java.util.Random;

public class RandomStringUtils {
    String type;
    static String[] NAMES = {"XiaolingCeng", "HugoSaha", "AnitaOrtega", "AnthonyZhan"};
    static String[] ITEMS = {"pencil", "apple", "pen", "table", "table", "sviter", "kofta", "sapogi"};
    static  Random rnd = new Random();;

    {

    }

    public static String giveMe(String type) {
        switch (type) {
            case "name":
                return NAMES[ rnd.nextInt(NAMES.length)];
            case "item":
                return ITEMS[rnd.nextInt(ITEMS.length)];

        }
        return "";
    }
}

