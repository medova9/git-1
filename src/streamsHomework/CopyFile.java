package streamsHomework;
//package com.htp.iooperations;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CopyFile {


    public static void main(String[] args) throws IOException {
        File file1 = new File("task1.txt");
        try (FileOutputStream out = new FileOutputStream(file1)) {
            Integer c;

            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                c = random.nextInt(57);
                if (c > 48)
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

        File file2 = new File("task2.txt");
        try (PrintWriter out = new PrintWriter(file2)) {
            out.println("На полянке у тропинки");
            out.println("Пробиваются травинки");
            out.println("С бугорка ручей бежит");
            out.println("А под ёлкой снег лежит");
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
