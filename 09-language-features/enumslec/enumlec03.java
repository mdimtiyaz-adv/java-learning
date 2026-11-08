enum Laptop {
    Mackbook(2000), Asus(2200), Lenovo(1900), Acer;

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class enumlec03 {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Mackbook;
        // System.out.println(lap + ":" + lap.getPrice());
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + ":" + lap.getPrice());
        }
    }
}
