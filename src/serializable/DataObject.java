package serializable;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class DataObject extends NonSerializable implements Serializable {
    private int i = 0;
    private String s = "123";
    private transient String[] def = {"1", "2", "3"};
    CustomObject customObject = new CustomObject();

    @Override
    public String toString() {
        return "DataObject{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", def=" + Arrays.toString(def) +
                ", customObject=" + customObject +
                '}' + super.toString();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject(); //Вызывается всегда (стандартная сериализация)
        out.writeObject(getMyData());// Важно в одном порядке рид райт

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject(); //Вызывается всегда (стандартная сериализация)
        setMyData((String) in.readObject());
    }


}
