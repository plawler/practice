package practice.strings;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {

    static private boolean containsDuplicateCharacters(String input) {
        Map<Character, Integer> counts = mapCounts(input);
        for (int count : counts.values()) {
            if (count > 1) return true;
        }
        return false;
    }

    private static boolean containsDuplicateCharacters2(String input) {
        boolean[] chars = new boolean[256];
        for (char c : input.toCharArray()) {
            if (chars[c]) return true;
            chars[c] = true;
        }
        return false;
    }

    private static Map<Character, Integer> mapCounts(String s) {
        Map<Character, Integer> counts = new HashMap<Character, Integer>();
        for (char character : s.toCharArray()) {
            int count = counts.get(character)==null ? 0 : counts.get(character);
            counts.put(character, ++count);
        }
        return counts;
    }

    public static void main(String[] args) {
        String[] dupes = {"babe", "dog", "window", "character"};
        for (String s : dupes) {
            System.out.println("The string '" + s + "'" + (containsDuplicateCharacters2(s) ? " has":" does not have") + " duplicate characters");
        }
    }

}
