package by.itacademy.brest.class7.hw.korsunzew_ilya.car;

import java.util.Objects;

public class CarFactory {
    private Car[] cars = new Car[50];

    public Car getCar(String model, String brand, String year) {
        Car car = new Car(brand, model, year);
        for (int i = 0; i < cars.length; i++) {
            if (Objects.isNull(cars[i])) {
                cars[i] = car;
                return car;
            }
        }
        return null;
    }
    public void listCars(){
        for (int i = 0; i < cars.length; i++) {
            Car car= cars[i];
            if (Objects.nonNull(cars[i])){
                System.out.println(cars[i].getBrand()+ " "+cars[i].getModel()+" "+cars[i].getModel());
            }

        }
    }
}

