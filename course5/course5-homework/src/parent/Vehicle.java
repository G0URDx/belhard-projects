package parent;

public abstract class Vehicle {
    private String name;
    private int year;
    private int engineSize;

    public Vehicle(String name, int year, int engineSize) {
        this.name = name;
        this.year = year;
        this.engineSize = engineSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

}
