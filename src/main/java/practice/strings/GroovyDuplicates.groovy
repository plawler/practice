package practice.strings

/**
 * Created with IntelliJ IDEA.
 * User: plawler
 * Date: 9/2/13
 * Time: 11:48 AM
 * To change this template use File | Settings | File Templates.
 */
class GroovyDuplicates {

    static def containsDuplicates(String s) {
        def chars = new boolean[256]
        for (c in s.toCharArray()) {
            if (chars[(int)c]) {
                return true
            }
            chars[(int)c] = true
        }
        return false
    }

    public static void main(String[] args) {
        def dupes = ["babe", "dog", "window", "character"]
        dupes.each { s ->
            println "The string '" + s + "'" + (containsDuplicates(s) ? " has":" does not have") + " duplicate characters"
        }
    }

}
