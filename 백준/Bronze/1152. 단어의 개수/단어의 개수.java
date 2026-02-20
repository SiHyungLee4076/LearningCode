import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        boolean b = false;
        
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != ' ') {
                if (!b) {
                    count++;
                    b = true;
                }
            }
            else {
                b = false;
            }
        }
        System.out.println(count);
    }
}