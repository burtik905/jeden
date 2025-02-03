package person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", 25);
        person1.displayInfo();

        Person person2 = new Person("Anna");
        person2.displayInfo();
    }
}
