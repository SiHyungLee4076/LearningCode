import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int digits = 1;
        int start = 1;
        int count = 0;

        while (N >= start * 10) {
            int end = start * 10 - 1;
            count += (end - start + 1) * digits;
            start *= 10;
            digits++;
        }

        count += (N - start + 1) * digits;

        System.out.println(count);
    }
}