import java.util.Stack;

public class GreatString {
    public static void main(String[] args) {
        String s= "s";
        System.out.println(makeGood(s));

    }
    public static String makeGood(String s) {
        int open =0;
        int closed = 0;
        for (char c : s.toCharArray()) {
            if(c == '('){
                open++;
            } else if (c == ')'){
                closed++;
            }
        }
        System.out.println(open+closed);
        return null;
    }
}
