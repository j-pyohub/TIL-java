package bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class boj_1271 {
    //엄청난 부자2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = new BigInteger(scanner.next());
        BigInteger m = new BigInteger(scanner.next());

        System.out.println(n.divide(m));  // 몫
        System.out.println(n.remainder(m));  // 나머지
    }
}
