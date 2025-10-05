import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        String[] inputA = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(inputA[i]);
        }

        String[] inputB = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arrB[i] = Integer.parseInt(inputB[i]);
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int S = 0;
        for (int i = 0; i < n; i++) {
            S += arrA[i] * arrB[n - 1 - i];
        }

        System.out.println(S);
    }
}