import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        int D = sc.nextInt();

        int time = 0;
        int min = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= L; j++) {
                time++;
            }

            for (int t = 1; t <= 5; t++) {
                if (time % D == 0) {
                    min = time;
                    i = N;
                    break;
                }
                time++;
            }

            if (i == N && min == 0) {
                while (true) {
                    if (time % D == 0) {
                        min = time;
                        break;
                    }
                    time++;
                }
            }
        }

        System.out.println(min);
    }
}