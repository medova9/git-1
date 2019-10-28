package HomeworkCollections;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class mainClass {
    public static void main(String[] args) {
        System.out.println("1. Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на объекты класса Book. \n" +
                "List< Book > list = new LinkedList< Book >();\n" +
                "Вывести информацию о всех книгах. Программно удалить из коллекции вторую книгу, вывести на экран информацию о оставшихся книгах.");
        //new TreeSet<String>(Comparator.comparing(Integer::valueOf));
        List<Book> list = new LinkedList<>();
        list.add(new Book("Sun", "Olga", 1990, 15));
        list.add(new Book("Moon", "Tatiana", 1915, 145));
        list.add(new Book("Winter", "Pavel", 1990, 73));
        System.out.println(list.toString());
        list.remove(1);
        System.out.println(list.toString());
        System.out.println("2. Создать экземпляр класса HashSet, добавить в него 25 ссылок на экземпляры класса " +
                "Book, предусмотреть не менее 6 одинаковых по значению книг. ");

        Set<Book> set = new HashSet<>();
        set.add(new Book("Sun", "Olga", "Migalevich", "Evgen'evna", 1990, 15));
        set.add(new Book("Moon", "Tatiana", "Push", "SZdgbds", 1915, 1));
        set.add(new Book("moon", "Pavel", "Gsadf", "UKiz", 1990, 2));
        set.add(new Book("Moon", "Tatiana", "Efgad", "ZFBV", 1915, 3));
        set.add(new Book("sun", "Olga", "SWssdf", "Jsdad", 1990, 4));
        set.add(new Book("Sun", "Tatiana", "Ogsdf", "TASF", 1990, 5));
        set.add(new Book("Sun", "Olga", "Migalevich", "Evgen'evna", 1990, 15));
        set.add(new Book("Sun", "Olga", "Migalevich", "Evgen'evna", 1990, 15));
        set.add(new Book("Winter", "Pavel", "GDSsd", "ADF", 1915, 6));
        set.add(new Book("winter", "Olga", "QWeEF", "ADF", 1990, 7));
        set.add(new Book("winter", "Tatiana", "sdfbgD", "TAS", 1915, 8));
        set.add(new Book("Winter", "Olga", "yeJD", "SFgsfdt", 1990, 9));
        set.add(new Book("Sun", "Olga", "iyoDFA", "Wdfg", 1990, 15));
        set.add(new Book("winter", "Tatiana", "ywH", "YYFds", 1990, 10));
        set.add(new Book("Sun", "Olga", "Migalevich", "Evgen'evna", 1990, 15));
        set.add(new Book("Sun", "Olga", "Migalevich", "Evgen'evna", 1990, 15));
        set.add(new Book("Sun", "Olga", "Migalevich", "Evgen'evna", 1990, 15));
        set.add(new Book("Sun", "Olga", "Migalevich", "Evgen'evna", 1990, 15));
        set.add(new Book("moon", "Olga", "asGFA", "NSDs", 1915, 11));
        set.add(new Book("Moon", "Pavel", "aergaer", "Yda", 1990, 12));
        set.add(new Book("moon", "Pavel", "aerhg", "MasF", 1990, 13));
        set.add(new Book("Moon", "Pavel", "etjDG", "uDDD", 1915, 14));
        set.add(new Book("Sun", "Tatiana", "afsdgADF", "pAFFDSAB", 1990, 15));
        set.add(new Book("sun", "Olga", "Migalevich", "Evgen'evna", 1990, 16));
        set.add(new Book("Sun", "Tatiana", "adfhgA", "GSgs", 1990, 17));
        set.add(new Book("sun", "Pavel", "BAD", "Uadfbg", 1915, 18));

        for (Book book : set) {
            System.out.println(book.toString());
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Вывести на экран информацию о книга" +
                " (содержащихся в коллекции HashSet), название которых начинается с гласной буквы.");
        for (Book book : set) {
            if (book.getTitle().charAt(0) == book.getTitle().toUpperCase().charAt(0)) {
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
        System.out.println("---------------------------------------------------------------------");
        System.out.println("4. Создать экземпляр класса TreeSet, поместить в него объекты класса Student(надо его " +
                "спроектировать). Вывести на экран информацию о каждом чётном в списке студенте, каждого нечётного" +
                " студента удалить из коллекции.\n");
        Set<Student> treeSet = new TreeSet<>((s1, s2) -> {
            if (s1.getSurname().compareTo(s2.getSurname()) > 0) return 1;
            if (s1.getSurname().compareTo(s2.getSurname()) < 0) return -1;
            if (s1.getSurname().compareTo(s2.getSurname()) == 0) {
                if (s1.getName().compareTo(s2.getName()) > 0) return 1;
                if (s1.getName().compareTo(s2.getName()) < 0) return -1;
                if (s1.getName().compareTo(s2.getName()) == 0) return 0;
            }
            return 0;
        });
        treeSet.add(new Student("Анна", "Шеин", LocalDate.of(1990, Month.APRIL, 25)));
        treeSet.add(new Student("Татьяна", "Романовская", LocalDate.of(1990, Month.APRIL, 25)));
        treeSet.add(new Student("Ольга", "Мигалевич", LocalDate.of(1987, Month.JANUARY, 8)));
        treeSet.add(new Student("Павел", "Швед", LocalDate.of(1990, Month.OCTOBER, 17)));
        for (Student student : treeSet) {
            System.out.println(student);
        }
        Iterator<Student> iterator = treeSet.iterator();
        int i = 1;
        List<Student> removeList = new ArrayList<>();


        while (iterator.hasNext()) {
            if (i % 2 == 1) {
                removeList.add(iterator.next());
            } else iterator.next();
            i++;
        }
        treeSet.removeAll(removeList);
        System.out.println("-----------------------------РЕЗУЛЬТАТ-------------------------------");
        for (Student student : treeSet) {
            System.out.println(student);
        }


        System.out.println("---------------------------------------------------------------------");
        System.out.println("5. Создать экземпляр класса HashMap, разместить в нём следующую информацию: в качестве" +
                " ключа  - категория товара в каталоге (catalog.onliner.by) в качестве значения - количество товар" +
                "ов в данной категории. Сортировать коллекцию по количеству товаров в каждой категории, найти кате" +
                "горию в которой содержится максимальное количество товаров, удалить все категории в которых нет н" +
                "и одного товара (предусмотреть такие категории при заполнении коллекции)");

        Map<String, Integer> map = new HashMap<>();
        map.put("Электродрели и дрели-шуруповерты",3027);
        map.put("Перфораторы",829);
        map.put("Наборы ручных инструментов",6572);
        map.put("Электроотвертки",89);
        map.put("Шуруповерты, винтоверты",104);
        map.put("Аккумуляторы и зарядные устройства для инструмента",748);
        map.put("Дрели-миксеры",146);
        map.put("Угловые шлифмашины (болгарки)",1242);
        map.put("Шлифмашины",0);
        map.put("Полировальные машины",61);
        map.put("Мультитулы",144);
        map.put("Дисковые пилы",683);
        map.put("Сабельные пилы",131);
        map.put("Лобзики",444);
        map.put("Рубанки",0);
        map.put("Строительный, слесарный, монтажный инструмент",534);
        map.put("Ящики для инструментов",593);
        map.put("Фрезеры",158);
        map.put("Промышленные фены",189);
        map.put("Термоклеевые пистолеты",89);
        map.put("Граверы",121);
        map.put("Хозяйственные пылесосы",292);
        map.put("Краскораспылители",155);
        map.put("Штроборезы",0);
        map.put("Плиткорезы",323);
        map.put("Паяльники и паяльные лампы",166);
        map.put("Аппараты для сварки труб",89);
        map.put("Электрические отбойные молотки",103);
        map.put("Электрические ножницы по металлу",46);
        map.put("Скобозабиватели, гвоздезабиватели, степлеры",160);
        map.put("Диагностические тепловизоры и пирометры",24);

        TreeSet<Map.Entry<String,Integer>> sortedEntries = new TreeSet<>(
                (s1, s2) -> {
                    if (s1.getValue().compareTo(s2.getValue()) > 0) return 1;
                    if (s1.getValue().compareTo(s2.getValue()) < 0) return -1;
                    if (s1.getValue().compareTo(s2.getValue()) == 0) {
                        if (s1.getKey().compareTo(s2.getKey()) > 0) return 1;
                        if (s1.getKey().compareTo(s2.getKey()) < 0) return -1;
                        if (s1.getKey().compareTo(s2.getKey()) == 0) return 0;
                    }
                    return 0;
                }
        );
        sortedEntries.addAll(map.entrySet());

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry);
        }
        System.out.println("-----------------------------MAX-------------------------------");
        System.out.println(sortedEntries.last());

        Iterator<Map.Entry<String, Integer>> iterator1 = sortedEntries.iterator();
        List<Map.Entry<String, Integer>> removeListEntries = new ArrayList<>();

        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> entry = iterator1.next();
            if ( entry.getValue() == 0) {
                removeListEntries.add(entry);
            }
        }
        sortedEntries.removeAll(removeListEntries);
        System.out.println("-----------------------------РЕЗУЛЬТАТ-------------------------------");
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry);
        }



    }


}
