package by.itacademy.brest.class7.hw.merkulov_oleg.store;

public class Product {
    private String name;
    private int price;
    private int quantityInStock;
    private String description;

    public Product(String name, int price, int quantityInStock, String description) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.description = description;
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

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void sell(int quantity) {
        if (quantity <= quantityInStock) {
            quantityInStock -= quantity;
            System.out.println(quantity + " " + name + " sold.");
        } else {
            System.out.println("Not enough " + name + " in stock.");
        }
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
        System.out.println("Description: " + description);
    }
}
