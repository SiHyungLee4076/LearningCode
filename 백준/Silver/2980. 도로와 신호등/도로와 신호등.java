import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();

        int[][] arr = new int[N][3];

        for(int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        int time = 0;
        int position = 0;

        for(int i = 0; i < N; i++) {
            int D = arr[i][0];
            int R = arr[i][1];
            int G = arr[i][2];

            time += (D - position);
            position = D;

            int cycle = R + G;
            int timeInCycle = time % cycle;

            if (timeInCycle < R) {
                int wait = R - timeInCycle;
                time += wait;
            }
        }

        time += (L - position);

        System.out.println(time);
    }
}