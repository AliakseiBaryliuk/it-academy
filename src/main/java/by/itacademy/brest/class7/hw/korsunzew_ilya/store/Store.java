package by.itacademy.brest.class7.hw.korsunzew_ilya.store;


import java.util.Objects;

public class Store {
    private Product[] products = new Product[50];

    public void addProduct(String name, int price, int quainstok, String description) {
        for (int i = 0; i < products.length; i++) {
            if (Objects.isNull(products[i])) {
                Product product1 = new Product(name, price, quainstok, description);
                products[i] = product1;
            }
        }
    }
    public void listProducts(){
        for (int i = 0; i < products.length; i++) {
           Product product =products[i];
            if (Objects.nonNull(product)){
                System.out.println(product.getPrice()+" "+product.getQuainstok()+" "+product.getDescription());
            }

        }

        }
}