package model.writer;

import java.io.ObjectInputStream;
import java.io.*;

public class FileHandler extends Writer {
    private String filePath;

    @Override
    public void save(Serializable serializable) {
        try {
            java.io.ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            objectOutputStream.writeObject(serializable);
            }catch (Exception e) {
                e.printStackTrace();
            }
    }

    @Override
    public Object read() {
        try {
            java.io.ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
            return objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    @Override
    public void setPath(String path) {
        this.filePath = filePath;
    }
}
