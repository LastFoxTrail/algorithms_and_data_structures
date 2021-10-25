package search;

import java.util.ArrayList;
import java.util.List;

public class StringSearch {

    public static void main(String[] args) {
        String text =   "abcacbabcabca";
        String pattern = "abca";

        Search(text, pattern).stream().forEach(System.out::println);
    }

    public static List<Integer> Search(String str, String pattern) {
        List<Integer> found = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            int current = 0;

            while (current < pattern.length()
                    && i + current < str.length()
                    && pattern.charAt(current) == str.charAt(i + current)) {

                current++;
            }
            if (current == pattern.length()) {
                found.add(i);
            }
        }
        return found;
    }
}
