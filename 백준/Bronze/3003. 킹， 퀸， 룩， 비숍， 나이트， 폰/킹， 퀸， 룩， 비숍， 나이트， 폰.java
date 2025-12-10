import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = { 1, 1, 2, 2, 2, 8 };
        int[] arr2 = new int[6];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] - arr2[i]);
            if (i < arr1.length - 1) {
                System.out.print(" ");
            }
        }
    }
}