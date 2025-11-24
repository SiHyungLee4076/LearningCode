import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < caseCount; i++) {

            int N = Integer.parseInt(br.readLine());
            int temp = N;

            for (int j = 2; j <= N; j++) {
                if (temp % j == 0) {
                    int count = 0;
                    while (temp % j == 0) {
                        temp /= j;
                        count++;
                    }
                    System.out.printf("%d %d\n", j, count);
                }
            }
            if (temp > 1) {
                System.out.printf("%d 1\n", temp);
            }
        }
    }
}