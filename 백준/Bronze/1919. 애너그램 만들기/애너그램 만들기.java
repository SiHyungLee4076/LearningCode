import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            arr1[word1.charAt(i) - 97]++;
        }

        for (int i = 0; i < word2.length(); i++) {
            arr2[word2.charAt(i) - 97]++;
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            count += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println(count);
    }
}