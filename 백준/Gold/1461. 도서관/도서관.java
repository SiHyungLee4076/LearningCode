import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] plus = new int[n];
        int[] minus = new int[n];
        int plus_count = 0;
        int minus_count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            max = Math.max(max, Math.abs(k));

            if (k > 0) {
                plus[plus_count++] = k;
            }
            else {
                minus[minus_count++] = Math.abs(k);
            }
        }

        Arrays.sort(plus, 0, plus_count);
        Arrays.sort(minus, 0, minus_count);

        int distance = 0;

        for (int i = plus_count - 1; i >= 0; i -= m) {
            distance += plus[i] * 2;
        }
        for (int i = minus_count - 1; i >= 0; i -= m) {
            distance += minus[i] * 2;
        }

        distance -= max;

        System.out.println(distance);
    }
}