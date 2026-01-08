import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        char[][] star = new char[N][N];

        for (int i = 0; i < N; i++) {
            Arrays.fill(star[i], '*');
        }

        for (int size = N; size >= 3; size /= 3) {
            int step = size / 3;
            for (int i = 0; i < N; i += size) {
                for (int j = 0; j < N; j += size) {
                    for (int x = i + step; x < i + 2 * step; x++) {
                        for (int y = j + step; y < j + 2 * step; y++) {
                            star[x][y] = ' ';
                        }
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(star[i]);
            bw.newLine();
        }

        bw.flush();
    }
}