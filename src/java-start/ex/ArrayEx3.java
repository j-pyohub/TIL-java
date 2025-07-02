package ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력:");

        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
