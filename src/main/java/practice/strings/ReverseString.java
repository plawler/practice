package practice.strings;

/**
 * Created with IntelliJ IDEA.
 * User: plawler
 * Date: 9/2/13
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReverseString {

    public static void main(String[] args) {
        String s = "reversed";
        System.out.println(reverse(s));
        System.out.println(reverseInPlace(s.toCharArray()));
    }

    private static char[] reverseInPlace(char[] chars) {
        int right = 0;
        int left = chars.length - 1;
        while ( left >= (chars.length/2) ) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            right++;
            left--;
        }
        return chars;
    }

    private static String reverse(String reverse) {
        char[] reversed = new char[reverse.length()];

        int startIndex = reverse.length() - 1;
        int currentIndex = startIndex;
        while (currentIndex >= 0) {
            reversed[(startIndex) - currentIndex] = reverse.charAt(currentIndex);
            currentIndex--;
        }

        return new String(reversed);
    }

}
