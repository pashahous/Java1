package JavaSelfeduOOP.l16;

import JavaSelfeduOOP.l17.Dimension;

public class ShopItem {
    private static int count = 0;
    private String name;
    private int price;
    private int weight;
    private Dimension dimension;
    private int id;

    @Override
    public String toString() {
        return "ShopItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", dimension=" + dimension +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    private ShopItem() {
    }

    public ShopItem(String name, int price, int weight, Dimension dimension) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.dimension = dimension;
        this.id = count ++;
    }
}
