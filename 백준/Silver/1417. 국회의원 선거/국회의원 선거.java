import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        int count = 0;

        if (N == 1) {
            System.out.println(0);
            return;
        }

        while (true) {
            int index = 1;
            for (int i = 2; i < N; i++) {
                if (P[i] > P[index]) index = i;
            }

            if (P[0] > P[index]) {
                break;
            }

            P[0]++;
            P[index]--;
            count++;
        }

        System.out.println(count);
    }
}