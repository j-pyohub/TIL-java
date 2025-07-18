package ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int n = scanner.nextInt();

        int[][] score = new int[n][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j]+" 점수:");
                score[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int total =0;
            for (int j = 0; j < 3; j++) {
                total+=score[i][j];
            }
            double average = (double) total/3;

            System.out.println((i+1)+"번 학생 점수의 합계: " + total);
            System.out.println((i+1)+"번 학생 점수의 평균: " + average);
        }
    }
}
