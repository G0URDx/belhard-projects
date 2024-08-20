import java.io.*;

public class CarBean implements Serializable {

    private String color;
    private String year;

    public CarBean() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
