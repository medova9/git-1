package streamsHomework;
//package com.htp.iooperations;

import java.io.*;
import java.util.*;

public class CopyFile {


    public static void main(String[] args) throws IOException {
//Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
//По итогу получить файл с отсортированным массивом чисел
        File file1 = new File("task1.txt");
        try (FileOutputStream out = new FileOutputStream(file1)) {
            Integer c;

            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                c = random.nextInt(57);
                if (c >= 48)
                    out.write(c);
            }
        }


        List<Integer> arrayList = new ArrayList<>();
        try (FileInputStream is = new FileInputStream(file1)) {
            int b;
            while ((b = is.read()) != -1) {
                arrayList.add(b);
            }
        }
        arrayList.sort(Integer::compareTo);

        try (FileOutputStream out = new FileOutputStream(file1)) {
            Integer c;


            for (int i = 0; i < arrayList.size(); i++) {
                out.write(arrayList.get(i));
            }
        }
//Прочитать строки из файла и поменять местами первое и последнее слова в каждой строк.
        File file2 = new File("task2.txt");
        try (PrintWriter out = new PrintWriter(file2)) {
            out.println("На полянке у тропинки");
            out.println("Пробиваются травинки");
            out.println("С бугорка ручей бежит");
            out.println("А под ёлкой снег лежит");
        }
        try (FileReader fileReader = new FileReader(file2);
             BufferedReader in = new BufferedReader(fileReader)) {
            String str;
            while ((str = in.readLine()) != null) {
                LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(str.split(" ")));

                String buf = linkedList.getFirst();
                linkedList.removeFirst();
                linkedList.addFirst(linkedList.getLast());
                linkedList.removeLast();
                linkedList.addLast(buf);

                str = "";
                for (String s : linkedList) {
                    str += s + " ";
                }
                str = str.trim();
                System.out.println(str);
            }
        }
//Разместить в файле любой текст, разбить его на абзацы, предложения, слова, вывести статистику по тексту.
//Ко всему этому использовать паттерн Chain of Responsibilities.
        File file3 = new File("task3.txt");
        String str = "В Java для описания работы по вводу/выводу используется специальное понятие " +
                "поток данных (stream).\n" +
                "Поток данных связан с некоторым источником или приемником данных, " +
                "способных получать или предоставлять информацию. " +
                "Соответственно, потоки делятся на входные читающие данные, и на " +
                "выходные передающие (записывающие) данные.\n" +
                "Введение концепции stream позволяет отделить программу, обменивающуюся " +
                "информацией одинаковым образом с любыми устройствами, от низкоуровневых " +
                "операций с такими устройствами ввода/вывода.\n" +
                "Потоки данных это упорядоченные последовательности данных, которым " +
                "соответствует определенный источник (source) (для потоков ввода) или получатель " +
                "(destination) (для потоков вывода).\n" +
                "Классы ввода-вывода Java исключают необходимость вникать в особенности " +
                "низкоуровневой организации операционных систем и предоставляют доступ к " +
                "системным ресурсам посредством методов работы с файлами и иных инструментов.";
        try (PrintWriter out = new PrintWriter(file3)) {
            out.print(str);
        }


        str = "";
        String s;
        try (FileReader fileReader = new FileReader(file3);
             BufferedReader in = new BufferedReader(fileReader)) {
            while ((s = in.readLine()) != null) {
                str+=s+"\n";
            }

        }
        System.out.println(str);
        if (str != "") {

            Text text;
            text = new Text();
            text.setCheck(
                    new WordCheck(text).addCheck(
                            new SentenceCheck(text).addCheck(
                                    new ParagraphCheck(text).addCheck(
                                            new DefaultCheck(text)
                                    )
                            )
                    )
            );
            Structure structure = new Structure();
            for (char c : str.toCharArray()) {
                structure = text.checker(structure, c);
            }
            System.out.println(structure);
        }
    }


    //ByteStreams
//    public static void main(String args[]) throws IOException {
//        try (FileInputStream in = new FileInputStream("input.txt");
//             FileOutputStream out = new FileOutputStream("output.txt")) {
//
//            int c;
//            while ((c = in.read()) != -1) {
//                out.write(c);
//            }
//        }
//    }

    //Character streams
//    public static void main(String args[]) throws IOException {
//
//        try (FileReader in = new FileReader("input.txt");
//             FileWriter out = new FileWriter("output.txt")) {
//
//            int c;
//            while ((c = in.read()) != -1) {
//                out.write(c);
//            }
//        }
//    }

    //Standart streams
//    public static void main(String args[]) throws IOException {
//        InputStreamReader cin = null;
//
//        try {
//            cin = new InputStreamReader(System.in);
//            System.out.println("Enter characters, 'q' to quit.");
//            char c;
//            do {
//                c = (char) cin.read();
//                System.out.print(c);
//            } while(c != 'q');
//        }finally {
//            if (cin != null) {
//                cin.close();
//            }
//        }

    //FileStreamTest
