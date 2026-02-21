import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int edge1 = sc.nextInt();
            int edge2 = sc.nextInt();
            int edge3 = sc.nextInt();

            if (edge1 == 0 && edge2 == 0 && edge3 == 0) {
                break;
            }

            int max = edge1;
            int side1 = edge2;
            int side2 = edge3;

            if (edge2 > max) {
                max = edge2;
                side1 = edge1;
                side2 = edge3;
            }

            if (edge3 > max) {
                max = edge3;
                side1 = edge1;
                side2 = edge2;
            }

            if (side1 * side1 + side2 * side2 == max * max) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
        }
    }
}