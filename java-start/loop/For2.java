package loop;

public class For2 {

    public static void main(String[] args) {

        // for문으로 1부터 endNum까지 더하기
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
        }
    }
}
