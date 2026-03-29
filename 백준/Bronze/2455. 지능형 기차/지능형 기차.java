import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int people = 0;

        for (int i = 0; i < 4; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();

            people = people - out + in;

            if (people > max) {
                max = people;
            }
        }

        System.out.println(max);
    }
}