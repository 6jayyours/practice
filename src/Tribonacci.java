public class Tribonacci {
    public static void main(String[] args) {
        System.out.println("leetcode : 1137");
        int n = 25;
        int result = tribonacci(n);
        System.out.println(result);
    }

    private static int tribonacci(int n) {
        if(n==0) { //first tribonacci
            return 0;
        } else if (n == 1 || n==2) { //
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }
}
