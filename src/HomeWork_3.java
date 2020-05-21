import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {
    static Scanner sc;
    static Random random;
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        random = new Random();

        GuessingGame();
    }
    public static void GuessingGame() {
        int randomNumber = random.nextInt(9);
        int maxTry = 3;
        for (int i = maxTry - 1; i >= 0; i--) {
            System.out.println("Отгадай число от 0 до 9!");
            int userAnswer = sc.nextInt();
            if (userAnswer == randomNumber) {
                System.out.printf("Поздравляю! Ты угадал!\nПравильный ответ: %d\n\n", randomNumber);
                break;
            } else if (userAnswer <= randomNumber) {
                System.out.printf("Не угадал!\nТвоё число оказалось меньше\nОсталось попыток: %d\n\n", i);
            } else if (userAnswer >= randomNumber) {
                System.out.printf("Не угадал!\nТвоё число оказалось больше\nОсталось попыток: %d\n\n", i);
            }
            if (i == 0) {
                System.out.printf("Ты проиграл!\nЧтобы начать заново нажми: 1\nЧтобы завершить игру: 0\n", i);
                int userLastAnswer = sc.nextInt();
                    if (userLastAnswer == 1){
                        GuessingGame();
                    } else if (userLastAnswer == 1);{
                        break;
                }
            }
        }
    }
}
