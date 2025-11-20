import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();

        int min = Math.abs(A - B);

        for (int i = 0; i < N; i++) {
            int fav = sc.nextInt();
            int press = 1 + Math.abs(fav - B);
            min = Math.min(min, press);
        }

        System.out.println(min);
    }
}