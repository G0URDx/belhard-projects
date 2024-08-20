package child.animal;

import parent.Animal;

public class Cat extends Animal {

    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat: " + getName() + " is meowing");
    }

    public void makeHiss() {
        System.out.println("Cat: " + getName() + " is hissing");
    }

}
