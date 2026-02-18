import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for (int j = 0; j < M; j++) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            while (m < n) {
                int temp = arr[m];
                arr[m] = arr[n];
                arr[n] = temp;
                m++;
                n--;
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}