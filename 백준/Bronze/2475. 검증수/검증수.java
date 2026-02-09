import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 5; i++) {
            int k = sc.nextInt();
            total += k * k;
        }

        int result = total % 10;
        System.out.print(result);
    }
}