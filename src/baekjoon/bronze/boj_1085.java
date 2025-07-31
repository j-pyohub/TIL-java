package bronze;

import java.util.Scanner;

public class boj_1085 {
    //직사각형에서 탈출
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[4];

        for (int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextInt();
        }

        int width = numbers[2] - numbers[0];
        int height = numbers[3] - numbers[1];

        int[] answers = {numbers[0], numbers[1], width, height};
        int answer = answers[0];

        for (int i = 0; i < 4; i++) {
            if (answers[i] < answer) {
                answer = answers[i];
            }
        }

        System.out.println(answer);

    }
}
