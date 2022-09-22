package Netology.part2.TreeMap;

import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    protected int words;

    public PersonsComparator(int words) {
        this.words = words;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] surname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] surname2 = o2.getSurname().split("\\P{IsAlphabetic}+");

        if ((surname1.length >= words) && (words <= surname2.length)) {
            return Integer.compare(surname1.length, surname2.length);
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
