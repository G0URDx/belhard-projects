package com.company.vehicles.parent;

import com.company.details.Engine;
import com.company.professions.child.Driver;

public class Car {
    private String brand;
    private String classType;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car() {
    }

    public Car(String brand, String classType, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.classType = classType;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    // Lorry and SportCar constructor
    public Car(String brand, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    // #region Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    // #endregion

    public void start() {
        System.out.println("Start");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void turnRight() {
        System.out.println("Turn right");
    }

    public void turnLeft() {
        System.out.println("Turn left");
    }

    @Override
    public String toString() {
        return "\nCar information:" + "\nBrand: " + brand + "\nClass: " + classType + "\nWeight: "
                + weight + "\nDriver: " + driver.getName() + "\nEngine manufacturer: " + engine.getManufacturer()
                + "\nEngine power: " + engine.getPower();
    }
}
