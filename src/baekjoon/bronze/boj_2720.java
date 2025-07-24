package bronze;

import java.util.Scanner;

public class boj_2720 {
    //세탁소 사장 동혁
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] nums = new int[count];

        int quarter, dime, nickel, penny;

        for (int i = 0; i < count; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < count; i++) {
            quarter = nums[i] / 25;
            dime = (nums[i] - (25 * quarter)) / 10;
            nickel = (nums[i] - (25 * quarter) - (10 * dime)) / 5;
            penny = nums[i] - 25 * quarter - 10 * dime - 5 * nickel;
            System.out.println(quarter +" "+dime+" "+nickel+" "+penny);
        }
    }
}
