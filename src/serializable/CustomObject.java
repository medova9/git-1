package serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Когда нужен полный контроль над тем, какая информация серриализуется
public class CustomObject implements Externalizable {
    private transient boolean b = true;

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "b=" + b +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //out.writeObject(isB());

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //setB((boolean) in.readObject());
    }
}
