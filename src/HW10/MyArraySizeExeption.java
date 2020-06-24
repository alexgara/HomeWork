package HW10;

public class MyArraySizeExeption extends RuntimeException {

    private int number;

    public int getNumber() {
        return number;
    }

    public MyArraySizeExeption (int number){
        this.number = number;
    }

    public MyArraySizeExeption (String message, int number){
        super(message);
        this.number = number;
    }

    public MyArraySizeExeption (String message){
        super(message);
    }
}
