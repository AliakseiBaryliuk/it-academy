package by.itacademy.brest.class7.hw.korsunzew_ilya.store;

public class Product {
    private String name;
    private int price;
    private int quainstok;
    private String description;

    public Product(String name, int price, int quainstok, String description) {
        this.name = name;
        this.price = price;
        this.quainstok = quainstok;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuainstok() {
        return quainstok;
    }

    public void setQuainstok(int quainstok) {
        this.quainstok = quainstok;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void sell(int quantity) {
        int tempqaun = this.quainstok - quantity;
        if (tempqaun < 0) {
            System.out.println("не достаточно товара");
        } else {
            this.quainstok = tempqaun;
        }
    }
    public void getDetails(){
        System.out.println(getPrice()+" "+getDescription()+" "+getQuainstok());

        }
    }
