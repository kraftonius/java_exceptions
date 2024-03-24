package Seminar3.Task3;

import java.io.File;
import java.io.FileNotFoundException;

public class FileNotFoundE extends FileNotFoundException {
    public FileNotFoundE(){
        super("Файл не найден");
    }
    public FileNotFoundE(String path){
        super("Файл с путем " + path + " не найден");
    }
}
