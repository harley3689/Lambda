package Netology.part2.TreeMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Vasily", "Dolgorukov Krymsky", 59));
        people.add(new Person("Pyotr", "Semyonov Tyan Shansky", 67));
        people.add(new Person("Arthur", "Conan Doyle", 71));
        people.add(new Person("Friedrich", "Schiller", 45));
        people.add(new Person("François", "Rabelais", 55));
        Collections.sort(people, new PersonsComparator(2));
        Collections.reverse(people);
        System.out.println(people);
    }
}
