import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
        }

        int x = -1, y = -1;

        for (int i = 0; i < 8 && x == -1; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - num[i] - num[j] == 100) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        int r1 = num[x];
        int r2 = num[y];

        Arrays.sort(num);

        boolean removed1 = false;
        boolean removed2 = false;

        for (int i = 0; i < 9; i++) {
            if (!removed1 && num[i] == r1) {
                removed1 = true;
                continue;
            }
            if (!removed2 && num[i] == r2) {
                removed2 = true;
                continue;
            }
            System.out.println(num[i]);
        }
    }
}