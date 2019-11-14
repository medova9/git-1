package streamIAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Tasks {
    public static List<Person> filterAge(List<Person> list, Predicate<Person> predicate) {
       return list
                .stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Коля",40));
        list.add(new Person("Оля",23));
        list.add(new Person("Оля",23));
        list.add(new Person("Петя",45));
        list.add(new Person("Галя",30));
        list.add(new Person("Коля",40));
        list.add(new Person("Оксана",38));
        list.add(new Person("Коля",63));

        Predicate<Person> predicate = n-> n.getAge() > 20;

        List<Person> list20 = filterAge(list, predicate);

        System.out.println(list20);
        Double average = list
                .stream()
                .filter(n -> (n.getName().toUpperCase().toCharArray()[0] + "").toLowerCase().matches("[уеыаоэяию]"))
                .mapToInt(Person::getAge)
                .average().orElse(0);
        System.out.println(average);

        //3) отфильтровать и вывести уникальные объекты в взрасте превышающий средний возраст всех людей
        Double old = list
                .stream()
                .mapToInt(Person::getAge)
                .average().orElse(0);
        System.out.println(old);
        List<Person> collect = filterAge(list, n -> n.getAge() > old)
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);




    }
}
class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
//gettersm setters, toString
}