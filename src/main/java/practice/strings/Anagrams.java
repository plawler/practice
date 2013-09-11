package practice.strings;

/**
 * Created with IntelliJ IDEA.
 * User: paul
 * Date: 9/10/13
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Anagrams {

    public static void main(String[] args) {
        System.out.println(anagrams("parliament", "partialmen"));
        System.out.println(anagrams("iceman", "anemic"));
        System.out.println(anagrams("servant", "tavern"));
    }

    private static boolean anagrams(String first, String second) {
        if (first.length() != second.length()) return false;

        boolean[] buffer = new boolean[256];
        for (char c : first.toCharArray()) {
            buffer[c] = true;
        }
        for (char c : second.toCharArray()) {
            if (!buffer[c]) {
                return false;
            }
        }
        return true;
    }

}