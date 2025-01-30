package AnimalTwo;

import Animal.Animals;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Miau Miau");
    }
}