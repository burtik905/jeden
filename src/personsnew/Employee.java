package personsnew;

public class Employee extends persontwo {
    private double salary;
    private String position;

    public Employee(String name, int age, double salary, String position) {
        super(name, age);
        this.salary = salary;
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: " + position + ", Salary: " + salary);
    }
}
