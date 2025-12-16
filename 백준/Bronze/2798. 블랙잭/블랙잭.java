import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] choice = new int[N];
        for (int i = 0; i < N; i++) {
            choice[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = choice[i] + choice[j] + choice[k];
                    if (sum <= M && sum > max) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}