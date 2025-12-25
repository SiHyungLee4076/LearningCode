import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        int count = 0;

        long[] stack = new long[2048];
        int top = 0;

        stack[top++] = 4;
        stack[top++] = 7;

        while (top > 0) {

            long num = stack[--top];

            if (num > B) {
                continue;
            }

            if (num >= A) {
                count++;
            }

            long next4 = num * 10 + 4;
            long next7 = num * 10 + 7;

            if (next4 <= B) {
                stack[top++] = next4;
            }

            if (next7 <= B) {
                stack[top++] = next7;
            }
        }

        System.out.println(count);
    }
}