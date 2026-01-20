import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int N = in.nextInt();
        int K = in.nextInt();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        int index = 0;

        while (list.size() > 1) {
            index = (index + (K - 1)) % list.size();
            sb.append(list.remove(index)).append(", ");
        }

        sb.append(list.remove(0)).append('>');
        System.out.println(sb);
    }
}