import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double result1 = (A * B) / C;
        double result2 = (A / B) * C;
        double result3 = A * (B / C);
        double result4 = A / (B * C);

        double max = result1;

        if (max < result2) {
            max = result2;
        }

        if (max < result3) {
            max = result3;
        }

        if (max < result4) {
            max = result4;
        }

        System.out.println((int) max);
    }
}