import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int point = 2;
        for (int i = 1; i <= n; i++) {
            point = (point - 1) + point;
        }
        int result = point * point;
        System.out.println(result);
    }
}