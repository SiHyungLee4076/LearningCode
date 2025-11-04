import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int chicken = n;
            int coupon = n;

            while (coupon >= k) {
                int add = coupon / k;
                chicken += add;
                int remain = coupon % k;
                coupon = remain + add;
            }

            System.out.println(chicken);
        }
    }
}