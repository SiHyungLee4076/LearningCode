import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int min_x = x[0];
        int max_x = x[0];
        int min_y = y[0];
        int max_y = y[0];

        for (int i = 1; i < n; i++) {
            if (x[i] < min_x) {
                min_x = x[i];
            }
            if (x[i] > max_x) {
                max_x = x[i];
            }
            if (y[i] < min_y) {
                min_y = y[i];
            }
            if (y[i] > max_y) {
                max_y = y[i];
            }
        }

        int area;

        if (n == 1) {
            area = 0;
        }
        else {
            area = (max_x - min_x) * (max_y - min_y);
        }

        System.out.println(area);
    }
}