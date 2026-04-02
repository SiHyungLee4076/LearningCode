import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] name = new String[n];
        int[] day = new int[n];
        int[] month = new int[n];
        int[] year = new int[n];

        int young = 0, old = 0;

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            day[i] = sc.nextInt();
            month[i] = sc.nextInt();
            year[i] = sc.nextInt();

            if (year[i] > year[young] || (year[i] == year[young] && month[i] > month[young]) || (year[i] == year[young] && month[i] == month[young] && day[i] > day[young])) {
                young = i;
            }

            if (year[i] < year[old] || (year[i] == year[old] && month[i] < month[old]) || (year[i] == year[old] && month[i] == month[old] && day[i] < day[old])) {
                old = i;
            }
        }

        System.out.println(name[young]);
        System.out.println(name[old]);
    }
}