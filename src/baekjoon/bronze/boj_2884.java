package bronze;

import java.util.Scanner;

public class boj_2884 {
    //알람 시계
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();

        int hour_fix;
        int min_fix;

        if (min >= 45) {
            hour_fix = hour;
            min_fix = min - 45;
        } else {
            if (hour > 0) {
                hour_fix = hour - 1;
                min_fix = min + 15;
            } else {
                hour_fix = 23;
                min_fix = min + 15;
            }

        }

        System.out.print(hour_fix+" "+min_fix);
    }
}
