import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int k = 1;

        while (n > 0) {
            if (k > n) {
                k = 1;
            }
            n -= k;
            k++;
            count++;
        }

        System.out.println(count);
    }
}