import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int ball = 1;

        for (int i = 0; i < M; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X < 1 || X > 3 || Y < 1 || Y > 3) {
                ball = -1;
                break;
            }
            if (ball == X) {
                ball = Y;
            }
            else if (ball == Y) {
                ball = X;
            }
        }

        if (ball >= 1 && ball <= 3) {
            System.out.println(ball);
        }
        else {
            System.out.println(-1);
        }
    }
}