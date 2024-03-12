package JavaSelfeduOOP.l17;

import java.util.Random;

public class RandomString {
    String type;
    static String[] NAMES = {"XiaolingCeng", "HugoSaha", "AnitaOrtega", "AnthonyZhan"};
    static Random rnd;

    {
        rnd = new Random();
    }

    static String giveMe(String type) {
        switch (type) {
            case "name":
                int length = NAMES.length;
                return NAMES[rnd.nextInt(length-1)];

            default:
                break;

        }

        return "";
    }
}

