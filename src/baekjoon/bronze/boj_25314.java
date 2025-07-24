package bronze;

import java.util.Scanner;

public class boj_25314 {
    //코딩은 체육과목입니다
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = n / 4;

        for (int i = 0; i < count; i++) {
            System.out.print("long ");
        }

        System.out.println("int");
    }
}
