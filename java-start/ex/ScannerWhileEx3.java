package ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0, sum = 0, count = 0;

        while (true) {
            System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
            num = input.nextInt();

            if (num == -1) {
                break;
            }
            sum += num;
            count++;
        }
        double average =  (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
