package bronze;

import java.util.Scanner;

public class boj_10871 {
    // X 보다 작은 수
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int num : numbers) {
            if (num < x) {
                System.out.print(num + " ");
            }
        }
    }
}
