import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] students = new boolean[31];

        for (int i = 1; i < students.length - 2; i++) {
            int n = sc.nextInt();
            students[n] = true;
        }

        for (int i = 1; i < students.length; i++) {
            if (!students[i]) {
                System.out.println(i);
            }
        }
    }
}