import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double result = 0, sum = 0;
        char c;

        for(int i=0; i < 20; i++) {
            double credit = 0;
            double grade = 0;

            String arr[] = sc.nextLine().split(" ");
            credit += Double.parseDouble(arr[1]);
            c = arr[2].charAt(0);

            switch(c) {
                case 'A':
                    if (arr[2].charAt(1) == '+') {
                        grade += 4.5;
                    }
                    else {
                        grade += 4.0;
                    }
                    break;
                case 'B':
                    if (arr[2].charAt(1) == '+') {
                        grade += 3.5;
                    }
                    else {
                        grade += 3.0;
                    }
                    break;
                case 'C':
                    if (arr[2].charAt(1) == '+') {
                        grade += 2.5;
                    }
                    else {
                        grade += 2.0;
                    }
                    break;
                case 'D':
                    if (arr[2].charAt(1) == '+') {
                        grade += 1.5;
                    }
                    else {
                        grade += 1.0;
                    }
                    break;
                case 'F':
                    grade += 0;
                    break;
                case 'P':
                    grade += 0;
                    credit = 0;
                    break;
            }
            sum += credit;
            result += credit * grade;
        }

        double avg = result/sum;
        System.out.println(avg);
    }
}