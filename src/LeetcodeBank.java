public class LeetcodeBank {
    public static void main(String[] args) {
        System.out.println("leetcode : 1716");
        int n = 20;
        int result = totalMoney(n);
        System.out.println(result);
    }

    private static int totalMoney(int n) {
        int money =0;
        int start = 1;
        int i = 1;
        int day = 1;

        while(day<=n) {
            if(day % 7  == 0) {
                money = money + i;
                day++;
                start++;
                i = start;
            }
            if(day<=n) {
                money = money + i;
                i++;
                day++;
            }

        }

        return money;
    }
}
