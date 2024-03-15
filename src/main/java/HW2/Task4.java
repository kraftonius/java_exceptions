//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package HW2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Пустые строки вводить нельзя");
        }
        System.out.println("Введенная строка: " + input);
    }
}
