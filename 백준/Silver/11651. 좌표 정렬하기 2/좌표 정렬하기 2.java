import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = (long)(y + 100000) * 200001 + (x + 100000);
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            long y = arr[i] / 200001 - 100000;
            long x = arr[i] % 200001 - 100000;
            System.out.println(x + " " + y);
        }
    }
}