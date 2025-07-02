package ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int len = input.nextInt();

        int[] numbers = new int[len];
        int total = 0;
        double average;

        System.out.println(len + "개의 정수를 입력하세요");
        for (int i = 0; i < len; i++) {
            numbers[i] = input.nextInt();
            total+= numbers[i];
        }

        average=(double) total/len;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);

    }
}
