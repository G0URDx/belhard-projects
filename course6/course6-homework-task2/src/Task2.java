import com.company.details.Engine;
import com.company.professions.child.Driver;
import com.company.vehicles.child.Lorry;
import com.company.vehicles.child.SportCar;
import com.company.vehicles.parent.Car;

public class Task2 {
    public static void main(String[] args) throws Exception {
        // Car
        Driver driver1 = new Driver("Steve", 38, 10);
        Engine engine1 = new Engine(320, "BMW");
        Car car = new Car("BWM", "S", 2500, driver1, engine1);
        System.out.println(car);

        // Sport Car
        Driver driver2 = new Driver("Tyler", 44, 14);
        Engine engine2 = new Engine(900, "AMG");
        SportCar sportCar = new SportCar("Pagani", 1800, driver2, engine2, 400);
        System.out.println(sportCar);

        // Lorry
        Driver driver3 = new Driver("John", 28, 8);
        Engine engine3 = new Engine(400, "Volvo");
        Lorry lorry = new Lorry("Volvo", 1800, driver3, engine3, 11000);
        System.out.println(lorry);
    }
}
