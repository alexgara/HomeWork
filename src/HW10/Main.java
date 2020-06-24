package HW10;

public class Main {

    static int SIZE = 4;

    public static void main(String[] args) {
        String [][] array = {
            {"4","4","4","4"},
            {"3","2","1","8"},
            {"5","6","???","8"},
            {"4","---","2","4"}
        };
        try {
            System.out.println(sum(array));
        } catch (MyArraySizeExeption e){
            e.printStackTrace();
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }
    }

    static int sum(String [][] array) throws MyArraySizeExeption, MyArrayDataException{
        if (array.length != SIZE) {
            throw new MyArraySizeExeption("Неправильный размер массива");
        }
        for (int i = 0; i < array.length; i++){
            if (array[i].length != SIZE){
                throw new MyArraySizeExeption("Неправильный размер массива");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw  new MyArrayDataException("Введены неверные значения в ячейке: " + i + ", " + j, i, j);
                }
            }
        }
        return sum;
    }
}
