import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();

        int[] arr = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            arr[c - 97]++;
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        int count = 0;
        char result = '?';
        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                count++;
                result = (char) (i + 97);
            }
        }

        if (count > 1) {
            System.out.println("?");
        } 
        else {
            System.out.println(Character.toUpperCase(result));
        }
    }
}