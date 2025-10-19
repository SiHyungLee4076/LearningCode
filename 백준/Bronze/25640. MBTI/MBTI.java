import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mbti1 = sc.nextLine();
        int N = sc.nextInt();
        sc.nextLine();

        int count = 0;

        for (int i = 0; i < N; i++) {
            String mbti2 = sc.nextLine();

            if (mbti1.equals(mbti2)) {
                count++;
            }
        }

        System.out.println(count);
    }
}