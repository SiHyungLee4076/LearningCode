import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();

        long result = 0;
        long count = 1;

        while (true) {
            if (distance == 0) {
                break;
            }

            int num = distance % 10;
            distance /= 10;

            if (num > 4) {
                num--;
            }

            result += num * count;
            count *= 9;
        }

        System.out.println(result);
    }
}