import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpecialCharacters {
    public static void main(String[] args) {
        String word = "BBbab";
        numberOfSpecialChars(word);
    }

    private static void numberOfSpecialChars(String word) {
        int result = 0;
        Set<Character> upper = new HashSet<>();
        Set<Character> lower = new HashSet<>();
        for(int i = 0; i < word.length(); i++) {
            if(Character.isLowerCase(word.charAt(i))) {
                lower.add(word.charAt(i));
            } else {
                upper.add(word.charAt(i));
            }
        }
        Set<Character> smallerList = lower.size() < upper.size() ? lower : upper;

        // Check for corresponding opposite case in the other list
        for (Character c: smallerList) {
            if(smallerList == lower) {
                if(upper.contains(Character.toUpperCase(c))) {
                    result++;
                }
            } else {
                if(lower.contains(Character.toLowerCase(c))) {
                    result++;
                }
            }
        }
        System.out.println(result);

    }
}
