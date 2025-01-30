class Employee extends Person {
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

    public static void main(String[] args) {
        Person person1 = new Person("Jan", 25);
        person1.displayInfo();

        Person person2 = new Person("Anna");
        person2.displayInfo();

        Employee employee1 = new Employee("Kamil", 30, 5000.0, "Developer");
        employee1.displayInfo();
    }
}