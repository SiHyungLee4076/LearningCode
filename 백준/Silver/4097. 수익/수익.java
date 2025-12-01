import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            if (N == 0) {
                break;
            }

            int max = -1000000000;
            int total = 0;

            for (int i = 0; i < N; i++) {
                int sale = sc.nextInt();

                total += sale;

                int temp = max;
                if (total > temp) {
                    temp = total;
                }
                max = temp;

                if (total < 0) {
                    total = 0;
                }
            }

            System.out.println(max);
        }
    }
}