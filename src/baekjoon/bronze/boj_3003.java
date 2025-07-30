package bronze;

import java.util.Scanner;

public class boj_3003 {
    //킹, 퀸, 룩, 비숍, 나이트, 폰
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] chess = new int[6];
        int[] chessOrigin = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            chess[i] = scanner.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(chessOrigin[i] - chess[i]);
            if (i != 5) {
                System.out.print(" ");
            }
        }
    }
}
