package bronze;

import java.util.Scanner;

public class boj_27866 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int num = scanner.nextInt();

        System.out.println(word.charAt(num-1));
    }
}
