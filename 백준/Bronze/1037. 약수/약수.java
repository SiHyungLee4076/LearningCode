import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] divisors = new int[num];

        for (int i = 0; i < num; i++) {
            divisors[i] = sc.nextInt();
        }

        Arrays.sort(divisors);

        int small = divisors[0];
        int big = divisors[num - 1];

        int N = small * big;

        System.out.println(N);
    }
}