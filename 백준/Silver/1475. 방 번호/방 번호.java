import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();

        int[] room = new int[10];

        for (int i = 0; i < N.length(); i++) {
            int num = N.charAt(i) - 48;
            room[num]++;
        }

        int check = (room[6] + room[9] + 1) / 2;
        room[6] = check;
        room[9] = check;

        int set = 0;
        for (int i = 0; i < 10; i++) {
            if (room[i] > set) {
                set = room[i];
            }
        }

        System.out.println(set);
    }
}