package Animal;

public class Main {
    public static void main(String[] args) {
        Animals genericAnimal = new Animals("Zwierze");
        genericAnimal.makeSound();

        Dog dog = new Dog("Ben");
        dog.makeSound();
    }
}
