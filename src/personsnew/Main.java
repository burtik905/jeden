package personsnew;

public class Main {
    public static void main(String[] args) {
        persontwo person1 = new persontwo("Jan", 25);
        person1.displayInfo();

        persontwo person2 = new persontwo("Anna");
        person2.displayInfo();

        Employee employee1 = new Employee("Kamil", 30, 5000.0, "Developer");
        employee1.displayInfo();
    }
}
