import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            boolean[] arr = new boolean[26];

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (!arr[c - 'a']) {
                    arr[c - 'a'] = true;
                }
                else if (j > 0 && c != str.charAt(j - 1)) {
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}