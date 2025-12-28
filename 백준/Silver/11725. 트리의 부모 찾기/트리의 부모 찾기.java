import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g[a].add(b);
            g[b].add(a);
        }

        int[] p = new int[n + 1];
        boolean[] v = new boolean[n + 1];

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        v[1] = true;

        while (!q.isEmpty()) {
            int c = q.poll();

            for (int i = 0; i < g[c].size(); i++) {
                int next = g[c].get(i);
                if (!v[next]) {
                    v[next] = true;
                    p[next] = c;
                    q.offer(next);
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            System.out.println(p[i]);
        }
    }
}