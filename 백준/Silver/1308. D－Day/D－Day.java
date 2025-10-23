import java.util.Scanner;

public class Main {

    static int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static int Leap(int year) {
        if (year % 400 == 0) {
            return 1;
        }
        else if (year % 100 == 0) {
            return 0;
        }
        else if (year % 4 == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    static int Days(int year, int month, int day) {
        int totalDays = 0;

        for (int i = 1; i < year; i++) {
            if (Leap(i) == 1) {
                totalDays += 366;
            }
            else {
                totalDays += 365;
            }
        }

        for (int i = 1; i < month; i++) {
            totalDays += months[i - 1];

            if (i == 2 && Leap(year) == 1) {
                totalDays += 1;
            }
        }

        totalDays += day;

        return totalDays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year1 = sc.nextInt();
        int month1 = sc.nextInt();
        int day1 = sc.nextInt();
        int year2 = sc.nextInt();
        int month2 = sc.nextInt();
        int day2 = sc.nextInt();

        if (year2 > year1 + 1000) {
            System.out.println("gg");
            return;
        }
        else if (year2 == year1 + 1000) {
            if (month2 > month1) {
                System.out.println("gg");
                return;
            }
            else if (month2 == month1 && day2 >= day1) {
                System.out.println("gg");
                return;
            }
        }

        int totalDay1 = Days(year1, month1, day1);
        int totalDay2 = Days(year2, month2, day2);

        int day = totalDay2 - totalDay1;

        System.out.println("D-" + day);
    }
}