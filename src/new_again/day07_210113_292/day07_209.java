package new_again.day07_210113_292;

public class day07_209 {
    /*F(0) = 0，F(1) = 1
      F(n) = F(n - 1) + F(n - 2)，其中 n > 1*/
    public static int fib(int N) {
        if(N<=1)
            return N;
        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            int sum = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = sum;
        }
        return dp[1];
    }

    public static void main(String[] args) {
        //fib(5);
        System.out.println(fib(5));
    }

}
