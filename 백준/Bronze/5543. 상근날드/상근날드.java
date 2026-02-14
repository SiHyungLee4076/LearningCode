import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] burger = new int[3];
        int[] drink = new int[2];

        for (int i = 0; i < 3; i++) {
            burger[i] = sc.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            drink[i] = sc.nextInt();
        }

        int choice1 = burger[0];
        int choice2 = drink[0];
        int temp1, temp2 = 0;

        for (int i = 1; i < 3; i++) {
            temp1 = burger[i];
            if (temp1 < choice1) {
                choice1 = temp1;
            }
        }

        for (int i = 1; i < 2; i++) {
            temp2 = drink[i];
            if (temp2 < choice2) {
                choice2 = temp2;
            }
        }

        int set = choice1 + choice2 - 50;

        System.out.println(set);
    }
}