package Animal;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {
                new Animals("Zwierze"),
                new Dog("Kot"),
              
        };

        for (Animals animal : animals) {
            animal.makeSound();
        }
    }
}
