import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String S = sc.next();
            int score = 0;
            int count = 0;
            
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == 'O') {
                    count++;
                    score += count;
                }
                else {
                    count = 0;
                }
            }
            System.out.println(score);
        }
    }
}
