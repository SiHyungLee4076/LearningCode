import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        for (int i = 97; i <= 122; i++) {
            int position = -1;

            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == (char)i) {
                    position = j;
                    break;
                }
            }

            System.out.print(position + " ");
        }
    }
}