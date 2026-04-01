import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            String s = sc.next();
            int count = 0;
            boolean check = true;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(') {
                    count++;
                }
                else {
                    count--;
                }

                if (count < 0) {
                    check = false;
                    break;
                }
            }

            if (count != 0) {
                check = false;
            }

            if (check) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}