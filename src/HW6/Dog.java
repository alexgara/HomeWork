package HW6;

public class Dog extends Animal {
    int maxRunDistance;

    public Dog(String name, String color, int age, int maxRunDistance) {
        super(name, color, age);
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public void run(int runDistance) {
        if (runDistance > maxRunDistance) {
            System.out.println(name + " не сможет пробежать " + runDistance + " метров");
        } else if (runDistance <= maxRunDistance){
            System.out.println(name + " пробежала " + runDistance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println(name + " не сможет проплывёт " + distance + " метров");
        } else if (distance <= 10){
            System.out.println(name + " проплыла " + distance + " метров");
        }
    }
}
