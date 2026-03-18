import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String S = sc.nextLine();

            if (S.equals("#")) {
                break;
            }

            char C = Character.toLowerCase(S.charAt(0));
            int count = 0;

            for (int i = 2; i < S.length(); i++) {
                if (Character.toLowerCase(S.charAt(i)) == C) {
                    count++;
                }
            }

            System.out.println(C + " " + count);
        }
    }
}