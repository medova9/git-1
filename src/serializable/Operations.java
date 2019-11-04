package serializable;

import java.io.*;

public class Operations {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataObject obj = new DataObject();
        obj.setMyData("Строчка в супер");
        File file = new File("store.bin");

        //Запись в файл

        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream so = new ObjectOutputStream(fo);
        so.writeObject(obj);
        so.flush();
        so.close();
        //Чтение из файла
        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream si = new ObjectInputStream(fi);
        DataObject objNew = (DataObject) si.readObject();
        si.close();
        System.out.println(obj);
        System.out.println(objNew);


    }
}
