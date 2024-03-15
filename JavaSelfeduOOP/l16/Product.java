package JavaSelfeduOOP.l16;

public class Product {
    private int id;
    private Enum type;
    private int price;

    private Product() {
    }

    public Product(int id, Enum type, int price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Enum getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
