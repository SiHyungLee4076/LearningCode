import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();

        int E = 0;
        int S = 0;
        int M = 0;
        int year = 0;

        while (true) {
            year++;
            E++;
            S++;
            M++;

            if (E == 16) {
                E = 1;
            }
            if (S == 29) {
                S = 1;
            }
            if (M == 20) {
                M = 1;
            }
            if (e == E && s == S && m == M) {
                break;
            }
        }

        System.out.println(year);
    }
}