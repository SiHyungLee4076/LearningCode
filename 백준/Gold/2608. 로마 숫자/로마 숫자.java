import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("M", 1000);
        hashmap.put("CM", 900);
        hashmap.put("D", 500);
        hashmap.put("CD", 400);
        hashmap.put("C", 100);
        hashmap.put("XC", 90);
        hashmap.put("L", 50);
        hashmap.put("XL", 40);
        hashmap.put("X", 10);
        hashmap.put("IX", 9);
        hashmap.put("V", 5);
        hashmap.put("IV", 4);
        hashmap.put("I", 1);

        Scanner sc = new Scanner(System.in);
        String r1 = sc.next();
        String r2 = sc.next();
        sc.close();

        int n1 = 0, n2 = 0;

        for (int i = 0; i < r1.length(); i++) {
            int cur = hashmap.get(String.valueOf(r1.charAt(i)));

            if (i + 1 < r1.length()) {
                int next = hashmap.get(String.valueOf(r1.charAt(i + 1)));
                if (cur < next) {
                    n1 += (next - cur);
                    i++;
                    continue;
                }
            }
            n1 += cur;
        }

        for (int i = 0; i < r2.length(); i++) {
            int cur = hashmap.get(String.valueOf(r2.charAt(i)));

            if (i + 1 < r2.length()) {
                int next = hashmap.get(String.valueOf(r2.charAt(i + 1)));
                if (cur < next) {
                    n2 += (next - cur);
                    i++;
                    continue;
                }
            }
            n2 += cur;
        }

        int result1 = n1 + n2;

        String[] sym = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String result2 = "";
        int rem = result1;

        for (int i = 0; i < val.length; i++) {
            while (rem >= val[i]) {
                result2 += sym[i];
                rem -= val[i];
            }
        }

        System.out.println(result1);
        System.out.println(result2);
    }
}