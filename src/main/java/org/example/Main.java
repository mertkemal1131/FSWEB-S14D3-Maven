package org.example;

import org.example.arge.*;
import org.example.company.*;

public class Main {
    public static void main(String[] args) {

        // ==================== Pacific Car Company ====================
        System.out.println("===== Pacific Car Company =====\n");

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println();

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println();

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        System.out.println();

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        // ==================== Car R&D Company ====================
        System.out.println("\n===== Car R&D Company =====\n");

        CarSkeleton gasCar = new GasPoweredCar("GasCar X1", "A powerful gas-powered car", 12.5, 6);
        gasCar.startEngine();
        gasCar.drive();

        System.out.println();

        CarSkeleton electricCar = new ElectricCar("ElectriQ", "A fully electric vehicle", 450.0, 75);
        electricCar.startEngine();
        electricCar.drive();

        System.out.println();

        CarSkeleton hybridCar = new HybridCar("HybriDrive", "A smart hybrid vehicle", 20.0, 8, 4);
        hybridCar.startEngine();
        hybridCar.drive();
    }
}