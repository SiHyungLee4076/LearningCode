import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble(); double y1 = sc.nextDouble();
        double x2 = sc.nextDouble(); double y2 = sc.nextDouble();
        double x3 = sc.nextDouble(); double y3 = sc.nextDouble();
        double x4 = sc.nextDouble(); double y4 = sc.nextDouble();

        double degree = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

        if (degree == 0) {
            System.out.println(0);
        }
        else {
            double px = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / degree;
            double py = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / degree;

            boolean L1 = Math.abs(x1 - x2) >= Math.abs(x1 - px) && Math.abs(x1 - x2) >= Math.abs(x2 - px) && Math.abs(y1 - y2) >= Math.abs(y1 - py) && Math.abs(y1 - y2) >= Math.abs(y2 - py);
            boolean L2 = Math.abs(x3 - x4) >= Math.abs(x3 - px) && Math.abs(x3 - x4) >= Math.abs(x4 - px) && Math.abs(y3 - y4) >= Math.abs(y3 - py) && Math.abs(y3 - y4) >= Math.abs(y4 - py);

            if (L1 && L2) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}