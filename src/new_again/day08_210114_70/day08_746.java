package new_again.day08_210114_70;

public class day08_746 {
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[2];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int dpi = Integer.min(dp[0],dp[1])+cost[i];
            dp[0] = dp[1];
            dp[1] = dpi;
        }
        return Integer.min(dp[0],dp[1]);
    }

    public static void main(String[] args) {
        int arr[] = {10, 15, 20};
        System.out.println(minCostClimbingStairs(arr));
    }
}
