package new_again.day08_210114_70;

public class day08_70 {
    public static int climbStairs(int n) {
        if(n <= 1)
            return n;
        int[] dp = new int[3];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            int index = dp[1]+dp[2];
            dp[1] = dp[2];
            dp[2] = index;
        }
        return dp[2];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
