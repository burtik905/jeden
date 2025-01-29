package Animal;

import Animal.Animals;

class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Miau Miau");
    }
}