package bronze;

import java.util.Scanner;

public class boj_9086 {
    //문자열
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        scanner.nextLine();
        String[] stringArray = new String[test];

        for (int i = 0; i < test; i++) {
            stringArray[i] = scanner.nextLine();
        }

        for (int i = 0; i < test; i++) {
            System.out.print(stringArray[i].charAt(0));
            System.out.println(stringArray[i].charAt(stringArray[i].length()-1));
        }
    }
}
