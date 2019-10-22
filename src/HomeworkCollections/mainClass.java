package HomeworkCollections;

import java.util.*;
import java.util.function.Function;

public class mainClass {
    public static void main(String[] args) {
        System.out.println("1. Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на объекты класса Book. \n" +
                "List< Book > list = new LinkedList< Book >();\n" +
                "Вывести информацию о всех книгах. Программно удалить из коллекции вторую книгу, вывести на экран информацию о оставшихся книгах.");
        //new TreeSet<String>(Comparator.comparing(Integer::valueOf));
        List< Book > list = new LinkedList<>();
        list.add(new Book("Sun","Olga",1990,15));
        list.add(new Book("Moon","Tatiana",1915,145));
        list.add(new Book("Winter","Pavel",1990,73));
        System.out.println(list.toString());
        list.remove(1);
        System.out.println(list.toString());
        System.out.println("2. Создать экземпляр класса HashSet, добавить в него 25 ссылок на экземпляры класса " +
                "Book, предусмотреть не менее 6 одинаковых по значению книг. ");

        Set< Book > set = new HashSet<>();
        set.add(new Book("Sun","Olga","Migalevich","Evgen'evna",1990,15));
        set.add(new Book("Moon","Tatiana","Push","SZdgbds",1915,1));
        set.add(new Book("moon","Pavel","Gsadf","UKiz",1990,2));
        set.add(new Book("Moon","Tatiana","Efgad","ZFBV",1915,3));
        set.add(new Book("sun","Olga","SWssdf","Jsdad",1990,4));
        set.add(new Book("Sun","Tatiana","Ogsdf","TASF",1990,5));
        set.add(new Book("Sun","Olga","Migalevich","Evgen'evna",1990,15));
        set.add(new Book("Sun","Olga","Migalevich","Evgen'evna",1990,15));
        set.add(new Book("Winter","Pavel","GDSsd","ADF",1915,6));
        set.add(new Book("winter","Olga","QWeEF","ADF",1990,7));
        set.add(new Book("winter","Tatiana","sdfbgD","TAS",1915,8));
        set.add(new Book("Winter","Olga","yeJD","SFgsfdt",1990,9));
        set.add(new Book("Sun","Olga","iyoDFA","Wdfg",1990,15));
        set.add(new Book("winter","Tatiana","ywH","YYFds",1990,10));
        set.add(new Book("Sun","Olga","Migalevich","Evgen'evna",1990,15));
        set.add(new Book("Sun","Olga","Migalevich","Evgen'evna",1990,15));
        set.add(new Book("Sun","Olga","Migalevich","Evgen'evna",1990,15));
        set.add(new Book("Sun","Olga","Migalevich","Evgen'evna",1990,15));
        set.add(new Book("moon","Olga","asGFA","NSDs",1915,11));
        set.add(new Book("Moon","Pavel","aergaer","Yda",1990,12));
        set.add(new Book("moon","Pavel","aerhg","MasF",1990,13));
        set.add(new Book("Moon","Pavel","etjDG","uDDD",1915,14));
        set.add(new Book("Sun","Tatiana","afsdgADF","pAFFDSAB",1990,15));
        set.add(new Book("sun","Olga","Migalevich","Evgen'evna",1990,16));
        set.add(new Book("Sun","Tatiana","adfhgA","GSgs",1990,17));
        set.add(new Book("sun","Pavel","BAD","Uadfbg",1915,18));

        for (Book book : set) {
            System.out.println(book.toString());
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Вывести на экран информацию о книга" +
                " (содержащихся в коллекции HashSet), название которых начинается с гласной буквы.");
        for (Book book : set) {
            if(book.getTitle().charAt(0)==book.getTitle().toUpperCase().charAt(0)){
                System.out.println(book.toString());
            }
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("3. Отсортировать коллекцию из задания 2 по фамилии, затем по имени, по отчеству" +
                " (эти поля надо добавить в класс Book для автора книги).");

        ArrayList<Book> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);

        for (Book book : arrayList) {
            System.out.println(book.toString());
        }

    }


}
