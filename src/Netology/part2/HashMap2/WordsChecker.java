package Netology.part2.HashMap2;

import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected String word;

    Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
        String[] str = text.split("\\P{IsAlphabetic}+");
        for (int i = 0; i < str.length; i++) {
            set.add(str[i]);
        }
    }

    public boolean word(String word) {
        this.word = word;
        return set.contains(word);
    }

}
