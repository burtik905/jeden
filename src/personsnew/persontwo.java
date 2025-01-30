package personsnew;

class persontwo {
    private String name;
    private int age;

    public persontwo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public persontwo(String name) {
        this(name, 18);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
