import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int b = sc.nextInt();

        long max = (long)Math.pow(2, b + 1) - 1;

        if (N <= max) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}