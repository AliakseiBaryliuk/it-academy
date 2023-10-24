package by.itacademy.brest.class11.cw.interfaceexml;

public class TaxiRoute implements Deliverable {
    @Override
    public void deliver() {
        System.out.println("By taxi");
    }
}
