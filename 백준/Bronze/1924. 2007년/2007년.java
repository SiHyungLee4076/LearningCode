import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        int count = 0;

        for (int i = 0; i < x - 1; i++) {
            count += months[i];
        }

        count += y;
        int k = (count - 1) % 7;

        System.out.println(weeks[k]);
    }
}