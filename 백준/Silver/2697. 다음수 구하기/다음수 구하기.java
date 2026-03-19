import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            String S = sc.next();
            char[] arr = new char[S.length()];

            for(int j = 0; j < S.length(); j++){
                arr[j] = S.charAt(j);
            }

            int n = arr.length;
            int index = n - 2;

            while(index >= 0 && arr[index] >= arr[index + 1]){
                index--;
            }

            if(index < 0){
                System.out.println("BIGGEST");
                continue;
            }

            int j = n - 1;

            while(arr[index] >= arr[j]){
                j--;
            }

            char temp = arr[index];
            arr[index] = arr[j];
            arr[j] = temp;

            int left = index + 1;
            int right = n - 1;
            while(left < right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            System.out.println(arr);
        }
    }
}