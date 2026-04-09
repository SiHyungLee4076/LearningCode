import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 1000000000;
        boolean check = false;

        for(int i = 0; i < 7; i++) {
            int n = sc.nextInt();
            if (n % 2 != 0) {
                sum += n;
                if (n < min) {
                    min = n;
                }
                check = true;
            }
        }

        if (!check) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}