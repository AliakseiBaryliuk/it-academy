package by.itacademy.brest.class7.hw.korsunzew_ilya.car;

public class Car {
   private String brand;
   private String model;
   private String yer;

    public Car(String brand, String model, String yer) {
        this.brand = brand;
        this.model = model;
        this.yer = yer;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYer(String yer) {
        this.yer = yer;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYer() {
        return yer;
    }
    public void start (){
        System.out.println("Start");

    }
    public void stop(){
        System.out.println("Stop");
    }
    public void getDetails(){
        System.out.println(getBrand()+" "+getYer()+" "+getModel());
    }
}
