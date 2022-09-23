package Netology.part2.TreeMap;

import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    private int words;

    public PersonsComparator(int words) {
        this.words = words;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int surname1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
        int surname2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;

        if ((surname1>=words) != (surname2>=words)) {
            return Integer.compare(surname1, surname2);
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
