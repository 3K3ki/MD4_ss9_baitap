package model.entity;

public class Product {
    private int id;
    private String name;
    private float price;
    private int quantity;
    private Catalog catalog;

    public Product() {
    }

    public Product(int id, String name, float price, int quantity, Catalog catalog) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.catalog = catalog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
}
