import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        int len = S.length();

        for (int i = 0; i < len; i++) {
            char c = S.charAt(i);
            switch (c) {
                case 'c':
                    if (i < len - 1 && (S.charAt(i + 1) == '=' || S.charAt(i + 1) == '-')) {
                        i++;
                    }
                    break;
                case 'd':
                    if (i < len - 1) {
                        if (S.charAt(i + 1) == '-') {
                            i++;
                        }
                        else if (i < len - 2 && S.charAt(i + 1) == 'z' && S.charAt(i + 2) == '=') {
                            i += 2;
                        }
                    }
                    break;
                case 'l':
                    if (i < len - 1 && S.charAt(i + 1) == 'j') {
                        i++;
                    }
                    break;
                case 'n':
                    if (i < len - 1 && S.charAt(i + 1) == 'j') {
                        i++;
                    }
                    break;
                case 's':
                    if (i < len - 1 && S.charAt(i + 1) == '=') {
                        i++;
                    }
                    break;
                case 'z':
                    if (i < len - 1 && S.charAt(i + 1) == '=') {
                        i++;
                    }
                    break;
            }
            count++;
        }
        System.out.println(count);
    }
}