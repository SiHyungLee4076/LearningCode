import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] dp = new int[1000001];
        int MOD = 15746;

        dp[0] = 0;
        dp[1] = 1;

        if (N >= 2) {
            dp[2] = 2;
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        System.out.println(dp[N]);
    }
}