package bronze;

import java.util.Scanner;

public class boj_2480 {
    // 주사위 세개
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fst = scanner.nextInt();
        int snd = scanner.nextInt();
        int trd = scanner.nextInt();

        int prize = 0;

        if (fst == snd && snd == trd) {
            prize = 10000 + fst * 1000;
        } else if (fst == snd || snd == trd) {
            prize = 1000 + snd*100;
        } else if (fst == trd) {
            prize = 1000 + fst * 100;
        } else {
            prize = Math.max(fst, Math.max(snd,trd)) * 100;
        }

        System.out.println(prize);
    }
}
