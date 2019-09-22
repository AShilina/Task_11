/*Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран. */
import java.util.Scanner; // импорт сканера

public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String Stroka = in.nextLine();
        System.out.println("Вы ввели следующий текст: " + Stroka);
    }
}