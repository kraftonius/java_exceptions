package HW3.App;

import HW3.App.Checkers.*;
import HW3.App.Input.InputText;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App implements AutoCloseable {
    public App() {
    }

    public void run() throws IOException {
        // Запрашиваем у пользователя данные и считываем их
        InputText inputText = new InputText();
        String textForParsing = inputText.getInputText();

        // Показываем, что ввел пользователь
        System.out.println("Вы ввели:\n" + textForParsing);

        // Преобразуем данные и проверяем их количество
        String[] personDataArray = parse(textForParsing);
        IncomingDataChecker incomingDataChecker = new IncomingDataChecker(personDataArray);
        incomingDataChecker.checkData();

        // Проверяем Фамилию, Имя и Отчество
        NamesChecker namesChecker = new NamesChecker(null);
        for (int i = 0; i < 3; i++) {
            namesChecker.setName(personDataArray[i]);
            namesChecker.checkName();
        }

        // Проверяем Дату Рождения
        BirthdayChecker birthdayChecker = new BirthdayChecker(personDataArray[3]);
        birthdayChecker.checkBirthday();

        // Проверяем телефон
        PhoneChecker phoneChecker = new PhoneChecker(personDataArray[4]);
        phoneChecker.checkPhone();

        // Проверяем пол
        SexChecker sexChecker = new SexChecker(personDataArray[5]);
        sexChecker.checkSex();

        // Записываем в файл
        // Создаем строку для записи
        StringBuilder writeToFile = new StringBuilder();
        for (int i = 0; i < personDataArray.length; i++) {
            writeToFile.append("<").append(personDataArray[i]).append(">");
        }

        // Получаем доступ к папке с файлами
        Path currentPath = Paths.get("");
        String folderPath = currentPath.toAbsolutePath().getParent().toString();

        // Проверяем, существует ли такой файл
        File file = new File(folderPath, personDataArray[0] + ".txt");

        // Если файл существует, добавляем новую строку, иначе создаем новый файл и записываем в него
        if (file.exists()) {
            try (FileWriter writer = new FileWriter(file, true)) {
                writer.write("\n" + String.valueOf(writeToFile));
            } catch (IOException e) {
                throw new IOException("Ошибка при записи: " + file.getName());
            }
        } else {
            try {
                if (!file.createNewFile()) {
                    throw new IOException("Ошибка при создании файла: " + file.getName());
                }
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write(String.valueOf(writeToFile));
                } catch (IOException e) {
                    throw new IOException("Ошибка при записи: " + file.getName());
                }
            } catch (IOException e) {
                throw new IOException("Ошибка при создании файла: " + file.getName());
            }
        }
    }

    // Метод для разбора введенного текста на части
    public String[] parse(String text) {
        return text.split(" ");
    }

    @Override
    public void close() throws Exception {
    }
}
