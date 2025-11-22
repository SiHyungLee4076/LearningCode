import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int s = 0; s < N - i; s++) {
                System.out.print(" ");
            }
            for (int s = 0; s < 2 * i - 1; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}