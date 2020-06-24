package HW9.competitors;

public class Cat extends Animal {
    public Cat(String name) {
        this(name,1000,50,1);
    }

    public Cat(String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        super("Кошка", name, maxRunDistance, maxSwimDistance, maxJumpHeight);
    }
}
