package JavaSelfeduOOP.l17;

import java.util.Random;

public class RandomString {
    String type;
    static String[] NAMES = {"XiaolingCeng", "HugoSaha", "AnitaOrtega", "AnthonyZhan"};
    static  Random rnd = new Random();;

    {

    }

    static String giveMe(String type) {
        switch (type) {
            case "name":
                int element = rnd.nextInt(NAMES.length);
                String str = NAMES[element];
                return str;
        }
        return "";
    }
}

