package org.example.creational;

import org.example.creational.builder.Car;

public class CarConfiguration {

    public static void main(String[] args) {

        Car honda = new Car.Builder()
                .setEngine("D18")
                .setTransmission("Automatic")
                .setInteriorType("Wooden")
                .setColor("Black")
                .setSunroof(true)
                .setAirBags(true)
                .build();

        Car toyota = new Car.Builder()
                .setEngine("V8")
                .setTransmission("Automatic")
                .setInteriorType("Matellic")
                .setColor("Black")
                .setSunroof(true)
                .setAirBags(true)
                .build();


        // Print car object
        System.out.println(honda);
        System.out.println(toyota);

    }
}
