import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int n;

        if (C <= B) {
            n = -1;
        }
        else {
            n = A / (C - B) + 1;
        }
        System.out.println(n);
    }
}