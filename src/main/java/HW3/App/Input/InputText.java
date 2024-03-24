package HW3.App.Input;

import java.util.Scanner;

public class InputText {

    String text;
    public InputText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Введите через пробел
                Фамилия - только бувы киррилицы
                Имя - только бувы киррилицы
                Отчество - только бувы киррилицы
                Дата Рождения в формате дд.мм.гггг
                телефон - без форматирования начиная с восьмерки 89101234567
                Пол - буква латиницей f - жен, m - муж)
                Пример:
                Иванов Иван Иванович 01.01.2001 89101234567 m
                """);
        text = scanner.nextLine();
    }

    public String getInputText(){
        return text;
    }
}
