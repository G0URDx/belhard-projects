package child.animal;

import parent.Animal;

public class Dog extends Animal {

    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog: " + getName() + " is barking");
    }

    public void makeHowl() {
        System.out.println("Dog: " + getName() + " is howling");
    }

}
