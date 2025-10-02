import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] avg = new int[n];

        for (int i = 0; i < n; i++) {
            double d = sc.nextDouble();
            avg[i] = (int)(d * 1000 + 0.5);
        }

        int count = 1;
        
        while (true) {
            boolean k = true;
            for (int i = 0; i < n; i++) {
                int l = (avg[i] * count + 999) / 1000;
                int r = ((avg[i] + 1) * count - 1) / 1000;
                if (l > r) {
                    k = false;
                    break;
                }
            }
            if (k) {
                System.out.println(count);
                break;
            }
            count++;
        }
    }
}