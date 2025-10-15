import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] file = new int[N];
        for (int i = 0; i < N; i++) {
            file[i] = scanner.nextInt();
        }

        int cluster = scanner.nextInt();
        long total = 0;

        for (int i = 0; i < N; i++) {
            int fileSize = file[i];
            int num = fileSize / cluster;
            if (fileSize % cluster != 0) {
                num += 1;
            }
            total += num * cluster;
        }

        System.out.println(total);
    }
}