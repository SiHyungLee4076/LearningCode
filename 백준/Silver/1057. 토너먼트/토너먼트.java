import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int player1 = sc.nextInt();
        int player2 = sc.nextInt();
        int round = 0;

        while(player1 != player2) {
            player1 = player1/2 + player1%2;
            player2 = player2/2 + player2%2;
            round++;
        }

        System.out.println(round);
    }
}