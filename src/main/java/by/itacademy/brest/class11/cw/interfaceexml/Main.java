package by.itacademy.brest.class11.cw.interfaceexml;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        DeliveryProcessor.addDeliverables(new TaxiRoute(), "taxi");

        DeliveryProcessor processor = new DeliveryProcessor();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String by = scanner.nextLine();

            if (by.equals("stop")){
                break;
            }
            processor.deliver(by);
        }
    }
}
