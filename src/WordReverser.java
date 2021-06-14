/**
 * @author 1972002 Kevin Juan
 */
public class WordReverser {
    public static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return sb.toString();
    }
}
