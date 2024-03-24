package Lection3;

import java.io.FileWriter;
import java.io.IOException;

public class SaveService {

    public void save() {
        System.out.println("save document started");
        try (FileWriter writer = new FileWriter("test")) {
            throw new IOException("operation failed");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
