public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("leetcode : 7");
        int x = -123;
        System.out.println(reverse(x));
    }



        public static int reverse(int x) {
            int reverse = 0;
            while( x != 0 ){
                if(reverse>Integer.MAX_VALUE/10 || reverse<Integer.MIN_VALUE/10) {
                    return 0;
                }
                int digit = x % 10;
                reverse = reverse * 10 + digit;
                x = x / 10;
            }
            return reverse;
        }
}
