import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] straw = new int[N];

        for (int i = 0; i < N; i++) {
            straw[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(straw);

        int sum = -1;

        for (int i = N - 1; i >= 2; i--) {
            if (straw[i - 2] + straw[i - 1] > straw[i]) {
                sum = straw[i - 2] + straw[i - 1] + straw[i];
                break;
            }
        }

        System.out.println(sum);
    }
}