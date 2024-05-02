public class PlusOne {
    public static void main(String[] args) {
        System.out.println("leetcode : 66");
        int[] digits = {9};
        int[] result = plusOne(digits);
        for (int i = 0; i< result.length;i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] plusOne(int[] digits) {
        int length = digits.length;

        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[length + 1];
        result[0] = 1;
        return result;
    }
}
