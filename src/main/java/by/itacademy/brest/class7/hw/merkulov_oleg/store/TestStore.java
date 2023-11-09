package by.itacademy.brest.class7.hw.merkulov_oleg.store;

import by.itacademy.brest.class7.hw.merkulov_oleg.store.Store;

public class TestStore {
    public static void main(String[] args) {
        Store store = new Store();
        System.out.println("Start");
        store.addProduct("Iphone",1000,15,"Iphone 14 Pro");
        store.addProduct("Phone",900, 15,"Samsung Galaxy S23 Ultra ");
        store.addProduct("Laptop",2000,10,"Lenovo Legion5 Pro");
        store.addProduct("Tablet",1300,10,"iPad Pro 2023");
        store.addProduct("TV",3500, 8,"Samsung 55 OLED 4K S95C ");
        store.addProduct("TV",3500, 8,"Samsung 55 OLED 4K S95C ");
        store.listProduct();
        store.sellProduct("Phone",1);
        store.sellProduct("Iphone",1);
        System.out.println("**************");
        store.listProduct();
        System.out.println("Finish");
    }
}
