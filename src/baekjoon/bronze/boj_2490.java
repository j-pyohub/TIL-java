package bronze;

import java.util.Scanner;

public class boj_2490 {
    //윷놀이
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] result = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                result[i][j] = scanner.nextInt();
            }
        }

        int[] sum = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum[i] += result[i][j];
            }

            if (sum[i] == 0) {
                System.out.println("D");
            } else if (sum[i] == 1) {
                System.out.println("C");
            } else if (sum[i] == 2) {
                System.out.println("B");
            } else if (sum[i] == 3) {
                System.out.println("A");
            } else {
                System.out.println("E");
            }
        }
    }
}
