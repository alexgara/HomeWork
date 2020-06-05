package HW7;

public class Plate {
    private int food;
    private String name;

    public Plate(String name, int food) {
        this.food = food;
        this.name = name;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int amount){
        if (food < amount){
            return false;
        } else if (food >= amount){
            food -= amount;
        }
        return true;
    }

    public void plateInfo(){
        System.out.println(name + ": " + food + "\n");
    }

    public void setPlate(int newFood){
        food += newFood;
    }

}
