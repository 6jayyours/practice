import java.util.Stack;

public class GreatString {
    public static void main(String[] args) {
        String s= "s";
        System.out.println(makeGood(s));

    }
    public static String makeGood(String s) {
        Stack<Character> result = new Stack<>();
        for(char c : s.toCharArray()) {
            if(!result.isEmpty() && Math.abs(c - result.peek()) == 32) {
                result.pop();
            } else {
                result.push(c);
            }
        }
        StringBuilder abc = new StringBuilder();
        for(Character c : result) {
            abc.append(c);
        }
        return abc.toString();
    }
}
