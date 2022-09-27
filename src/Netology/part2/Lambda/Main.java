package Netology.part2.Lambda;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Vasily", "Dolgorukov Krymsky", 5));
        people.add(new Person("Pyotr", "Semyonov Tyan Shansky", 60));
        people.add(new Person("Arthur", "Conan Doyle", 17));
        people.add(new Person("Friedrich", "Schiller", 18));
        people.add(new Person("François", "Rabelais", 65));

        people.removeIf(person -> person.getAge() < 18);
        people.forEach(System.out::println);
    }
}

