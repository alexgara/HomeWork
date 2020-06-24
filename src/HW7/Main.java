package HW7;
import java.util.Random;

public class Main {
    static Random random;
    public static void main(String[] args) {

        Cat[] catArray = new Cat [3];
        int catCount = catArray.length;
        int[] realSatiety = RandomSatiety(catCount);
        int[] realAppetite = RandomAppetite(catCount, realSatiety);

        catArray [0] = new Cat("Луш",realAppetite[0], 0,realSatiety[0]);
        catArray [1] = new Cat("Финик",realAppetite[1],0,realSatiety[1]);
        catArray [2] = new Cat("Альф",realAppetite[2],0,realSatiety[2]);

        Plate plateMetal = new Plate("Миска",40);

        for (int i = 0; i < catArray.length; i++){
            catArray[i].eat(plateMetal);
            plateMetal.plateInfo();
        }

        plateMetal.setPlate(40);
        plateMetal.plateInfo();

    }
    public static int[] RandomSatiety(int b) {
        random = new Random();
        int[] satiety = new int[b];
        for (int i = 0; i < b; i++){
            satiety[i] = random.nextInt(100);
        }
        return satiety;
    }

    public static int[] RandomAppetite(int c,int[] arr) {
        random = new Random();
        int[] appetite = new int[c];
        for (int i = 0; i < c; i++){
            int maxAppetite = arr[i];
            appetite[i] = random.nextInt(maxAppetite);
        }
        return appetite;
    }
}
