import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] unit = new int[M];
        int[] pack = new int[M];

        for (int i = 0; i < M; i++) {
            pack[i] = sc.nextInt();
            unit[i] = sc.nextInt();
        }

        Arrays.sort(unit);
        Arrays.sort(pack);

        int min = Integer.MAX_VALUE;

        int mix = (N / 6) * pack[0] + (N % 6) * unit[0];
        if (mix < min) {
            min = mix;
        }

        int full = ((N / 6) + 1) * pack[0];
        if (full < min) {
            min = full;
        }

        int Single = N * unit[0];
        if (Single < min) {
            min = Single;
        }

        System.out.println(min);
    }
}