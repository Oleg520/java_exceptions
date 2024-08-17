package model.writer;

public interface Writer {
    boolean save(String data);

    void setPath(String filePath);
}
