import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();

            int quarter = C / 25;
            C = C % 25;

            int dime = C / 10;
            C = C % 10;

            int nickel = C / 5;
            C = C % 5;

            int pennie = C;

            System.out.println(quarter + " " + dime + " " + nickel + " " + pennie);
        }
    }
}