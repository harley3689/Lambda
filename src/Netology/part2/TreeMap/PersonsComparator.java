package Netology.part2.TreeMap;

import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    protected int words;

    public PersonsComparator(int words) {
        this.words = words;
    }

    /*@Override
    public int compare(Person o1, Person o2) {
        int surname1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
        int surname2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;

        if (surname1 > surname2 || surname1 < surname2) {
            return Integer.compare(surname1, surname2);
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }*/
    /*@Override
    public int compare(Person o1, Person o2) {
        String[] surname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] surname2 = o2.getSurname().split("\\P{IsAlphabetic}+");

            if ((surname1.length >= words) && (words <= surname2.length)) {
                return Integer.compare(surname1.length, surname2.length);
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
    }*/
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSize() > words && o2.getSize() > words) {
            return Integer.compare(o1.getSize(), o2.getSize());
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

}
