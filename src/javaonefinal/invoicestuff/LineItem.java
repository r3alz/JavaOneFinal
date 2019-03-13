package javaonefinal.invoicestuff;

public class LineItem {
    int id;
    String description;
    int qty;
    double price;

    public LineItem() {
        this.id = 1;
        this.description = "Rocket Launcher";
        this.qty = 1;
        this.price = 10000.00;
    }

    public LineItem(int id, String description, int qty, double price) {
        this();
        this.id = id;
        this.description = description;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
