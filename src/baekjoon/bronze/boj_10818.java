package bronze;

import java.util.Scanner;

public class boj_10818 {
    //최소, 최대
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0], min = numbers[0];
        for (int i = 0; i < count; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }

        }
        System.out.print(min + " " + max);
    }
}
