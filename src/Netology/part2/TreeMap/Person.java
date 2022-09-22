package Netology.part2.TreeMap;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private String[] surnameSize;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.surnameSize = surname.split("\\P{IsAlphabetic}+");
        this.age = age;
    }

    public int size() {
        int size = surnameSize.length;
        return size;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if(surname==o.surname){
            return Integer.compare(age,o.age);
        }else {
            return surname.compareTo(o.surname);
        }


    }

    @Override
    public String toString() {
        return (name + " " + surname + " " + ":" + age);
    }
}
