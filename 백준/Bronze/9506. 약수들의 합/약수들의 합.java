import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int N = sc.nextInt();
            if(N == -1) {
                break;
            }
            else {
                int sum = 0;

                for (int i = 1; i < N; i++) {
                    if(N % i == 0) {
                        sum += i;
                    }
                }

                if (sum == N) {
                    System.out.print(N + " = ");
                    int count = 0;
                    for (int i = 1; i < N; i++) {
                        if (N % i == 0) {
                            if(count == 0) {
                                System.out.print(i);
                            }
                            else {
                                System.out.print(" + " + i);
                            }
                            count++;
                        }
                    }
                    System.out.println();
                }
                else {
                    System.out.println(N + " is NOT perfect.");
                }
            }
        }
    }
}