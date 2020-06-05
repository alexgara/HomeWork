package HW7;

public class Cat {
    private String name;
    private int appetite;
    private int fullness;
    private int satiety;

    public Cat(String name, int appetite, int fullness, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        System.out.println(name + " идёт есть...");
        if (plate.decreaseFood(appetite) == true) {
            fullness += appetite;
            System.out.println(name + " наелся!\nСытость: " + fullness);
        } else if (plate.decreaseFood(appetite) == false) {
            System.out.println(name + ": Мне нужно больше! В миске недостаточно еды.");
        }
    }
}
