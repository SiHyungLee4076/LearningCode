import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[][] visited = new boolean[M][N];

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x = 0, y = 0, dir = 0;
        int turn = 0;
        int count = 1;

        visited[x][y] = true;

        while (count < M * N) {
            int X = x + dx[dir];
            int Y = y + dy[dir];

            if (X < 0 || Y < 0 || X >= M || Y >= N || visited[X][Y]) {
                dir = (dir + 1) % 4;
                turn++;
            }
            else {
                x = X;
                y = Y;
                visited[x][y] = true;
                count++;
            }
        }

        System.out.println(turn);
    }
}