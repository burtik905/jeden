package Animal;

public class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Hau Hau");
    }
}
