package Netology.part2.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Vasily", "Dolgorukov Krymsky", 59));
        people.add(new Person("Pyotr", "Semyonov Tyan Shansky", 67));
        people.add(new Person("Arthur", "Conan Doyle", 71));
        people.add(new Person("Friedrich", "Schiller", 18));
        people.add(new Person("François", "Rabelais", 18));
        
        Collections.sort(people, (o1, o2) -> {
            int parts1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
            int parts2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
            int words = 2;
            if (Math.min(parts1, words) != Math.max(parts2, words)) {
                return Integer.compare(parts1, parts2);
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        });
        people.forEach(System.out::println);


    }
}
