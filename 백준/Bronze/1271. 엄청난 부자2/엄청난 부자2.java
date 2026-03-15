import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger total = sc.nextBigInteger();
        BigInteger num = sc.nextBigInteger();

        BigInteger money = total.divide(num);
        BigInteger change = total.remainder(num);

        System.out.println(money);
        System.out.println(change);
    }
}