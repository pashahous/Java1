package JavaSelfeduOOP.l16;

import JavaSelfeduOOP.RandomStringUtils;
import JavaSelfeduOOP.l17.Dimension;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<ShopItem> shopItemItems = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Dimension dimension =
                    new Dimension(rnd.nextInt(10) + 20,
                            rnd.nextInt(10) + 20,
                            rnd.nextInt(10) + 20);

            shopItemItems.add(new ShopItem(
                    RandomStringUtils
                            .giveMe("item"),
                    rnd.nextInt(20) + 100,
                    rnd.nextInt(20) + 40,
                    dimension));

        }
shopItemItems.forEach(x-> System.out.println("Item " + x.toString()));
        System.out.println(ShopItem.getCount());
    }
}
