import java.util.ArrayList;
import java.util.List;

public class RemoveDigits {
    public static void main(String[] args) {
        String number = "133235";
        char digit = '3';
        removeDigit(number, digit);
    }

    private static void removeDigit(String number, char digit) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i<number.length();i++) {
            list.add(number.charAt(i));
        }
        System.out.println(list);
        System.out.println(list.indexOf(digit));
    }
}
