package practice.strings;

/**
 * Created with IntelliJ IDEA.
 * User: paul
 * Date: 9/11/13
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Encode {

    public static void main(String[] args) {
        String url = "/fo o/b ar";
        System.out.println(encode(url));
    }

    private static String encode(String url) {
        final char[] replacement = new char[] {'%', '2', '0'};
        char[] origin = url.toCharArray();
        char[] buffer = new char[origin.length * 2];

        int offset = 0;
        for (int i = 0; i < origin.length; i++) {
            if (origin[i] == ' ') {
                for (int j = 0; j < replacement.length; j++) {
                    buffer[i+offset+j] = replacement[j];
                }
                offset += replacement.length-1;
            } else {
                buffer[i+offset] = origin[i];
            }
        }

        return new String(buffer);
    }

}
