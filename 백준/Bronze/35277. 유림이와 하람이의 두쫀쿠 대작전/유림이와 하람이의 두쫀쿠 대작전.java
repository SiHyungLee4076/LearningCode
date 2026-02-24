import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        int ingredient1 = 900;
        int ingredient2 = 60;
        int ingredient3 = 600;
        int ingredient4 = 170;
        int ingredient5 = 160;
        int ingredient6 = 110;
        int price = ingredient1 + ingredient2 + ingredient3 + ingredient4 + ingredient5 + ingredient6;
        long result = (long)(money / (long)price);
        System.out.println(result);
    }
}