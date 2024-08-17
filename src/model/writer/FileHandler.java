package model.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements Writer{

    private String filePath;

    @Override
    public boolean save (String data) {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.append(data);
            return true;
        } catch (IOException e) {
            System.out.println("Ошибка во время записи\n" + e);
            return false;
        }
    }

    @Override
    public void setPath(String filePath) {
        this.filePath = filePath;
    }
}
