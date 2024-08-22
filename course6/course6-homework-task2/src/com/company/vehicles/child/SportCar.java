package com.company.vehicles.child;

import com.company.details.Engine;
import com.company.professions.child.Driver;
import com.company.vehicles.parent.Car;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String brand, String classType, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, classType, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public SportCar(String brand, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "\nSuperCar information:" + "\nBrand: " + super.getBrand() + "\nWeight: "
                + super.getWeight() + "\nDriver: " + super.getDriver().getName() + "\nEngine manufacturer: "
                + super.getEngine().getManufacturer() + "\nEngine power: " + super.getEngine().getPower()
                + "\nMax speed: " + getMaxSpeed();
    }

}
