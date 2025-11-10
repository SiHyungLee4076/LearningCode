import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.next();
            if (s.equals("0")) {
                break;
            }

            int length = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '1') {
                    length += 2;
                }
                else if (c == '0') {
                    length += 4;
                }
                else {
                    length += 3;
                }
            }

            length += s.length()-1;
            length += 2;

            System.out.println(length);
        }

        sc.close();
    }
}