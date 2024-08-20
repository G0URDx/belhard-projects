import child.animal.Cat;
import child.animal.Dog;
import java.util.ArrayList;
import java.util.Scanner;

public class Course5Homework {
    public static void main(String[] args) throws Exception {
        // Cat cat = new Cat("Garfield", 8, 11);
        // cat.printInfo();
        // cat.makeSound();
        // cat.makeHiss();

        // Dog dog = new Dog("Beethoven", 11, 29);
        // dog.printInfo();
        // dog.makeSound();
        // dog.makeHowl();

        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean active = true;
        while (active) {
            System.out.println("\nMenu:");
            // Animals
            System.out.println("1. Add animals");
            System.out.println("2. Print animals");
            System.err.println("3. Activities animals");
            // Vehicles
            System.out.println("4. Add vehicles");
            System.out.println("5. Print vehicles");
            System.out.println("6. Activities vehicles");
            // Other
            System.out.println("7. Exit");
            System.out.print("Input: ");

            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter 'cat' or 'dog': ");
                    String animalType = scanner.next();
                    if (animalType.equals("cat")) {
                        System.out.println("Enter cats name:");
                        String name = scanner.next();
                        System.out.println("Enter cats age:");
                        int age = scanner.nextInt();
                        System.out.println("Enter cats weight:");
                        int weight = scanner.nextInt();
                        Cat cat = new Cat(name, age, weight);
                        cats.add(cat);
                    } else if (animalType.equals("dog")) {
                        System.out.println("Enter dogs name:");
                        String name = scanner.next();
                        System.out.println("Enter dogs age:");
                        int age = scanner.nextInt();
                        System.out.println("Enter dogs weight:");
                        int weight = scanner.nextInt();
                        Dog dog = new Dog(name, age, weight);
                        dogs.add(dog);
                    } else {
                        System.out.println("Error! Enter 'cat' or 'dog'!");
                    }
                    break;
                case 2:
                    System.out.println("\nCats:");
                    for (Cat cat : cats) {
                        cat.printInfo();
                    }
                    System.out.println("\nDogs:");
                    for (Dog dog : dogs) {
                        dog.printInfo();
                    }
                    break;
                case 3:
                    System.out.println("\nCats activities:");
                    for (Cat cat : cats) {
                        cat.makeSound();
                        cat.makeHiss();
                    }
                    System.out.println("\nDogs activities:");
                    for (Dog dog : dogs) {
                        dog.makeSound();
                        dog.makeHowl();
                    }
                    break;
                case 7:
                    System.out.println("Press enter to close the programm");
                    System.console().readLine();
                    active = false;
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}
