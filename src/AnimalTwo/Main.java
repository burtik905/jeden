package AnimalTwo;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("Zwierze"),
                new Dog("Kot"),
                new Cat("Pies")
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
