import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int R = H / 2;
        int cx1 = X;
        int cy1 = Y + R;
        int cx2 = X + W;
        int cy2 = Y + R;

        int count = 0;

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int px = Integer.parseInt(st.nextToken());
            int py = Integer.parseInt(st.nextToken());

            boolean inside = false;

            if (px >= X && px <= X + W && py >= Y && py <= Y + H) {
                inside = true;
            }
            else {
                int dx1 = px - cx1;
                int dy1 = py - cy1;
                if (dx1 * dx1 + dy1 * dy1 <= R * R) {
                    inside = true;
                }

                int dx2 = px - cx2;
                int dy2 = py - cy2;
                if (dx2 * dx2 + dy2 * dy2 <= R * R) {
                    inside = true;
                }
            }

            if (inside) {
                count++;
            }
        }

        System.out.println(count);
    }
}
