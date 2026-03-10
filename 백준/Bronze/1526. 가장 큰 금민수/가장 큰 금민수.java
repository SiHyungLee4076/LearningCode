import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = N; i >= 4; i--) {
            String s = String.valueOf(i);
            boolean check = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c != '4' && c != '7') {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(i);
                break;
            }
        }
    }
}