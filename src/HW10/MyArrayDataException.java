package HW10;

public class MyArrayDataException extends RuntimeException {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public MyArrayDataException (String message, int x, int y){
        super(message);
        this.x = x;
        this.y = y;
    }
}
