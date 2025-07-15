package ex.access;

public class Item {

    private String name;
    private int price;
    private int quantity;


    public Item(String Name, int Price, int Quantity) {
        this.name = Name;
        this.price = Price;
        this.quantity = Quantity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price*quantity;
    }

}
