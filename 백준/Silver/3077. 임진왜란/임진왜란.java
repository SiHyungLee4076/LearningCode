import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] correct = new String[N];

        for (int i = 0; i < N; i++) {
            correct[i] = sc.next();
        }

        int[] order = new int[N];

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            for (int j = 0; j < N; j++) {
                if (s.equals(correct[j])) {
                    order[i] = j;
                    break;
                }
            }
        }

        int count = 0;
        int total = N * (N - 1) / 2;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (order[i] < order[j]) {
                    count++;
                }
            }
        }

        System.out.printf("%d/%d", count, total);
    }
}