//    public static void main(String args[]) {
//
//        try {
//            byte bWrite [] = {11,21,3,40,5};
//            OutputStream os = new FileOutputStream("test.txt");
//            for(int x = 0; x < bWrite.length ; x++) {
//                os.write( bWrite[x] );   // writes the bytes
//            }
//            os.close();
//
//            InputStream is = new FileInputStream("test.txt");
//            int size = is.available();
//
//            for(int i = 0; i < size; i++) {
//                System.out.print((char)is.read() + "  ");
//            }
//            is.close();
//        } catch (IOException e) {
//            System.out.print("Exception");
//        }
//    }

    //Create directory
//    public static void main(String args[]) {
//        String dirname = "/tmp/user/java/bin";
//        File d = new File(dirname);
//
//        // Create directory now.
//        d.mkdirs();
//    }

    //Read directory
//    public static void main(String[] args) {
//        File file = null;
//        String[] paths;
//
//        try {
//            // create new file object
//            file = new File("/tmp");
//
//            // array of files and directory
//            paths = file.list();
//
//            // for each name in the path array
//            for(String path:paths) {
//                // prints filename and directory name
//                System.out.println(path);
//            }
//        } catch (Exception e) {
//            // if any error occurs
//            e.printStackTrace();
//        }
//    }

    //serialization
//    public static void main(String [] args) {
////        Employee e = new Employee();
////        e.name = "Reyan Ali";
////        e.address = "Phokka Kuan, Ambehta Peer";
////        e.SSN = 11122333;
////        e.number = 101;
//
//        try {
//            FileOutputStream fileOut =
//                    new FileOutputStream("/tmp/employee.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(e);
//            out.close();
//            fileOut.close();
//            System.out.printf("Serialized data is saved in /tmp/employee.ser");
//        } catch (IOException i) {
//            i.printStackTrace();
//        }
//    }

    //deserializing
//    public static void main(String [] args) {
//        Employee e = null;
//        try {
//            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            e = (Employee) in.readObject();
//            in.close();
//            fileIn.close();
//        } catch (IOException i) {
//            i.printStackTrace();
//            return;
//        } catch (ClassNotFoundException c) {
//            System.out.println("Employee class not found");
//            c.printStackTrace();
//            return;
//        }
//
//        System.out.println("Deserialized Employee...");
//        System.out.println("Name: " + e.name);
//        System.out.println("Address: " + e.address);
//        System.out.println("SSN: " + e.SSN);
//        System.out.println("Number: " + e.number);
//    }
}

class Structure {
    private int paragraphs = 0;
    private int sentences = 0;
    private int words = 0;

    public Structure() {
    }

    public int getParagraphs() {
        return paragraphs;
    }

    public void increaseParagraphs() {
        this.paragraphs ++;
    }

    public int getSentences() {
        return sentences;
    }

    public void increaseSentences() {
        this.sentences++;
    }

    public int getWords() {
        return words;
    }

    public void increaseWords() {
        this.words ++;
    }

    @Override
    public String toString() {
        return "Structure{" +
                "paragraphs=" + paragraphs +
                ", sentences=" + sentences +
                ", words=" + words +
                '}';
    }
}

// Интерфейс обработчиков.
interface TextCheck {
    Structure check(Structure str, Character symbol);
}

class DefaultCheck implements TextCheck {
    protected DefaultCheck check;
    protected Text text;
    public DefaultCheck(Text text) {
        this.text = text;
    }

    public DefaultCheck addCheck(DefaultCheck check) {
        this.check = check;
        return this;
    }

    @Override
    public Structure check(Structure str, Character symbol) {
        if(check!= null){
            return check.check(str,symbol);
        } else {
            //System.out.println("DefaultCheck::check()");
            return str;
        }
    }
}

class ParagraphCheck extends DefaultCheck implements TextCheck {
    public ParagraphCheck(Text text) {
        super(text);
    }

    @Override
    public Structure check(Structure structure, Character symbol) {
        String s = symbol.toString();
        if (s.matches("\n") == true)
        {
            structure.increaseParagraphs();
        }
        return super.check(structure,symbol);
    }
}

class SentenceCheck extends DefaultCheck implements TextCheck {
    public SentenceCheck(Text text) {
        super(text);
    }

    @Override
    public Structure check(Structure structure, Character symbol) {
        String s = symbol.toString();
        if (s.matches("[!?.]") == true)
        {
            structure.increaseSentences();
        }
        return super.check(structure,symbol);
    }
}

class WordCheck extends DefaultCheck implements TextCheck {
    public WordCheck(Text text) {
        super(text);
    }

    @Override
    public Structure check(Structure structure, Character symbol) {
        String s = symbol.toString();
        if (s.matches("[ \n]") == true)
        {
            structure.increaseWords();
        }
        return super.check(structure,symbol);
    }
}

class Text {
    protected Structure structure;
    protected Character symbol;
    private DefaultCheck check;

    public Text() {
    }

    protected void setCheck(DefaultCheck check) {
        this.check = check;
    }

    public Structure checker(Structure structure, Character symbol) {
        return check.check(structure, symbol);
    }
}