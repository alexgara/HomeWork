package HW6;

public abstract class Animal {
    String name;
    String color;
    int age;

    public Animal() {
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void run(int runDistance);

    public abstract void swim(int swimDistance);


}

