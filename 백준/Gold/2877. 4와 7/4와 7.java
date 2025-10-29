import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();

        long count = 0;
        long digitCount = 2;
        int N = 1;

        while (true) {
            if (K <= count + digitCount) {
                break;
            }
            count += digitCount;
            digitCount *= 2;
            N++;
        }

        long index = K - count - 1;

        String result = "";

        for (int i = 0; i < N; i++) {
            long remain = index % 2;

            if (remain == 1) {
                result = "7" + result;
            }
            else {
                result = "4" + result;
            }

            index /= 2;
        }

        System.out.println(result);
    }
}