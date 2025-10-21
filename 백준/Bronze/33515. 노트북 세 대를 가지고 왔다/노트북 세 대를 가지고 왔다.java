import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T1 = scanner.nextInt();
        int T2 = scanner.nextInt();

        if (T1 < T2) {
            System.out.println(T1);
        }
        else {
            System.out.println(T2);
        }
    }
}