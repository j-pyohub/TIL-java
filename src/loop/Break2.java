package loop;

public class Break2 {

    public static void main(String[] args) {

        // 1부터 숫자를 누적해서 더하다가 합계가 10보타 큰 처음값 구하기
        int sum = 0;
        int i = 1;

        for (;;) {
            sum = sum+i;

            if (sum > 10) {
                System.out.println("i = " + i + " sum = " + sum);
                break;
            }

        }
    }
}
