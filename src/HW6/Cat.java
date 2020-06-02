package HW6;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int runDistance) {
        if (runDistance > 200) {
            System.out.println(name + " не сможет пробежать " + runDistance + " метров");
        } else if (runDistance <= 200) {
            System.out.println(name + " пробежала " + runDistance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }
}
