import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        if (N == 0) {
            System.out.print(0);
            return;
        }

        char[] result = new char[32];
        int index = 0;

        while (N > 0) {
            int r = N % B;

            if (r < 10) {
                result[index++] = (char) ('0' + r);
            }
            else {
                result[index++] = (char) ('A' + (r - 10));
            }

            N /= B;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
    }
}