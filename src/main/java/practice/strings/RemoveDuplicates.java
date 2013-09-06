package practice.strings;

/**
 * Created with IntelliJ IDEA.
 * User: plawler
 * Date: 9/6/13
 * Time: 11:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        char[] dupes = "fuzzzyyybear".toCharArray();
        removeDuplicates2(dupes);
        System.out.println(new String(dupes));
    }

    private static void removeDuplicates2(char[] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                if (str[j] == str[i]) {
                    str[j] = 0;
                }
            }
        }
    }

}
