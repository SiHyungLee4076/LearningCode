import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String car = sc.nextLine();
            String[] parts = car.split("-");

            String letters = parts[0];
            String numbers = parts[1];

            int value1 = 0;
            for (int j = 0; j < 3; j++) {
                value1 = value1 * 26 + (letters.charAt(j) - 65);
            }

            int value2 = Integer.parseInt(numbers);

            if ((value1 - value2) <= 100 && (value1 - value2) >= -100) {
                System.out.println("nice");
            }
            else {
                System.out.println("not nice");
            }
        }
    }
}