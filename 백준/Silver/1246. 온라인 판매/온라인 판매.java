import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();

        int[] p = new int[M];

        for (int i = 0; i < M; i++) {
            p[i] = s.nextInt();
        }

        Arrays.sort(p);

        long max = 0;
        int best = 0;

        for (int i = 0; i < M; i++) {
            int price = p[i];

            int potential = M - i;

            int count;

            if (potential < N) {
                count = potential;
            }
            else {
                count = N;
            }

            long profit = (long)price * count;

            if (profit > max) {
                max = profit;
                best = price;
            }
        }

        System.out.printf("%d %d\n", best, max);
    }
}