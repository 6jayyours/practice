import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyboardRow {
    public static void main(String[] args) {
        System.out.println("leetcode : 500");
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(findWords(words));
    }

    private static String[] findWords(String[] words) {
        String[] rowWords = new String[words.length];
        Set<Character> row = new HashSet<>(Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'));
        Set<Character> row2 = new HashSet<>(Set.of('A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'a', 's', 'd', 'g', 'f', 'h', 'j', 'k', 'l'));
        Set<Character> row3 = new HashSet<>(Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'));

        List<String> validWords = new ArrayList<>();

        for (String word : words) {
            boolean valid = true;
            Set<Character> currentRow = null;

            // Check which row the first character of the word belongs to
            char firstChar = word.charAt(0);
            if (row.contains(firstChar) || row.contains(Character.toLowerCase(firstChar)) || row.contains(Character.toUpperCase(firstChar))) {
                currentRow = row;
            } else if (row2.contains(firstChar) || row2.contains(Character.toLowerCase(firstChar)) || row2.contains(Character.toUpperCase(firstChar))) {
                currentRow = row2;
            } else {
                currentRow = row3;
            }

            // Check if all characters of the word belong to the same row
            for (char c : word.toCharArray()) {
                if (!currentRow.contains(c) && !currentRow.contains(Character.toLowerCase(c)) && !currentRow.contains(Character.toUpperCase(c))) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                validWords.add(word);
            }
        }
        String[] result = new String[validWords.size()];
        result = validWords.toArray(result);
        return result;
    }
}
