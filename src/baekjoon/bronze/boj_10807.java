package bronze;

import javax.swing.*;
import java.util.Scanner;

public class boj_10807 {
    public static void main(String[] args) {
        // 개수 세기
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();

        int count = 0;
        for (int num : number) {
            if (num == v) {
                count++;
            }
        }
        System.out.println(count);


    }


}
