import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int opt1 = 0;
        int opt2 = 0;

        for (int i = 0; i < N; i++) {
            int time = sc.nextInt();
            opt1 += (time / 30 + 1) * 10;
            opt2 += (time / 60 + 1) * 15;
        }

        if (opt1 < opt2) {
            System.out.println("Y " + opt1);
        }
        else if (opt2 < opt1) {
            System.out.println("M " + opt2);
        }
        else {
            System.out.println("Y M " + opt1);
        }
    }
}