package com.company.vehicles.child;

import com.company.details.Engine;
import com.company.professions.child.Driver;
import com.company.vehicles.parent.Car;

public class Lorry extends Car {
    private int maxCargo;

    public Lorry(String brand, String classType, int weight, Driver driver, Engine engine, int maxCargo) {
        super(brand, classType, weight, driver, engine);
        this.maxCargo = maxCargo;
    }

    public Lorry(String brand, int weight, Driver driver, Engine engine, int maxCargo) {
        super(brand, weight, driver, engine);
        this.maxCargo = maxCargo;
    }

    public int getMaxCargo() {
        return maxCargo;
    }

    public void setMaxCargo(int maxWeight) {
        this.maxCargo = maxWeight;
    }

    @Override
    public String toString() {
        return "\nLorry information:" + "\nBrand: " + super.getBrand() + "\nWeight: "
                + super.getWeight() + "\nDriver: " + super.getDriver().getName() + "\nEngine manufacturer: "
                + super.getEngine().getManufacturer() + "\nEngine power: " + super.getEngine().getPower()
                + "\nMax cargo: " + getMaxCargo();
    }

}
