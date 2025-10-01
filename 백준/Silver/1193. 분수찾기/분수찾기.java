import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int row = 1, col = 1, count = 1;

        while (count < X) {
            if ((row + col) % 2 == 0) {
                if (row == 1) {
                    col++;
                }
                else {
                    row--;
                    col++;
                }
            }
            else {
                if (col == 1) {
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
            count++;
        }

        System.out.println(row + "/" + col);
    }
}