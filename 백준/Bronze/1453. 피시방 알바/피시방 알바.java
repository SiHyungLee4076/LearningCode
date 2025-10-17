import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] seats = new int[100];
        int count = 0;

        for (int i = 0; i < N; i++) {
            int want = sc.nextInt();

            if (seats[want - 1] == 0) {
                seats[want - 1] = 1;
            }
            else {
                count++;
            }
        }

        System.out.println(count);
    }
}