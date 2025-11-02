import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        int max = Math.max(n, m);
        int min = Math.min(n, m);

        int count = 0;
        int burger = 0;
        int coke = 10000;

        while (t >= max * count) {
            int tempTime = t - max * count;
            int tempBurger = count + tempTime / min;
            int tempCoke = tempTime % min;

            if (tempCoke < coke) {
                burger = tempBurger;
                coke = tempCoke;
            }
            else if (tempCoke == coke && tempBurger > burger) {
                burger = tempBurger;
                coke = tempCoke;
            }

            count++;
        }

        System.out.println(burger + " " + coke);
    }
}