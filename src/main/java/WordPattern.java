import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(isMatch("abab", "dog dog fox fox"));

    }

    public static boolean isMatch(String pattern, String s) {
        String[] words = s.split("\\s+");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> mapMatch = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char letter = pattern.charAt(i);
            if (mapMatch.containsKey(letter)) {
                if (!mapMatch.get(letter).equals(words[i])) {
                    return false;
                }
            } else {
                if (mapMatch.containsValue(words[i])) {
                    return false;
                }
                mapMatch.put(letter, words[i]);
            }
        }
        return true;
    }
}
