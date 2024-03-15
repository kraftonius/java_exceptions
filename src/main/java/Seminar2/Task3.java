package Seminar2;

import java.io.*;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        String s = "G:\\!Core\\Geekbrains\\JavaExceptions\\JavaExceptions\\src\\main\\java\\Seminar2\\text.txt";
        try {
            List<String[]> list = readFromFile(s);
            replaceVopros(list);
            writeToFile(s, list);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static List<String[]> readFromFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String[]> list = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line.split("="));
        }
        return list;
    }

    public static void replaceVopros(List<String[]> list) {
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i)[1].equals("?") && checkString(list.get(i)[1]))) {
                throw new RuntimeException("Некорректные данные!");
            }
            if (list.get(i)[1].equals("?")) {
                int buf = list.get(i)[0].length();
                String[] r = {list.get(i)[0], String.valueOf(buf)};
                list.set(i, r);
            }
        }
    }

    public static boolean checkString(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void writeToFile(String path, List<String[]> list) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String[] item : list
        ) {
            bufferedWriter.write(item[0] + "=" + item[1] + "\n");
        }
        bufferedWriter.close();
    }

}
