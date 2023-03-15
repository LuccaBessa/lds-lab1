package Serializer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DataSerializer {
    public static <T extends Serializable> void serialize(PersistentData<T> persistentData, String fileName)
            throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(persistentData);
        }
    }
}
