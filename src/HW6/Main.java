package HW6;

public class Main {
    public static void main(String[] args) {
        int allCats = 0;
        int allDogs = 0;

        Cat catLusha = new Cat("Луша","серая", 2);
        allCats++;
        Dog dogZhuzha = new Dog("Жужа", "чёрная", 1, 1000);
        allDogs++;
        Dog dogUnzha = new Dog("Унжа", "чёрно-белая", 8, 700);
        allDogs++;

        int allAnimals = allCats + allDogs;
        System.out.println("Котов: " + allCats + " шт.\nПёселей: " + allDogs + " шт.\nВсего животных: " + allAnimals + " шт.\n");

        catLusha.run(150);
        catLusha.swim(5);
        dogZhuzha.run(1100);
        dogZhuzha.swim(5);
        dogUnzha.run(800);
        dogUnzha.swim(10);
    }
}
