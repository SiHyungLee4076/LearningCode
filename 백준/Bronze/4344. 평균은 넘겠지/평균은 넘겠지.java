import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();

        for(int i = 0; i < C; i++) {
            int N = sc.nextInt();
            int[] scores = new int[N];
            double sum = 0;

            for(int j = 0; j < N; j++) {
                int num = sc.nextInt();
                scores[j] = num;
                sum += num;
            }

            double average = sum / N;
            double count = 0;

            for(int j = 0; j < N; j++) {
                if(scores[j] > average) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", (count / N) * 100);
        }

        sc.close();
    }
}