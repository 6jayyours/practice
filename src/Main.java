public class Main {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;

        StringBuilder out = new StringBuilder();

        int k = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            int j = i;
            while (j < s.length()) {
                out.append(s.charAt(j));
                if (i != 0 && i != numRows - 1) {
                    int temp = j + k - 2 * i;
                    if (temp < s.length())
                        out.append(s.charAt(temp));
                }
                j += k;
            }
        }
        String a = out.toString();
    }
}
