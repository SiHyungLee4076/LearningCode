import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int gcd = gcd(N, M);
        int cut = M - gcd;
        System.out.println(cut);
    }
}