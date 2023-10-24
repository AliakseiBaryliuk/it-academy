package by.itacademy.brest.class11.cw.interfaceexml;

public class ShipRoute implements Deliverable {
    @Override
    public void deliver() {
        System.out.println("By ship");
    }
}
