import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int dist1 = x, dist2 = y, dist3 = w - x, dist4 = h - y;

        int min = dist1;
        if (dist2 < min) {
            min = dist2;
        }
        if (dist3 < min) {
            min = dist3;
        }
        if (dist4 < min) {
            min = dist4;
        }

        System.out.println(min);
    }
}