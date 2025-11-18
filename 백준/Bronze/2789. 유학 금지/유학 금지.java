import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] rem = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};

        String str = sc.next();

        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            boolean del = false;

            for (int j = 0; j < rem.length; j++) {
                if (cur == rem[j]) {
                    del = true;
                    break;
                }
            }

            if (!del) {
                res = res + cur;
            }
        }

        System.out.println(res);
    }
}