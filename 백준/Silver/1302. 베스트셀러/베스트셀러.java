import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String[] books = new String[N];

        for (int i = 0; i < N; i++) {
            books[i] = sc.nextLine();
        }

        Arrays.sort(books);

        String best = books[0];
        int max = 0, count = 1;

        for (int i = 1; i < N; i++) {
            if (books[i].equals(books[i - 1])) {
                count++;
            }
            else {
                if (count > max) {
                    max = count;
                    best = books[i - 1];
                }
                count = 1;
            }
        }

        if (count > max) {
            best = books[N - 1];
        }

        System.out.println(best);
    }
}