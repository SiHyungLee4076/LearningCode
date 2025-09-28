import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int[] A = new int[11];
            for (int i = 1; i <= 10; i++) {
                A[i] = sc.nextInt();
            }

            for (int i = 1; i <= 9; i++) {
                for (int j = i + 1; j <= 10; j++) {
                    if (A[i] < A[j]) {
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                    }
                }
            }

            System.out.println(A[3]);
        }
    }
}