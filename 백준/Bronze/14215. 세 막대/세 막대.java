import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        int sum = b + c;
        
        if(b > max) {
            max = b;
            sum = a + c;
        }
        if(c > max) {
            max = c;
            sum = a + b;
        }

        if(max >= sum) {
            max = sum - 1;
        }

        int result = max+sum;

        System.out.println(result);
    }
}