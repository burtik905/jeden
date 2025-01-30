class Person {
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    Person(String name) {
        this(name, 18);
    }


    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {

        Person person1 = new Person("Jan", 25);
        person1.displayInfo();


        Person person2 = new Person("Anna");
        person2.displayInfo();
    }
}


