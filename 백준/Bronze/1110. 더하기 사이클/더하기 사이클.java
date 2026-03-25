import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int temp = N;
        int count = 0;

        while (true) {
            temp = ((temp % 10) * 10) + ((temp / 10 + temp % 10) % 10);
            count++;

            if (temp == N) {
                break;
            }
        }

        System.out.println(count);
    }
}