package by.itacademy.brest.class19.cw.practce.prod;

class Product {
    private String name;
    private String category;
    private String manufacturer;

    public Product(String name, String category, String manufacturer) {
        this.name = name;
        this.category = category;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
