import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            if (N == 0) {
                break;
            }

            int[] candy = new int[N];

            for (int i = 0; i < N; i++) {
                candy[i] = sc.nextInt();
                if (candy[i] % 2 == 1) {
                    candy[i]++;
                }
            }

            int count = 0;

            while (true) {
                boolean b = true;
                for (int i = 1; i < N; i++) {
                    if (candy[i] != candy[0]) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    break;
                }

                count++;

                int[] temp = new int[N];

                for (int i = 0; i < N; i++) {
                    int half = candy[i] / 2;
                    candy[i] -= half;
                    temp[(i + 1) % N] = half;
                }

                for (int i = 0; i < N; i++) {
                    candy[i] += temp[i];
                }

                for (int i = 0; i < N; i++) {
                    if (candy[i] % 2 == 1) {
                        candy[i]++;
                    }
                }
            }

            System.out.println(count + " " + candy[0]);
        }
    }
}