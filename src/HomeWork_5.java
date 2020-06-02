import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork_5 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Workers worker1 = new Workers("Иванов", "Иван", "Иванович", "Директор", "inanovii@box.ru", "8(999)888-77-66", 250000, 44);
        Workers worker2 = new Workers("Петров", "Пётр", "Петрович", "Зам. директора", "petrovpp@box.ru", "8(988)877-66-55", 150000, 40);
        Workers worker3 = new Workers("Сергеев", "Сергей", "Сергеевич", "Начальник отдела", "sergeevss@box.ru", "8(977)866-55-44", 100000, 37);
        Workers worker4 = new Workers("Семёнов", "Семён", "Семёнович", "Гланый специалист", "semenovss@box.ru", "8(966)855-44-33", 80000, 33);
        Workers worker5 = new Workers("Федоров", "Федор", "Федорович", "Ведущий специалист", "fedorovff@box.ru", "8(955)844-33-22", 60000, 27);

        Workers[] workArray = new Workers[ 5 ];
        workArray[ 0 ] = new Workers("Иванов", "Иван", "Иванович", "Директор", "inanovii@box.ru", "8(999)888-77-66", 250000, 44);
        workArray[ 1 ] = new Workers("Петров", "Пётр", "Петрович", "Зам. директора", "petrovpp@box.ru", "8(988)877-66-55", 150000, 40);
        workArray[ 2 ] = new Workers("Сергеев", "Сергей", "Сергеевич", "Начальник отдела", "sergeevss@box.ru", "8(977)866-55-44", 100000, 37);
        workArray[ 3 ] = new Workers("Семёнов", "Семён", "Семёнович", "Гланый специалист", "semenovss@box.ru", "8(966)855-44-33", 80000, 33);
        workArray[ 4 ] = new Workers("Федоров", "Федор", "Федорович", "Ведущий специалист", "fedorovff@box.ru", "8(955)844-33-22", 60000, 27);

        findRightAge(workArray);
    }

    public static void findRightAge(Workers[] workArray) {
        for (int i = 0; i < workArray.length; i++) {
            if (workArray[i].allAge() >= 40) {
                workArray[i].info();
            }
        }
    }
}

